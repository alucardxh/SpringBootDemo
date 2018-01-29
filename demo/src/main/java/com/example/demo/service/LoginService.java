package com.example.demo.service;


import java.util.List;

import com.example.demo.repository.entity.Admin;
import com.example.demo.repository.entity.Function;
import com.example.demo.service.pojo.Result;

/**
 * Created by xiaoh on 2018/1/22.
 */
public interface LoginService {

        Result Login(String account, String password);

        Admin selectAdmin(String account);

        List<Function> selectByAccount(String account);
}
