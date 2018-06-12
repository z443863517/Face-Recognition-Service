package com.face.www.service;

import com.face.www.domain.User;

/**
 * Created by zhangfan on 2018/6/12.
 */
public interface IUserService {
    /**
     * 查找用户
     */
     User findUserByID(Long userID);

}
