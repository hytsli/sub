package com.hytsli.web.controller;

import com.hystli.sub.dao.UserDao;
import com.hystli.sub.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RequestMapping("/test")
@RestController
public class HelloWorldController {

    @Resource
    private UserDao userDao;

    @GetMapping("/{id}")
    public UserEntity get(@PathVariable long id) {
        return userDao.findById(id);}


}