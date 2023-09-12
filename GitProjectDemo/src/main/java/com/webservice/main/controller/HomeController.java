package com.webservice.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.main.model.Employee;
import com.webservice.main.service.HomeService;

@RestController
public class HomeController {
	@Autowired
	HomeService hs;
	
	@GetMapping("/getData")
	public String get()
	{
		return " Hello Git Project...";
	}
	@PostMapping("/saveData")
	public ResponseEntity<Employee> saveData(@RequestBody Employee e)
	{
		Employee EmployeeDb=hs.saveData(e);
		return new ResponseEntity<Employee>(EmployeeDb, HttpStatus.CREATED);
		
	}
	@GetMapping("/getDataById/{id}")
	public ResponseEntity<Employee> getData(@PathVariable("id") int id)
	{
		Employee emp=hs.getData(id);
		return new ResponseEntity<Employee>(emp, HttpStatus.OK);
		
		
		
	}
	
@PutMapping("/updatedata")
public ResponseEntity<Employee> updateData(@RequestBody Employee e){
	Employee emp=hs.saveData(e);
	return new ResponseEntity<Employee>(emp, HttpStatus.CREATED); 
}

@GetMapping("/getDataAll")
public ResponseEntity<List<Employee>> getDataAll()
{
	List<Employee> emp=hs.getAllData();
	return new ResponseEntity<List><Employee>>(emp, HttpStatus.OK);
	
	
	
}


}
