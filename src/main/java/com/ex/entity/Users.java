package com.ex.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * 用户表
 */

@Data
@Entity
//@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "id")
    private Integer id;

//@Column(name = "username")
private String username;

//@Column(name = "Password",nullable = false)
private String Password;

//@Column(name = "enabled",nullable = false)
//private  String enabled;

//@Column(name = "role",nullable = false)
private  String role;
}
