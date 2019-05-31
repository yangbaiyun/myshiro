package com.test.authentication.shiro;

import com.root.entity.User;
import com.root.mapper.SysRoleMapper;
import com.root.mapper.UserMapper;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.realm.Realm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author chl
 * @date 2019/5/31 9:16
 */
@Component
public class UserRealm implements Realm {

    @Autowired
    private UserMapper  userMapper;

    @Autowired
    private SysRoleMapper roleMapper;

    @Override
    public String getName() {
        return "userRealm";
    }

    @Override
    public boolean supports(AuthenticationToken authenticationToken) {
        return authenticationToken!=null;
    }

    @Override
    public AuthenticationInfo getAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        //获取用户名密码
        String name=authenticationToken.getPrincipal().toString();
        String password=String.valueOf((char[])authenticationToken.getCredentials());

        //根据用户名密码查询数据库
        Map params=new HashMap(2);
        params.put("name",name);
        params.put("password",password);
        List<User> userList=userMapper.selectByMap(params);
        if(userList==null || userList.size()==0)
            return null;
        SimpleAuthenticationInfo info=new SimpleAuthenticationInfo(userList.get(0),userList.get(0).getPassword(),null,getName());
        return info;
    }


}
