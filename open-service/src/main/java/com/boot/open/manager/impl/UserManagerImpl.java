package com.boot.open.manager.impl;

import com.boot.open.generated.tables.pojos.User;
import com.boot.open.manager.UserManager;
import com.boot.open.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Jing.Zhang
 * @date 2018/8/25
 */
@Service
public class UserManagerImpl implements UserManager {
    @Autowired
    private UserService userService;

    @Override
    public List<User> getUsers() {
        return userService.getUsers();
    }

    @Override
    public User insertUser(User user) {
        return userService.insertUser(user);
    }

    @Override
    public List<User> getByUserName(String name) {
        return userService.getByUserName(name);
    }
}
