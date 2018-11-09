package com.aiways.generator.util;


import com.aiways.generator.model.BasePage;
import com.github.pagehelper.PageHelper;

import java.lang.reflect.Method;


public class PageUtil {


    public static void startPage(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize, true);
    }

    public static void startPage(Object obj) {
        try {
            if (obj == null || obj == null) {
                startPage(1, 10);
                return;
            }

            Class<?> clz = obj.getClass();
            // 判断clz是不是BasePage的子类
            boolean assignableFrom = BasePage.class.isAssignableFrom(clz);
            if (!assignableFrom) {
                PageHelper.startPage(1, 10, true);
                return;
            }

            Method getMethod = clz.getMethod("getPageNum");
            Object invokePageNum = getMethod.invoke(obj);
            int pageNum, pageSize;
            if (invokePageNum == null) {
                pageNum = 1;
            } else {
                pageNum = Integer.parseInt(getMethod.invoke(obj).toString());
            }
            getMethod = clz.getMethod("getPageSize");
            Object invokePageSize = getMethod.invoke(obj);
            if (invokePageSize == null) {
                pageSize = 10;
            } else {
                pageSize = Integer.parseInt(getMethod.invoke(obj).toString());
            }
            PageHelper.startPage(pageNum, pageSize, true);
        } catch (Exception e) {
            // 异常情况默认第一页访问10行数据
            e.printStackTrace();
            startPage(1, 10);
        }
    }
}
