package com.example.projectaop1.controller;

import com.example.projectaop1.service.LearnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LearnerController {
    @Autowired
    public LearnerService learnerService;

    @RequestMapping(value = "/add/learner", method = RequestMethod.GET)
    public  com.example.projectaop1.model.Learner addLearner(
            @RequestParam("id") Long id,
            @RequestParam("name") String name,
            @RequestParam("gender") boolean gender,
            @RequestParam("university") String university,
            @RequestParam("javacore") double javacore,
            @RequestParam("frontend") double frontend,
            @RequestParam("project") double project){
        return learnerService.createLearner(id,name,gender,university,javacore,frontend,project);
    }

    @RequestMapping(value = "/remove/learner", method = RequestMethod.GET)
    public String removeLearner(@RequestParam("id") Long id){
        learnerService.deleteLearner(id);
        return "Learner removed by Linh";
    }

}
