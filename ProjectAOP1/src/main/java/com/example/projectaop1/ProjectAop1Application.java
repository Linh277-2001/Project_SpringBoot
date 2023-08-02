package com.example.projectaop1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass=true)
public class ProjectAop1Application {

    public static void main(String[] args) {

        SpringApplication.run(ProjectAop1Application.class, args);
    }

}
