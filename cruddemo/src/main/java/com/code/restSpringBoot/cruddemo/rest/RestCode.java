package com.code.restSpringBoot.cruddemo.rest;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.code.restSpringBoot.cruddemo.DAO.EmployeeDAO;
import com.code.restSpringBoot.cruddemo.entity.Employee;

@RequestMapping("/api")
@RestController
public class RestCode {
	private EmployeeDAO employeeDAO;

	public RestCode(EmployeeDAO dao) {
		employeeDAO=dao;
	}
	
	@GetMapping("/employees")
	public List<Employee> getList(){
		return employeeDAO.getList();
	}
}
