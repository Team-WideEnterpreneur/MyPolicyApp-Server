package com.dataproject.mydata.repository;

import com.dataproject.mydata.model.ApplicationModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ApplicationRepository extends JpaRepository<ApplicationModel,Long> {
    public List<ApplicationModel> findAllByUserId(long userId);
}
