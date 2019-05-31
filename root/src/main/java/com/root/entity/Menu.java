package com.root.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

@Data
public class Menu implements Serializable {

    @TableId(value = "id",type = IdType.AUTO)//指定自增策略
    private Long id;

    //若没有开启驼峰命名，或者表中列名不符合驼峰规则，可通过该注解指定数据库表中的列名，exist标明数据表中有没有对应列
    @TableField(value="parent_id",exist = true)
    private Long parentId;

    private String name;

    private String url;

    private String perms;

    private Integer type;

    private String icon;

    @TableField("order_num")
    private Integer orderNum;


}
