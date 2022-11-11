package com.assesment.fullstack.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assesment.fullstack.entity.DoctorEntity;
import com.assesment.fullstack.service.DoctorService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class DoctorController {
	
	@Autowired
	private DoctorService doctorService;
	
	@RequestMapping(value = "/",method=RequestMethod.GET)
	public List<DoctorEntity> doctorDetails()
	{
		List<DoctorEntity> doctorEntity = doctorService.getAll(); 
		return doctorEntity;
	}	
	
	
	@RequestMapping(value = "/check",method=RequestMethod.POST)
	public DoctorEntity checkAvailablity(int id)
	{
		DoctorEntity doctorEntity = doctorService.checkAvailablity(id);
		return doctorEntity;
	}
	
	@RequestMapping(value = "/add",method=RequestMethod.POST)
	public String addDetails(@RequestBody DoctorEntity doctorEntity)
	{
		System.out.println(doctorEntity);
		String str = doctorService.addRecord(doctorEntity);
		return str;
	}
	
}
