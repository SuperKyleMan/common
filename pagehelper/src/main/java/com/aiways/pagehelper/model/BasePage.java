package com.aiways.pagehelper.model;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BasePage {

    @JSONField(serialize = false)
    private int pageNum;
    @JSONField(serialize = false)
    private int pageSize;
}
