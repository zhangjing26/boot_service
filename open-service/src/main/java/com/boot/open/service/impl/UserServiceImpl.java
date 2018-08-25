package com.boot.open.service.impl;

import com.boot.open.generated.tables.pojos.User;
import com.boot.open.service.UserService;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.boot.open.generated.Tables.USER;

/**
 * @author Jing.Zhang
 * @date 2018/8/25
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private DSLContext create;

    @Override
    public List<User> getUsers() {
        return create.selectFrom(USER).fetch().into(User.class);
    }

    @Override
    public User insertUser(User user) {
        return create.insertInto(USER).columns(USER.USER_NAME, USER.DESCRIPTION,
                USER.AGE, USER.SEX, USER.PASSWORD).values(user.getUserName(),
                user.getDescription(), user.getAge(), user.getSex(), user.getPassword())
                .returning().fetchOne().into(User.class);
    }

    @Override
    public List<User> getByUserName(String name) {
        return create.selectFrom(USER).where(USER.USER_NAME.equal(name)).fetch().into(User.class);
    }
}
