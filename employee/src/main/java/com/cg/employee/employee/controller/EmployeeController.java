package com.cg.employee.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeServices service;

	@RequestMapping("/employees")
	public List<EmployeePojo> getAllEmployees() {
		return service.getAllEmployees();
	}

	@RequestMapping(value = "/employees/{id}", method = RequestMethod.GET)
	public EmployeePojo getEmployee(@PathVariable String id) {
		return service.getEmployee(id);
	}
	
	@RequestMapping(value = "/employees", method = RequestMethod.POST)
	public String addEmployee(@RequestBody EmployeePojo emp) {
		return service.addEmployee(emp);
	}

	@RequestMapping(value = "/employees/{id}", method = RequestMethod.DELETE)
	public String removeEmployee(@PathVariable String id) {
		return service.removeEmployee(id);
	}
	
	@RequestMapping(value = "/employees/{id}", method = RequestMethod.PUT)
	public String updateEmployee(@PathVariable String id,@RequestBody EmployeePojo emp) {
		return service.updateEmployee(id,emp);
	}
}
