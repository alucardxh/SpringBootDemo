package com.example.demo.common.permission;


import com.example.demo.repository.entity.Admin;
import com.example.demo.service.LoginService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MyRealm extends AuthorizingRealm {


	@Autowired
	private LoginService loginService;

	/**
	 * 授权
	 * 
	 * @param principals
	 * @return
	 */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		Admin token = (Admin) SecurityUtils.getSubject().getPrincipal();
		SimpleAuthorizationInfo info =  new SimpleAuthorizationInfo();
		System.out.println("12334");
		info.addStringPermission("user");
		return info;
	}

	/**
	 * 认证
	 * @param authcToken
	 * @return
	 * @throws AuthenticationException
	 */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
		UsernamePasswordToken user = (UsernamePasswordToken) authcToken;
		Admin selectAdmin = loginService.selectAdmin("admin");
		System.out.println("123346");
		if(null == selectAdmin){
			throw new AccountException("帐号或密码不正确!");
		}
		return new SimpleAuthenticationInfo(selectAdmin,selectAdmin.getPwd(), getName());
	}
}
