package com.example.projectaop1.service;

import com.example.projectaop1.model.Learner;
import org.springframework.stereotype.Service;

@Service
public class LearnerService {
    public Learner createLearner(Long id, String name, boolean gender, String university, double javacore, double frontend, double project){
        Learner learner= new Learner(id,name,gender,university,javacore,frontend,project);
//        learner.setId(id);
//        learner.setName(name);
//        learner.setGender(gender);
//        learner.setUniversity(university);
//        learner.setJavacore(javacore);
//        learner.setFrontend(frontend);
//        learner.setProject(project);
        return learner;
    }
    public void deleteLearner(Long id){
    }
}
