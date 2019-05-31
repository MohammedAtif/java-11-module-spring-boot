package com.module.one.services.impl;

import com.module.one.UserDataRepository.UserDataRepository;
import com.module.one.models.UserData;
import com.module.one.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDataRepository userDataRepository;

    @Override
    public UserData saveUser(String name) {
        UserData userData = new UserData();
        userData.setName(name);
        return userDataRepository.save(userData);
    }

    @Override
    public UserData getUser(long id) {
        Optional<UserData> userData = userDataRepository.findById(id);
        return userData.orElse(null);
    }
}
