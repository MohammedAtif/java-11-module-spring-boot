package com.module.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages = "com.module")
@EntityScan(basePackages = "com.module.one.models")
@EnableJpaRepositories(basePackages = "com.module.one.repositories")
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
