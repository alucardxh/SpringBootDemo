package com.example.demo.service.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * @author leijipeng
 * @date 2018年1月23日 下午1:50:47
 * @version 1.0
 * @parameter
 */
public class Tabledata implements Serializable {

	private List<HostFront> hostData;

	public List<HostFront> getHostData() {
		return hostData;
	}

	public void setHostData(List<HostFront> hostData) {
		this.hostData = hostData;
	}

}
