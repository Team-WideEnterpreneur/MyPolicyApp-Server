package com.dataproject.mydata.service;

import com.dataproject.mydata.model.PolicyModel;
import com.dataproject.mydata.model.output.PolicySummaryModel;
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

    public List<PolicySummaryModel> getAllPolicySummary() {
        List<PolicyModel> policyModels=policyRepository.findAll();
        List<PolicySummaryModel> policySummaryModels=policyModels.stream().map(policyModel
                ->{return new PolicySummaryModel(policyModel.getPoliId(),policyModel.getPoliName(),policyModel.getBusiType());}).collect(Collectors.toList());
        return policySummaryModels;
    }

    public void createPolicy(PolicyModel policyModel) {
        policyRepository.save(policyModel);
    }
}
