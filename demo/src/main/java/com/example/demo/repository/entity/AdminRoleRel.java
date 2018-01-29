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
@TableName("admin_role_rel")
public class AdminRoleRel extends Model<AdminRoleRel> {

    private static final long serialVersionUID = 1L;

	private String id;
    /**
     * 用户id
     */
	@TableField("admin_id")
	private String adminId;
    /**
     * 角色id
     */
	@TableField("role_id")
	private String roleId;
	@TableField("create_time")
	private Date createTime;


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAdminId() {
		return adminId;
	}

	public void setAdminId(String adminId) {
		this.adminId = adminId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
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
		return "AdminRoleRel{" +
			", id=" + id +
			", adminId=" + adminId +
			", roleId=" + roleId +
			", createTime=" + createTime +
			"}";
	}
}
