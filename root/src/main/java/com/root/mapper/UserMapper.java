package com.root.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.root.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author chl
 * @date 2019/2/19 21:49
 */

public interface UserMapper extends BaseMapper<User> {

  /*  @Select("SELECT * FROM user WHERE CODE = #{userCode}")
    List<User> selectUserCustomParamsByAnno(@Param("userCode")String userCode);*/

}



