package com.cg.employee.employee.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
@Service
public class EmployeeServices {
	public List<EmployeePojo> emplist=new ArrayList<EmployeePojo>(Arrays.asList(
			new EmployeePojo("Himanshu","sd1","Software Developer"),
			new EmployeePojo("Satyen","t1","Trainer"),
			new EmployeePojo("Ashish","m1","Manager")));
	
	public List<EmployeePojo> getAllEmployees(){
		return emplist;
	}
	public String addEmployee(EmployeePojo emp) {
		String status="Employee is added";
		emplist.add(emp);
		return status;
	}
	
	public EmployeePojo getEmployee(String id) {
		for(EmployeePojo e:emplist) {
			if(e.getEmpid().equals(id)) {
				return e;
			}
		}
		return null;
	}
	
	public String removeEmployee(String id) {
		String status="Employee doesn't exist";
		for(EmployeePojo e:emplist) {
			if(e.getEmpid().equals(id)) {
				emplist.remove(e);
				status="Employee gets deleted";
			}
		}
		return status;
	}
	
	public String updateEmployee(String id,EmployeePojo emp) {
		String status="Employee doesn't exist";
		for(int i=0;i<emplist.size();i++) {
			EmployeePojo e=emplist.get(i);
			if(e.getEmpid().equals(id)) {
				emplist.set(i, emp);
				status="Employee gets updated";
			}
		}
		return status;
	}
}
