package com.example.projectaop1.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LearnerAspect {
    @Before(value = "execution(* com.example.projectaop1.service.LearnerService.*(..)) && args(id, name, gender,university, javacore, frontend, project)")
    public void beforeAdvice(JoinPoint joinPoint, Long id, String name, boolean gender, String university, double javacore, double frontend, double project) {
        System.out.println("Before method:" + joinPoint.getSignature());
        System.out.println("Creating Learner with id - " + id
                + ", name - "+ name
                + " gender - " + gender
                + " university - " + university
                + " javacore - " + javacore
                + " frontend - " + frontend
                + " project - " + project
            );
    }
}
