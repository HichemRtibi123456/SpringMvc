package com.hichem.rtibi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/project")
public class ProjectController {
	@RequestMapping("/add")
	public String addProject() {
		System.out.println("invoking get method");
		return "project_add";
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public String saveProject() {
		System.out.println("invoking post method");
		return "project_add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST,params= {"types=multi"})
	public String saveMultiProject() {
		System.out.println("invoking savemulti method");
		return "project_add";
	}
	@RequestMapping(value = "/add", method = RequestMethod.POST,params= {"types=multi","special"})
	public String savespecialProject() {
		System.out.println("invoking special project method");
		return "project_add";
	}
}
