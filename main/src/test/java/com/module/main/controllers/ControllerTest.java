package com.module.main.controllers;

import com.module.one.services.UserService;
import com.module.one.services.impl.UserServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.junit4.SpringRunner;

@DataJpaTest
@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class ControllerTest {

    @Autowired
    private UserService userService;

    @Test
    public void checkUserServiceInstance() {
        Assert.assertTrue("Checking the instance of User Sercvice", userService instanceof UserServiceImpl);
    }

    @Configuration
    @ComponentScan(basePackages = "com.module")
    static class configuration{

    }

}
