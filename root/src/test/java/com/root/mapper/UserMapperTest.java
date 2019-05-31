package com.root.mapper;

import com.root.entity.User;
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
public class UserMapperTest {

    private static final Logger log = LoggerFactory.getLogger(UserMapperTest.class);


    @Autowired
    private UserMapper userMapper;

    @Test
    public void testUserSelect()
    {
        List<User> userList = userMapper.selectList(null);

        Assert.assertEquals(5, userList.size());
        userList.forEach(System.out::println);


    }





}