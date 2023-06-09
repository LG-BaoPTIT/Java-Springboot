package learncode.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import learncode.spring.model.*;
import learncode.spring.service.EmployeeService;
@RestController
@RequestMapping("/rest")
@CrossOrigin
public class TestRestController {
	
	@Autowired
	EmployeeService employeeService;
	@GetMapping(value="/employees",produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Employee>> showEmployees() {
		List<Employee> ls = new ArrayList<>();
		ls= employeeService.findAll();
		return new ResponseEntity<>(ls,HttpStatus.OK);
	}
	@DeleteMapping(value="/employees/delete/{empId}")
	public void deleteEmployeeById(@PathVariable("empId") Long empId) {
		employeeService.deleteById(empId);
//		List<Employee> ls = employeeService.findAll();
//		return ls;
	}
	@PostMapping(value = "/employees",produces = MediaType.APPLICATION_JSON_VALUE )
	@ResponseBody
	public void addEmployee(@RequestBody Employee employee) {
		employeeService.save(employee);
		
	}

	@PutMapping(value = "/employees",produces = MediaType.APPLICATION_JSON_VALUE )
	@ResponseBody
	public void updateEmployee(@RequestBody Employee employee) {
		employeeService.save(employee);
		
	}
}
