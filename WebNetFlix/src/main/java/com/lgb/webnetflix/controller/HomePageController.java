package com.lgb.webnetflix.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lgb.webnetflix.config.AES;
import com.lgb.webnetflix.mapper.UserMapper;
import com.lgb.webnetflix.model.User;
import com.lgb.webnetflix.model.UserExample;

@Controller
@RequestMapping()
public class HomePageController {
	
	@Autowired
	UserMapper userMapper ;
	
	@GetMapping("/login")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView("login");
		
		//UserExample userExample =new UserExample();
		Map<String,Object> param=new HashMap<>();
		param.put("userName","bao");
		param.put("id","1");
		List<Map<String,Object>> listUsers = userMapper.getAllUser(param);
		
		for(Map<String,Object> user : listUsers) {
			System.out.println(user.get("id"));
		}
		
		
		return modelAndView;
	}
	@GetMapping("/home")
	public ModelAndView home() {
		ModelAndView modelAndView = new ModelAndView("home");
		
		//UserExample userExample =new UserExample();
		Map<String,Object> param=new HashMap<>();
		param.put("userName","bao");
		param.put("id","1");
		List<Map<String,Object>> listUsers = userMapper.getAllUser(param);
		
		for(Map<String,Object> user : listUsers) {
			System.out.println(user.get("id"));
		}
		
		
		return modelAndView;
	}

}
