package com.dataproject.mydata.repository;

import com.dataproject.mydata.model.PolicyModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PolicyRepository extends JpaRepository<PolicyModel,Long> {
    public PolicyModel findByPoliId(long id);
    public List<PolicyModel> findAll();
}
