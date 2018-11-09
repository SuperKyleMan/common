package com.aiways.generator.temp;

import com.aiways.generator.temp.btkeyDetailRecordPo;

public interface btkeyDetailRecordPoMapper {
    int insert(btkeyDetailRecordPo record);

    int insertSelective(btkeyDetailRecordPo record);

    btkeyDetailRecordPo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(btkeyDetailRecordPo record);
}