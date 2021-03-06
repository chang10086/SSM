package com.demo.service.impl;

import com.demo.dao.UserDao;
import com.demo.entry.User;
import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    UserDao userDao;
    public List<User> queryAllUser(){
        return userDao.queryAllUser();
    }
}
