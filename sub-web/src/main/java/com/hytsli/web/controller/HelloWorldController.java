package com.hytsli.web.controller;

import com.hystli.sub.dao.UserDao;
import com.hystli.sub.entity.UserEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@Slf4j
@RequestMapping("/test")
@RestController
public class HelloWorldController {

    @Resource
    private UserDao userDao;

    @GetMapping("/{id}")
    public UserEntity get(@PathVariable long id) {
//        log.info("insert");
//        UserEntity user = new UserEntity();
//        user.setId(100L);
//        user.setName("test aaa");
//        user.setDescription("we test");
//        int a = userDao.insert(user);
//        log.info("inset "+ a);
        log.info("inget");
        return userDao.findById(id);}


}