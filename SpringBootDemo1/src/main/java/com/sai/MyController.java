package com.sai;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@RequestMapping("url1")
	@ResponseBody
	public String home()
	{
		return "Welcome Spring Boot";
	}
	@RequestMapping("url2")
	@ResponseBody
	public String about()
	{
		return "Welcome To ABout Page";
	}

}
