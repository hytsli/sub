package com.hystli.sub.controller;

import com.hystli.sub.dao.UserDao;
import com.hystli.sub.entity.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/test")
@RestController
public class HelloWorldController {

    @Resource
    private UserDao userDao;

    @GetMapping("/{id}")
    public UserEntity get(@PathVariable long id) {
        return userDao.findById(id);}


}