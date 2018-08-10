package com.jerry.springcloud.service.user.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tb_user")
@Data
public class User {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name;
    private String address;
    private Integer age;

    public User() {
    }

    public User(String name, String address, Integer age) {
        this.name = name;
        this.address = address;
        this.age = age;
    }
}
