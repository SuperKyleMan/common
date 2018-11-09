package com.aiways.generator.dao;


import com.aiways.generator.model.User;

import java.util.List;

public interface UserMapper {

    List<User> selectUser(User user);
}