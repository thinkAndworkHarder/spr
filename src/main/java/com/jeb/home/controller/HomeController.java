package com.jeb.home.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

	@RequestMapping(value={"/", "/home"})
	public String showHomePage(Map<String, Object> model, @RequestParam(value="id", required=false) Integer id) {
		List<String> users = new ArrayList<String>();
		users.add("张三");
		users.add("李四");
		users.add("王五");
		users.add("赵六");
		model.put("users", users);
		return "home";
	}
}
