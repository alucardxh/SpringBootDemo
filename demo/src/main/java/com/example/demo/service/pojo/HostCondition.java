package com.example.demo.service.pojo;

import java.io.Serializable;

/**
 * @author leijipeng
 * @date 2018年1月22日 下午4:01:11
 * @version 1.0
 * @parameter
 */
public class HostCondition implements Serializable{
	private String terminalSerial; // 终端序列号
	private String terminalNum; // 终端号
	private String status; // 使用状态
	private String manufacturerName; // 厂商名称
	private String terminalType; // 终端型号
	private String storageInstitution; // 所属机构;入库机构
	private String merNo; // 商户号
	private String merName; // 商户名称
	private int currPage;

	public int getCurrPage() {
		return currPage;
	}

	public void setCurrPage(int currPage) {
		this.currPage = currPage;
	}

	public String getTerminalSerial() {
		return terminalSerial;
	}

	public void setTerminalSerial(String terminalSerial) {
		this.terminalSerial = terminalSerial;
	}

	public String getTerminalNum() {
		return terminalNum;
	}

	public void setTerminalNum(String terminalNum) {
		this.terminalNum = terminalNum;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public String getTerminalType() {
		return terminalType;
	}

	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}

	public String getStorageInstitution() {
		return storageInstitution;
	}

	public void setStorageInstitution(String storageInstitution) {
		this.storageInstitution = storageInstitution;
	}

	public String getMerNo() {
		return merNo;
	}

	public void setMerNo(String merNo) {
		this.merNo = merNo;
	}

	public String getMerName() {
		return merName;
	}

	public void setMerName(String merName) {
		this.merName = merName;
	}

}
