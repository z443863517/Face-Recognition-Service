package com.face.www.service.impl;

import com.face.www.domain.User;
import com.face.www.mapper.UserMapper;
import com.face.www.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhangfan on 2018/6/13.
 */
@Service
public class UserService implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findUserByID(Long userID) {
        User user = userMapper.selectByPrimaryKey(userID);
        return user;

    }
}
