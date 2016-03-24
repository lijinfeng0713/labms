package com.fengge.labms.controller;

import com.fengge.labms.entity.Teacher;
import com.fengge.labms.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

	@Autowired
	private TeacherService teacherService;

	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
		model.addAttribute("message", "Hello world!");
		return "hello";
	}

	@RequestMapping(value="/add",method = RequestMethod.GET)
	public String testAdd(ModelMap model) {
		teacherService.addTeacher(new Teacher("336696", "336696", "张惠妹", "信息学院", "教授", "女", "13309687654", "123@qq.com", "2005", "湖北京山"));
		model.addAttribute("message", "DeleteSuccessfully!");
		return "hello";
	}
}