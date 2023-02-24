package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Entity.StudentDemo;
import com.example.demo.Repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo stuRepo;
	
	public StudentDemo savedetails(StudentDemo st4)
	{
		return stuRepo.save(st4);
	}
	
	public StudentDemo updatedetails(StudentDemo st2)
	{
		return stuRepo.saveAndFlush(st2);
	}
	
	public void deletedetails(int id)
	{
		stuRepo.deleteById(id);
	}
}
