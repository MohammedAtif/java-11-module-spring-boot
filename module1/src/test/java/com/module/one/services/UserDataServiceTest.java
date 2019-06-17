package com.module.one.services;

import com.module.one.models.UserData;
import com.module.one.services.impl.UserServiceLocalImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;

@DataJpaTest
@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
public class UserDataServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void testInstance(){
        Assert.assertNotNull(userService);
        Assert.assertTrue("Checking the instance type", userService instanceof UserServiceLocalImpl);
    }

    @Test
    public void userDataTest(){
        UserData userData = userService.saveUser("Hello");
        Assert.assertEquals("Checking the inserted name", "Hello", userService.getUser(userData.getId()).getName());
    }

    @Configuration
    @ComponentScan(basePackages = "com.module.one")
    @EntityScan(basePackages = "com.module.one.models")
    @EnableJpaRepositories(basePackages = "com.module.one.repositories")
    static class configuration{

    }

}
