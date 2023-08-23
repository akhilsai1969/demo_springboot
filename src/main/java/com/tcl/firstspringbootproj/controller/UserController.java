package com.tcl.firstspringbootproj.controller;

import com.tcl.firstspringbootproj.entity.UserClass;
import java.util.List;
import java.util.Optional;

import com.tcl.firstspringbootproj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/artuser")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/adduser")
    public UserClass addUser(@RequestBody UserClass artuser) {
        return userService.addUser(artuser);
    }

    @GetMapping("/listalluser")
    public List<UserClass> listAllUser() {
        return userService.listAllUser();
    }

    @GetMapping("/findbyuserid/{uid}")
    public Optional<UserClass> findByUserId(@PathVariable(value = "uid") Long uid) {
        Optional<UserClass> user = userService.findByUserId(uid);
        return user;
    }
}
