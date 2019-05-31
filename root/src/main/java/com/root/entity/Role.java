package com.root.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName("role")
public class Role implements Serializable {

    @TableId(value = "id",type = IdType.AUTO)//指定自增策略
    private Long id;

    private String name;

    private String remark;

    @TableField("create_time")
    private Date createTime;


}
