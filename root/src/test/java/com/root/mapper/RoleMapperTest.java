package com.root.mapper;

import com.root.entity.Role;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RoleMapperTest {

    private static final Logger log = LoggerFactory.getLogger(UserMapperTest.class);


    @Autowired
    private SysRoleMapper sysRoleMapper;

    @Test
    public void testRoleSelect()
    {
        List<Role> roleList = sysRoleMapper.selectList(null);
        Assert.assertEquals(1, roleList.size());
        roleList.forEach(System.out::println);


    }


}