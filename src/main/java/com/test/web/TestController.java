package com.test.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.Yxcq;
import com.test.service.TestService;

@Controller
@RequestMapping(value="/test")
public class TestController {

	@Autowired
	private TestService testService;
	
	@RequestMapping(value="testList")
	public String testList(Model model,HttpServletRequest request){
		List<Yxcq> list=testService.findAll();
		model.addAttribute("list", list);
		return "testList";
	}
}
