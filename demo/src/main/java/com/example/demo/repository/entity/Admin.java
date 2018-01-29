package com.example.demo.repository.entity;

import java.io.Serializable;

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
@TableName("admin")
public class Admin extends Model<Admin> {

    private static final long serialVersionUID = 1L;

	private String id;
    /**
     * 用户账号
     */
	private String account;
    /**
     * 密码
     */
	private String pwd;
    /**
     * 盐
     */
	private String salt;
    /**
     * 管理员状态1正常0锁定
     */
	private String state;
    /**
     * 用户编号
     */
	private String no;
    /**
     * 用户名
     */
	private String name;
    /**
     * 电话
     */
	private String phone;
    /**
     * 管理员上次登录地址
     */
	private String address;
    /**
     * 上次登录ip地址
     */
	private String ip;
    /**
     * 管理员上次登录时间
     */
	@TableField("last_time")
	private Date lastTime;
    /**
     * email
     */
	private String email;
	@TableField("modify_time")
	private Date modifyTime;
	@TableField("create_time")
	private Date createTime;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getNo() {
		return no;
	}

	public void setNo(String no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public Date getLastTime() {
		return lastTime;
	}

	public void setLastTime(Date lastTime) {
		this.lastTime = lastTime;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getModifyTime() {
		return modifyTime;
	}

	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Override
	protected Serializable pkVal() {
		return this.id;
	}

	@Override
	public String toString() {
		return "Admin{" +
			", id=" + id +
			", account=" + account +
			", pwd=" + pwd +
			", salt=" + salt +
			", state=" + state +
			", no=" + no +
			", name=" + name +
			", phone=" + phone +
			", address=" + address +
			", ip=" + ip +
			", lastTime=" + lastTime +
			", email=" + email +
			", modifyTime=" + modifyTime +
			", createTime=" + createTime +
			"}";
	}
}
