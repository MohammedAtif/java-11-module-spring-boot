package com.module.one.services.impl;

import com.module.one.models.UserData;
import com.module.one.services.UserService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
@Primary
public class UserServiceLocalImpl implements UserService {

    private Long counter = 0L;
    private Map<Long, UserData> userDataMap = new HashMap<>();

    @Override
    public UserData saveUser(String name) {
        UserData userData = new UserData();
        userData.setName(name);
        userData.setId(++counter);
        userDataMap.put(userData.getId(), userData);
        return userData;
    }

    @Override
    public UserData getUser(long id) {
        return userDataMap.get(id);
    }
}
