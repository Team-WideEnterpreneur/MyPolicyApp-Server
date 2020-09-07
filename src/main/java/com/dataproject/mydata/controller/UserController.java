package com.dataproject.mydata.controller;

import com.dataproject.mydata.model.UserModel;
import com.dataproject.mydata.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("/user")
    public String createUser(@RequestBody UserModel userModel){
        userService.createUser(userModel);
        return "ok";
    }

    @GetMapping("/user/{id}")
    public UserModel getUser(@PathVariable long id){
        log.info("get user id={}",id);
        return userService.getUser(id);
    }
}
