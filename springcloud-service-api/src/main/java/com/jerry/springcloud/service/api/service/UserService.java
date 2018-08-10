package com.jerry.springcloud.service.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;

    public List<Object> getAllUsers(){
        return restTemplate.getForObject("http://jerry-service-user/allUser", List.class);
    }
}
