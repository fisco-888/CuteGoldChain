package com.webank.lian.service;

import com.webank.lian.dao.UserDao;
import com.webank.lian.domain.User;
import com.webank.lian.result.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;


@Service
public class UserService {
	
	@Autowired
	UserDao userDao;
	
	public Result login(String name, String password) {
		//用户名或密码为空
		if (StringUtils.isEmpty(name) || StringUtils.isEmpty(password)) {
			return Result.error(1, "用户名或密码为空");
		}
		
		//用户不存在
		User user = userDao.getUserByName(name);
		if (user == null) {
			return Result.error(2, "用户不存在");
		}
		
		//用户名或密码错误
		if (!password.equals(user.getPassword())) {
			return Result.error(3, "用户名或密码错误");
		}
		
		return Result.success();
	}
}
