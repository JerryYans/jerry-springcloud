package com.jerry.springcloud.service.user.controller;

import com.jerry.springcloud.service.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/allUser", method = RequestMethod.GET)
    public Object allUser(){
        return userRepository.findAll();
    }
}
