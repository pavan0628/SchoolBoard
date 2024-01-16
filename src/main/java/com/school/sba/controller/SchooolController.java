package com.school.sba.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.school.sba.service.SchoolService;

public class SchooolController {
	
	private SchoolService sS;
	
	@ResponseBody
	@RequestMapping(value="/add", method = RequestMethod.POST)
	public String addStudent(@RequestParam int schoolId, @RequestParam String schoolName, @RequestParam long contactNo, @RequestParam String emailId,@RequestParam String address) {

		return sS.addStudent(schoolId,schoolName,contactNo,emailId,address);
	}

}
