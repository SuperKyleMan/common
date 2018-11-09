package com.aiways.pagehelper.controller;

import com.demo.model.PageResult;
import com.demo.model.Resp;
import com.demo.model.User;
import com.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("test")

public class test {

    @Autowired
    public TestService testService;


    @GetMapping("getUserName")
    public String getUserName(){
        return "调用成功";
    }

//    @PostMapping("pageList")
//    public PageResult<User> list(@RequestBody User user){
//        System.out.println("分页准备 pageNum="+user.getPageNum()+ "pageSize="+user.getPageSize());
//
//        return testService.list(user);
//    }

    @PostMapping("pageList")
    public Resp<PageResult<User>> list(@RequestBody User user){
//        System.out.println("分页准备 pageNum="+user.getPageNum()+ "pageSize="+user.getPageSize());

        return testService.list(user);
    }


}
