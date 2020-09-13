package com.dataproject.mydata.service;

import com.dataproject.mydata.model.PolicyModel;
import com.dataproject.mydata.model.UserModel;
import com.dataproject.mydata.repository.PolicyRepository;
import com.dataproject.mydata.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PolicyRepository policyRepository;

    public void createUser(UserModel userModel) {
        userRepository.save(userModel);
    }

    public UserModel getUser(long id) {
        return userRepository.findByUserId(id);
    }

    public List<PolicyModel> getPosiblePolicy(long id) {
        UserModel userModel=userRepository.findByUserId(id);
        List<PolicyModel> policyModels=policyRepository.findAll();
        List<PolicyModel> judgeList=new ArrayList<>();
        for(PolicyModel policyModel:policyModels){
            if(userModel.getAge()>=policyModel.getMinAge()&&userModel.getAge()<=policyModel.getMaxAge())
                judgeList.add(policyModel);
            if(userModel.getWrkStat().equals(policyModel.getWrkStat()))
                judgeList.add(policyModel);
            if(userModel.getUsrStat().equals(policyModel.getUsrStat()))
                judgeList.add(policyModel);
            if(userModel.getIncome().equals(policyModel.getIncome()))
                judgeList.add(policyModel);
            if(userModel.getPerStat().equals(policyModel.getPerStat()))
                judgeList.add(policyModel);
            if(userModel.getGrade().equals(policyModel.getGrade()))
                judgeList.add(policyModel);
            if(userModel.getCredit().equals(policyModel.getCredit()))
                judgeList.add(policyModel);
        }
        List<PolicyModel> result=new ArrayList<>();
        result=judgeList.stream().distinct().collect(Collectors.toList());
        return result;
    }
}
