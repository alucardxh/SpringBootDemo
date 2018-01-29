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
@TableName("role_function_rel")
public class RoleFunctionRel extends Model<RoleFunctionRel> {

    private static final long serialVersionUID = 1L;

	private String id;
    /**
     * 角色id
     */
	@TableField("role_id")
	private String roleId;
    /**
     * 功能id
     */
	@TableField("function_id")
	private String functionId;
	@TableField("create_time")
	private Date createTime;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getFunctionId() {
		return functionId;
	}

	public void setFunctionId(String functionId) {
		this.functionId = functionId;
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
		return "RoleFunctionRel{" +
			", id=" + id +
			", roleId=" + roleId +
			", functionId=" + functionId +
			", createTime=" + createTime +
			"}";
	}
}
