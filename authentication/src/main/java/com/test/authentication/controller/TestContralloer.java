package com.test.authentication.controller;


import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.subject.Subject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestContralloer {

    @RequestMapping("/login")
    public String login(@RequestParam("name") String name,@RequestParam("password") String password)
    {

        try{
            Subject subject = SecurityUtils.getSubject();
            UsernamePasswordToken token = new UsernamePasswordToken(name, password);
            subject.login(token);
        }catch (UnknownAccountException e) {
            return e.getMessage();
        }catch (IncorrectCredentialsException e) {
            return"账号或密码不正确";
        }catch (LockedAccountException e) {
            return "账号已被锁定,请联系管理员";
        }catch (AuthenticationException e) {
            return "账户验证失败";
        }
        return "登录成功";
    }


    @RequestMapping("/logOut")
    public String logOut()
    {
        return "test";
    }


}
