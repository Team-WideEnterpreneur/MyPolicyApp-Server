package com.dataproject.mydata.repository;

import com.dataproject.mydata.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<UserModel,Long> {
    public UserModel findByUserId(long id);
}
