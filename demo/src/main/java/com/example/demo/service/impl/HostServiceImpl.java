package com.example.demo.service.impl;


import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.example.demo.repository.entity.HostManage;
import com.example.demo.repository.mapper.HostManageMapper;
import com.example.demo.service.HostService;
import com.example.demo.service.pojo.HostCondition;
import com.example.demo.utils.IDGeneratorUtils;
import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author leijipeng
 * @date 2018年1月22日 下午4:10:27
 * @version 1.0
 * @parameter
 */
@Service
public class HostServiceImpl implements HostService {

	@Autowired
	private HostManageMapper hostManageMapper;

	/*
	 * 根据条件查询主机库存数据
	 */
	@Override
	public List<HostManage> selectByCondition(HostCondition condition) {
		EntityWrapper<HostManage> wrapper = buildWrapper(condition);
		return hostManageMapper.selectList(wrapper);
	}

	/*
	 * 分页查询主机库存数据
	 */
	@Override
	public Page<HostManage> selectPagesByCondition(HostCondition condition) throws Exception {
		EntityWrapper<HostManage> wrapper = buildWrapper(condition);
		Page<HostManage> page = new Page<HostManage>(condition.getCurrPage(), 10);
		page.setCondition(PropertyUtils.describe(condition));
		page.setRecords(hostManageMapper.selectPage(page, wrapper));
		return page;
	}

	/*
	 * 构造主机库存管理查询条件
	 */
	private EntityWrapper<HostManage> buildWrapper(HostCondition condition) {
		EntityWrapper<HostManage> wrapper = new EntityWrapper<HostManage>();
		wrapper.eq(StringUtils.isNotBlank(condition.getManufacturerName()), "manufacturer_name",condition.getManufacturerName());
		wrapper.eq(StringUtils.isNotBlank(condition.getMerName()), "mer_name", condition.getMerName());
		wrapper.eq(StringUtils.isNotBlank(condition.getMerNo()), "mer_no", condition.getMerNo());
		wrapper.eq(StringUtils.isNotBlank(condition.getStatus()), "status", condition.getStatus());
		wrapper.eq(StringUtils.isNotBlank(condition.getStorageInstitution()), "storage_institution",condition.getStorageInstitution());
		wrapper.eq(StringUtils.isNotBlank(condition.getTerminalNum()), "terminal_num", condition.getTerminalNum());
		wrapper.eq(StringUtils.isNotBlank(condition.getTerminalSerial()), "terminal_serial",condition.getTerminalSerial());
		wrapper.eq(StringUtils.isNotBlank(condition.getTerminalType()), "terminal_type", condition.getTerminalType());
		wrapper.orderBy("create_time", false);
		return wrapper;
	}

	/*
	 * 注册终端数据入库
	 */
	@Override
	public Integer insertStorageTerminalData(HostManage data) {
		data.setId(IDGeneratorUtils.genId());
		data.setCreateTime(new Date());
		data.setModifyTime(new Date());
		return hostManageMapper.insert(data);
	}

}
