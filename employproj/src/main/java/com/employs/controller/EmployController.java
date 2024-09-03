package com.employs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.employs.entities.Employ;
import com.employs.services.impl.EmployService;

@RestController
@RequestMapping("/api/employs")
public class EmployController {
	@Autowired
	EmployService empservice;

	@PostMapping
	public ResponseEntity<Employ> saveEmploy(@RequestBody Employ employ) {
		return new ResponseEntity<Employ>(empservice.saveEmploy(employ), HttpStatus.CREATED);
	}

	@GetMapping
	public List<Employ> getAllEmploys() {
		return empservice.getAllEmploys();
	}

	@GetMapping("{id}")
	public ResponseEntity<Employ> getEmployeeById(@PathVariable("id") int empId) {
		return new ResponseEntity<Employ>(empservice.getEmployById(empId), HttpStatus.OK);
	}

	@PutMapping("{id}")
	public ResponseEntity<Employ> updateEmploy(@PathVariable("id") int empid, @RequestBody Employ employ) {
		return new ResponseEntity<Employ>(empservice.updateEmploy(employ, empid), HttpStatus.OK);
	}

	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEmployById(@PathVariable("id") int empid) {
		empservice.deleteEmployById(empid);
		return new ResponseEntity<String>("Employ deleted Successfully.", HttpStatus.OK);
	}

}
