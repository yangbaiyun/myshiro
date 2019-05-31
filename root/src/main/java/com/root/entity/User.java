package com.root.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * @author chl
 * @date 2019/2/19 21:37
 */
@Data
public class User implements Serializable {

    @TableId(value = "id",type = IdType.AUTO)//指定自增策略
    private Long id;
    private String name;
    private String password;
    private String salt;
    private Integer age;
    private String email;
}