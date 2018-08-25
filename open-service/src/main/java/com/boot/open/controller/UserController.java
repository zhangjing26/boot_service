package com.boot.open.controller;

import com.boot.open.generated.tables.pojos.User;
import com.boot.open.manager.UserManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Jing.Zhang
 * @date 2018/8/25
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserManager userManager;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUsers() {
        return userManager.getUsers();
    }

    @RequestMapping(method = RequestMethod.POST)
    public User saveUser(@RequestBody User user) {
        return userManager.insertUser(user);
    }
}
