package com.boot.open.manager;

import com.boot.open.generated.tables.pojos.User;

import java.util.List;

/**
 * @author Jing.Zhang
 * @date 2018/8/25
 */
public interface UserManager {


    /**
     * 查看所有用户
     *
     * @return 用户列表
     */
    List<User> getUsers();

    /**
     * 添加用户
     * @param user 用户信息
     * @return 用户
     */
    User insertUser(User user);

    /**
     * 根据用户名称查看用户
     * @param name 用户名称
     * @return 用户列表
     */
    List<User> getByUserName(String name);
}
