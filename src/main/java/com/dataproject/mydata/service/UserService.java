package com.dataproject.mydata.service;

import com.dataproject.mydata.model.UserModel;
import com.dataproject.mydata.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public void createUser(UserModel userModel) {
        userRepository.save(userModel);
    }

    public UserModel getUser(long id) {
        return userRepository.findByUserId(id);
    }
}
