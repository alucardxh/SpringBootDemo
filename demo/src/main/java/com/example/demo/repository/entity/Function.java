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
@TableName("function")
public class Function extends Model<Function> {

    private static final long serialVersionUID = 1L;

    /**
     * 功能id
     */
	private String id;
    /**
     * 父功能id
     */
	private String pid;
    /**
     * 功能名称
     */
	private String name;
    /**
     * 请求地址
     */
	private String url;
	private String icon;
    /**
     * 功能类型1为菜单(查看)2为功能(增删改)
     */
	private String type;
    /**
     * 功能级别
     */
	private String level;
    /**
     * 排序
     */
	@TableField("sort_index")
	private String sortIndex;
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

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getLevel() {
		return level;
	}

	public void setLevel(String level) {
		this.level = level;
	}

	public String getSortIndex() {
		return sortIndex;
	}

	public void setSortIndex(String sortIndex) {
		this.sortIndex = sortIndex;
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
		return "Function{" +
			", id=" + id +
			", pid=" + pid +
			", name=" + name +
			", url=" + url +
			", icon=" + icon +
			", type=" + type +
			", level=" + level +
			", sortIndex=" + sortIndex +
			", modifyTime=" + modifyTime +
			", createTime=" + createTime +
			"}";
	}
}
