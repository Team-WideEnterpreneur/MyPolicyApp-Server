package com.dataproject.mydata.service;

import com.dataproject.mydata.model.ApplicationModel;
import com.dataproject.mydata.repository.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ApplicationService {
    @Autowired
    private ApplicationRepository applicationRepository;

    public void createApplication(ApplicationModel applicationModel) {
        applicationRepository.save(applicationModel);
    }

    public List<String> getApplication(long userId) {
        List<ApplicationModel> applicationModels=applicationRepository.findAllByUserId(userId);
        List<String> applications=applicationModels.stream().map(applicationModel
                -> {return applicationModel.getPoliName();}).collect(Collectors.toList());
        return applications;
    }
}
