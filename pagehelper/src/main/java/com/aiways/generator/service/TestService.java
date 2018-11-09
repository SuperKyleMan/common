package com.aiways.generator.service;


import com.aiways.generator.dao.UserMapper;
import com.aiways.generator.model.PageResult;
import com.aiways.generator.model.Resp;
import com.aiways.generator.model.User;
import com.aiways.generator.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TestService {
    @Autowired
    private UserMapper userMapper;

public Resp<PageResult<User>> list(User user){
    PageUtil.startPage(user);
    List<User> list = userMapper.selectUser(user);
    return Resp.pageResult(list);
}
}
