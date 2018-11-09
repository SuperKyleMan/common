package com.aiways.generator.temp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author maq
 * @date 2018-11-09 09:06:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class btkeyDetailRecordPo {
    /**
     * 自增id
     */
    private Long id;

    /**
     * 车辆vin
     */
    private String vin;

    /**
     * 文件id
     */
    private String fileId;

    /**
     * 翻译文本信息
     */
    private String translation;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 属性关键字
     */
    private String keyid;

    /**
     * 属性值
     */
    private String vValue;

    /**
     * 属性值类型
     */
    private String valueType;

    /**
     * 文件名
     */
    private String filename;

    /**
     * 文件路径
     */
    private String path;

    /**
     * 文件存储全路径
     */
    private String fullPath;

    /**
     * 文件大小 
     */
    private Long size;

    /**
     * 文件扩展名
     */
    private String extName;

    /**
     * 主文件ID
     */
    private String masterId;

    /**
     * 文件组名
     */
    private String groupName;

    /**
     * 文件类型
     */
    private String fileType;

    /**
     * 逻辑删除标记 
     */
    private Integer isDelete;

    /**
     * 标识文件是否被使用
     */
    private Integer isUsed;

    /**
     * 更新模式
     */
    private String updateMode;

    /**
     * 创建时间
     */
    private String createTime;

    /**
     * 更新时间
     */
    private String updateTime;

    /**
     * 提醒时间
     */
    private String remindTime;

    /**
     * dType
     */
    private String dType;
}