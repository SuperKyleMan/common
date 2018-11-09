package com.aiways.pagehelper.service;


import com.aiways.pagehelper.dao.UserMapper;
import com.aiways.pagehelper.model.PageResult;
import com.aiways.pagehelper.model.Resp;
import com.aiways.pagehelper.model.User;
import com.aiways.pagehelper.util.PageUtil;
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
