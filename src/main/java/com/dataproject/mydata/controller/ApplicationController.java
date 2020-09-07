package com.dataproject.mydata.controller;

import com.dataproject.mydata.model.ApplicationModel;
import com.dataproject.mydata.service.ApplicationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
public class ApplicationController {
    @Autowired
    private ApplicationService applicationService;

    @PostMapping("/apply")
    public String createApplication(@RequestBody ApplicationModel applicationModel){
        applicationService.createApplication(applicationModel);
        return "ok";
    }

    @GetMapping("/apply/{userId}")
    public List<String> getApplication(@PathVariable long userId){
        log.info("get applications");
        return applicationService.getApplication(userId);
    }

}
