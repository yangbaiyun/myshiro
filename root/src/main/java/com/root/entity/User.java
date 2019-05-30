package com.root.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chl
 * @date 2019/2/19 21:37
 */
@Data
public class User implements Serializable {
    private Long id;
    private String name;
    private String password;
    private String salt;
    private Integer age;
    private String email;
}