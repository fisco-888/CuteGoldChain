package com.webank.lian.controller;

import com.webank.lian.result.Result;
import com.webank.lian.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public Result login(@RequestParam String name,
	                    @RequestParam String password) {
		return userService.login(name, password);
	}
}
