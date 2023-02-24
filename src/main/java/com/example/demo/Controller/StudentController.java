package com.example.demo.Controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.StudentDemo;
import com.example.demo.Service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService stuService;
	
	@PostMapping("/addDetails")
	public StudentDemo addInfo(@RequestBody StudentDemo st3)
	{
		return stuService.savedetails(st3);
	}
	
	@PutMapping("/updateDetails")
	public StudentDemo updateInfo(@RequestBody StudentDemo st1)
	{
		return stuService.updatedetails(st1);
	}
	
	@DeleteMapping("/delete/{sid}")
	public String deleteInfo(@PathVariable("sid") int sid) 
	{
		stuService.deletedetails(sid);
		return "Deleted Details";
	}
}
