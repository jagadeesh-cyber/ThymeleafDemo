package com.infy.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.infy.entities.Employee;

@RestController
public class EmployeeController {
	@RequestMapping(value = "/employeedetails")
	public ModelAndView sendStudent() {
		ModelAndView mv = new ModelAndView("employee");
		Employee emp = new Employee();
		emp.setId(9020607);
		emp.setName("Jagadeesh");
		emp.setLocation("Bangalore");
		emp.setJobrole("Technology Support Specialist");
		emp.setSalary(25000);
		mv.addObject("employee", emp);
		return mv;
	}

	@RequestMapping(value = "/employeetable")
	public ModelAndView sendStudents() {
		Employee emp1 = new Employee();
		emp1.setId(9020607);
		emp1.setName("Jagadeesh");
		emp1.setLocation("Bangalore");
		emp1.setJobrole("Technology Support Specialist");
		emp1.setSalary(25000);

		Employee emp2 = new Employee();
		emp2.setId(9020608);
		emp2.setName("Ram Mohan Naidu");
		emp2.setLocation("Bangalore");
		emp2.setJobrole("Process Specialist");
		emp2.setSalary(23000);

		Employee emp3 = new Employee();
		emp3.setId(9020610);
		emp3.setName("Narendra Modi");
		emp3.setLocation("Delhi");
		emp3.setJobrole("Prime Minister of India");
		emp3.setSalary(50000);
		List<Employee> employees = Arrays.asList(emp1, emp3, emp2);
		return new ModelAndView("employeetable", "employees", employees);
	}
	
	@RequestMapping(value = "/employeeform")
	public ModelAndView studentForm() {
		Employee emp1 = new Employee();
		emp1.setId(9020607);
		emp1.setName("Jagadeesh");
		emp1.setLocation("Bangalore");
		emp1.setJobrole("Technology Support Specialist");
		emp1.setSalary(25000);
		return new ModelAndView("employeeform","employee",emp1);
	}
	@RequestMapping("/saveStudent")
	public ModelAndView saveStudent(@ModelAttribute Employee employee) {
		System.out.println(employee.getName());
		return new ModelAndView("result");
	}
}
