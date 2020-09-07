package com.dataproject.mydata.service;

import com.dataproject.mydata.model.PolicyModel;
import com.dataproject.mydata.repository.PolicyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PolicyService {
    @Autowired
    private PolicyRepository policyRepository;

    public PolicyModel getPolicy(long id){
        PolicyModel policyModel=policyRepository.findByPoliId(id);
        return policyModel;
    }

    public List<String> getAllPolicyName() {
        List<PolicyModel> policyModels=policyRepository.findAll();
        List<String> policyNames=policyModels.stream().map(policyModel
                ->{return policyModel.getPoliName();}).collect(Collectors.toList());
        return policyNames;
    }

    public void createPolicy(PolicyModel policyModel) {
        policyRepository.save(policyModel);
    }
}
