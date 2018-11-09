package com.aiways.pagehelper.dao;


import com.aiways.pagehelper.model.User;

import java.util.List;

public interface UserMapper {

    List<User> selectUser(User user);
}