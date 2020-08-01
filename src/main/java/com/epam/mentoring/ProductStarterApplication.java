package com.epam.mentoring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@EnableConfigurationProperties(StorageProperties.class)
public class ProductStarterApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductStarterApplication.class, args);
    }


}
