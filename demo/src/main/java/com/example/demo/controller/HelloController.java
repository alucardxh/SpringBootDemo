package com.example.demo.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.example.demo.repository.entity.Admin;
import com.example.demo.repository.entity.HostManage;
import com.example.demo.service.HostService;
import com.example.demo.service.LoginService;
import com.example.demo.service.pojo.HostCondition;
import com.example.demo.service.pojo.Result;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaoh on 2018/1/25.
 */
@RestController
public class HelloController {

    @Autowired
    private HostService hostService;


    @Autowired
    private LoginService loginService;

    @RequestMapping("/hello")
    public Object hello() {
        List<String> s = new ArrayList<>();
        s.add("1");
        s.add("2");
        s.add("asdhlkashjdlkas**********");
        List<Admin> admin = new Admin().selectList(new EntityWrapper());
        for (Admin admin1 : admin) {
            System.out.println(admin1);
        }
        return s;
    }


    @RequestMapping("/api/host/selectList")
    public List<HostManage> selectList(HostCondition condition) {
        List<HostManage> list = hostService.selectByCondition(condition);
        System.out.println(list);
        return list;
    }


    @RequestMapping("/api/host/selectPages")
    public Page<HostManage> selectPages(HostCondition condition) {
        Page<HostManage> pages = null;
        try {
            pages = hostService.selectPagesByCondition(condition);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pages;
    }



    @RequestMapping("/api/login")
    public Object login(String name,String password) {
        Result result = new Result(true);
        try {
            Subject subject = SecurityUtils.getSubject();
            subject.login(new UsernamePasswordToken("admin", "12cc3e75a7b0b684553e5ad7a34d1dee"));
        }catch (AuthenticationException e){
            e.printStackTrace();
            result.setSuccess(false);
        }
        return result;
    }




}
