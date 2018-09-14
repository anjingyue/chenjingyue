package com.example.my_springboot_learn.service;

import com.example.my_springboot_learn.model.QueryCondition;
import com.example.my_springboot_learn.model.User;

import java.util.List;

public interface IUserService {
    List<User> selectAllUser() throws Exception;

    void insertUser(User user) throws Exception;

    List<User> queryByLimit(QueryCondition queryCondition) throws Exception;
}
