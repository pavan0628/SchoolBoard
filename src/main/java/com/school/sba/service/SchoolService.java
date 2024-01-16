package com.school.sba.service;

import org.springframework.beans.factory.annotation.Autowired;

public interface SchoolService {

	String addStudent(int schoolId, String schoolName, long contactNo, String emailId, String address);
	
	

}
