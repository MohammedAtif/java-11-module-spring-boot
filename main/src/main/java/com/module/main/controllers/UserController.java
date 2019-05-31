package com.module.main.controllers;

import com.module.one.models.UserData;
import com.module.one.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user/")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public @ResponseBody UserData saveUser(@RequestParam String name){
        return userService.saveUser(name);
    }

    @GetMapping("{id}/")
    public @ResponseBody UserData getInfo(@PathVariable Long id){
        return userService.getUser(id);
    }

}
