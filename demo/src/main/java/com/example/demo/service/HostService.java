package com.example.demo.service;


import com.baomidou.mybatisplus.plugins.Page;
import com.example.demo.repository.entity.HostManage;
import com.example.demo.service.pojo.HostCondition;

import java.util.List;

/**
  * @author  leijipeng
  * @date 2018年1月22日 下午3:24:15 
  * @version 1.0 
  * @parameter  主机库存管理
  */
public interface HostService {
   
	/**
	 * 根据条件查询主机库存
	 * @author  leijipeng
	 * @date 2018年1月22日 下午4:01:42 
	 * @version 1.0 
	 * @parameter
	 */
	List<HostManage> selectByCondition(HostCondition condition);
	
	/**
	 * 根据条件分页查询主机库存
	 * @author  leijipeng
	 * @date 2018年1月22日 下午4:33:35 
	 * @version 1.0 
	 * @parameter
	 */
	Page<HostManage> selectPagesByCondition(HostCondition condition) throws Exception;
	 
	/**
	 * 注册终端数据入库
	 * @author  leijipeng
	 * @date 2018年1月22日 下午4:46:09 
	 * @version 1.0 
	 * @parameter
	 */
	Integer insertStorageTerminalData(HostManage data);
}
