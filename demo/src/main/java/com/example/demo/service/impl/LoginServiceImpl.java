package com.example.demo.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.example.demo.repository.entity.Admin;
import com.example.demo.repository.entity.Function;
import com.example.demo.repository.mapper.AdminMapper;
import com.example.demo.repository.mapper.FunctionMapper;
import com.example.demo.service.LoginService;
import com.example.demo.common.bean.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiaoh on 2018/1/22.
 */
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private AdminMapper adminMapper;

	private FunctionMapper functionMapper;
	
    @Override
    public Result Login(String account, String password) {
		Result returnJSONObject= new Result(true);
        return returnJSONObject;
    }

	@Override
	public Admin selectAdmin(String account) {
		EntityWrapper<Admin> entity = new EntityWrapper<>();
		entity.eq("account", account);
		return adminMapper.selectList(entity).get(0);
	}

	@Override
	public List<Function> selectByAccount(String account) {
		EntityWrapper<Admin> entity = new EntityWrapper<>();
		entity.eq("account", account);
		Admin admin = adminMapper.selectList(entity).get(0);
		//List<String> list =  adminMapper.selectFunctionIdById(admin.getId());
		List<Function> listFunction = new ArrayList<>();
		/*for (String string : list) {
			listFunction.add(functionMapper.selectById(string));
		}*/
		return listFunction;
	}
}
