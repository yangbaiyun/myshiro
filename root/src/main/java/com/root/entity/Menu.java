package com.root.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.io.Serializable;

@Data
public class Menu implements Serializable {

    private Long id;

    @TableField("parent_id")
    private Long parentId;

    private String name;

    private String url;

    private String perms;

    private Integer type;

    private String icon;

    @TableField("order_num")
    private Integer orderNum;


}
