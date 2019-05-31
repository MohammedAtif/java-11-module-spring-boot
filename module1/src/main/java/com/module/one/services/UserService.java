package com.module.one.services;

import com.module.one.models.UserData;

public interface UserService {

    UserData saveUser(String name);
    UserData getUser(long id);

}
