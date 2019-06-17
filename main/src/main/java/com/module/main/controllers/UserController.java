package com.module.main.controllers;

import com.module.one.models.UserData;
import com.module.one.services.UserService;
import com.module.two.models.ProjectData;
import com.module.two.services.ProjectDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user/")
public class UserController {

    private UserService userService;

    private ProjectDataService projectDataService;

    @Autowired
    public UserController(UserService userService, ProjectDataService projectDataService) {
        this.userService = userService;
        this.projectDataService = projectDataService;
    }

    @PostMapping
    public @ResponseBody UserData saveUser(@RequestParam String name){
        return userService.saveUser(name);
    }

    @GetMapping("{id}/")
    public @ResponseBody UserData getInfo(@PathVariable Long id){
        return userService.getUser(id);
    }

    @GetMapping("project/{id}")
    public @ResponseBody ProjectData getProjectInfo(@PathVariable Long id) {
        return projectDataService.getProjectData(id);
    }

}
