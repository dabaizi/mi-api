package com.dabaizi.mi.service;

import com.dabaizi.mi.dao.UserDao;
import com.dabaizi.mi.domain.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Resource
    private UserDao userDao;

    public User getUserById(Long userId) {
        return userDao.query(userId);
    }
}
