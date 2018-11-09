package com.aiways.generator.model;

import com.github.pagehelper.PageInfo;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class PageResult<T> {

    private Long totalItems;

    private List<?> list;

    public PageResult() {}

    public <T> PageResult(T list) {
        PageInfo pageInfo = new PageInfo((List) list);
        this.totalItems = pageInfo.getTotal();
        this.list = pageInfo.getList();
    }
}
