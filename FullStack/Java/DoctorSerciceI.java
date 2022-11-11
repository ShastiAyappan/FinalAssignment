package com.assesment.fullstack.service;

import org.springframework.stereotype.Service;

import com.assesment.fullstack.entity.DoctorEntity;

@Service
public interface DoctorSerciceI {
	
	String addRecord(DoctorEntity doctorEntity);
	
	public DoctorEntity checkAvailablity(int id);
	
}
