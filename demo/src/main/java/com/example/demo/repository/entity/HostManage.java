package com.example.demo.repository.entity;

import java.io.Serializable;

import java.math.BigDecimal;
import java.util.Date;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author springboot
 * @since 2018-01-25
 */
@TableName("host_manage")
public class HostManage extends Model<HostManage> {

    private static final long serialVersionUID = 1L;

	private String id;
    /**
     * 出入库日志ID
     */
	@TableField("log_id")
	private String logId;
    /**
     * 起序列号
     */
	@TableField("terminal_start")
	private String terminalStart;
    /**
     * 终序列号
     */
	@TableField("terminal_end")
	private String terminalEnd;
    /**
     * 终端序列号
     */
	@TableField("terminal_serial")
	private String terminalSerial;
    /**
     * 终端号
     */
	@TableField("terminal_num")
	private String terminalNum;
    /**
     * 商户号
     */
	@TableField("mer_no")
	private String merNo;
    /**
     * 商户名称
     */
	@TableField("mer_name")
	private String merName;
    /**
     * 产权属性
     */
	@TableField("property_right")
	private String propertyRight;
    /**
     * 入库来源
     */
	@TableField("storage_source")
	private String storageSource;
    /**
     * 入库批次号
     */
	@TableField("storage_batch")
	private String storageBatch;
    /**
     * 合同编号
     */
	@TableField("agreement_num")
	private String agreementNum;
    /**
     * 采购价格
     */
	@TableField("purchase_price")
	private BigDecimal purchasePrice;
    /**
     * 终端数量
     */
	@TableField("terminal_amount")
	private String terminalAmount;
    /**
     * 入库机构
     */
	@TableField("storage_institution")
	private String storageInstitution;
    /**
     * 终端型号
     */
	@TableField("terminal_type")
	private String terminalType;
    /**
     * 厂商名称
     */
	@TableField("manufacturer_name")
	private String manufacturerName;
    /**
     * 厂商编号
     */
	@TableField("manufacturer_code")
	private String manufacturerCode;
    /**
     * 使用状态
     */
	private String status;
    /**
     * 入库时间
     */
	@TableField("storage_time")
	private Date storageTime;
    /**
     * 出库时间
     */
	@TableField("outdepot_time")
	private Date outdepotTime;
	@TableField("create_time")
	private Date createTime;
	@TableField("modify_time")
	private Date modifyTime;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getLogId() {
		return logId;
	}

	public void setLogId(String logId) {
		this.logId = logId;
	}

	public String getTerminalStart() {
		return terminalStart;
	}

	public void setTerminalStart(String terminalStart) {
		this.terminalStart = terminalStart;
	}

	public String getTerminalEnd() {
		return terminalEnd;
	}

	public void setTerminalEnd(String terminalEnd) {
		this.terminalEnd = terminalEnd;
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

	public String getPropertyRight() {
		return propertyRight;
	}

	public void setPropertyRight(String propertyRight) {
		this.propertyRight = propertyRight;
	}

	public String getStorageSource() {
		return storageSource;
	}

	public void setStorageSource(String storageSource) {
		this.storageSource = storageSource;
	}

	public String getStorageBatch() {
		return storageBatch;
	}

	public void setStorageBatch(String storageBatch) {
		this.storageBatch = storageBatch;
	}

	public String getAgreementNum() {
		return agreementNum;
	}

	public void setAgreementNum(String agreementNum) {
		this.agreementNum = agreementNum;
	}

	public BigDecimal getPurchasePrice() {
		return purchasePrice;
	}

	public void setPurchasePrice(BigDecimal purchasePrice) {
		this.purchasePrice = purchasePrice;
	}

	public String getTerminalAmount() {
		return terminalAmount;
	}

	public void setTerminalAmount(String terminalAmount) {
		this.terminalAmount = terminalAmount;
	}

	public String getStorageInstitution() {
		return storageInstitution;
	}

	public void setStorageInstitution(String storageInstitution) {
		this.storageInstitution = storageInstitution;
	}

	public String getTerminalType() {
		return terminalType;
	}

	public void setTerminalType(String terminalType) {
		this.terminalType = terminalType;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public String getManufacturerCode() {
		return manufacturerCode;
	}

	public void setManufacturerCode(String manufacturerCode) {
		this.manufacturerCode = manufacturerCode;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Date getStorageTime() {
		return storageTime;
	}

	public void setStorageTime(Date storageTime) {
		this.storageTime = storageTime;
	}

	public Date getOutdepotTime() {
		return outdepotTime;
	}

	public void setOutdepotTime(Date outdepotTime) {
		this.outdepotTime = outdepotTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "HostManage{" +
			", id=" + id +
			", logId=" + logId +
			", terminalStart=" + terminalStart +
			", terminalEnd=" + terminalEnd +
			", terminalSerial=" + terminalSerial +
			", terminalNum=" + terminalNum +
			", merNo=" + merNo +
			", merName=" + merName +
			", propertyRight=" + propertyRight +
			", storageSource=" + storageSource +
			", storageBatch=" + storageBatch +
			", agreementNum=" + agreementNum +
			", purchasePrice=" + purchasePrice +
			", terminalAmount=" + terminalAmount +
			", storageInstitution=" + storageInstitution +
			", terminalType=" + terminalType +
			", manufacturerName=" + manufacturerName +
			", manufacturerCode=" + manufacturerCode +
			", status=" + status +
			", storageTime=" + storageTime +
			", outdepotTime=" + outdepotTime +
			", createTime=" + createTime +
			", modifyTime=" + modifyTime +
			"}";
	}
}
