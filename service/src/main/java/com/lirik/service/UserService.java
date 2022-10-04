package com.lirik.service;

import com.lirik.dao.UserDao;
import com.lirik.model.User;

import java.util.List;

public class UserService {

    private final UserDao userDao = new UserDao();

    public List<User> getAll() {
        return userDao.findAll();
    }
}
