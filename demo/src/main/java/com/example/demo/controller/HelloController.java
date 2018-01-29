package com.example.demo.controller;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.example.demo.repository.entity.Admin;
import com.example.demo.repository.entity.HostManage;
import com.example.demo.service.HostService;
import com.example.demo.service.pojo.HostCondition;
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

}
