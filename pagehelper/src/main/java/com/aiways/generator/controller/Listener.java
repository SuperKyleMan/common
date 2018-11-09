package com.aiways.generator.controller;//package com.controller;
//
//import org.springframework.context.ApplicationListener;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.event.ContextRefreshedEvent;
//
//
//@Configuration
//public abstract class Listener implements ApplicationListener<ContextRefreshedEvent> {
//
//    public abstract void onMessage();
//
//    @Override
//    public void onApplicationEvent(ContextRefreshedEvent event) {
//        //需要执行的逻辑代码，当spring容器初始化完成后就会执行该方法。
//        System.out.println("我的父容器为：" + event.getApplicationContext().getParent());
//        System.out.println("我的容器为：" + event.getApplicationContext());
//        System.out.println("初始化时我被调用了。");
//        onMessage();
//    }
//}
