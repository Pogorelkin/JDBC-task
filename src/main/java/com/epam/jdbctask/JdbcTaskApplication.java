package com.epam.jdbctask;

import com.epam.jdbctask.service.DemoService;
import com.epam.jdbctask.service.impl.DemoServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class JdbcTaskApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(JdbcTaskApplication.class, args);

        DemoService demoService = applicationContext.getBean(DemoServiceImpl.class);

        demoService.startDemo();

        applicationContext.close();

    }
}
