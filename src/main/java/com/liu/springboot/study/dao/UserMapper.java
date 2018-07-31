package com.liu.springboot.study.dao;

import com.liu.springboot.study.domain.User;

import java.util.List;

/**
 * Created by liuhaolong on 2018/5/18.
 */
public interface UserMapper {
   int addUser(User user);
   int deleteUser(int id);
   int updateUser(User user);
   List queryUser(int id);
}
