package com.assesment.fullstack.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assesment.fullstack.entity.DoctorEntity;

@Repository
public class DoctorDao {
	
	@Autowired
	private DoctorRepo doctorRepo;
	
	public List<DoctorEntity> getAllRecords(){
		
		List<DoctorEntity> listEntity = new ArrayList<DoctorEntity>();
		
		listEntity = doctorRepo.findAll();
		
		return listEntity;
	}
	
	public DoctorEntity getOneRecords(int id)
	{
		DoctorEntity record = doctorRepo.findOne(id);
		return record;
	}
	
	public String addRecord(DoctorEntity doctorEntity)
	{
		doctorRepo.save(doctorEntity);
		return "Added Record with id: "+doctorEntity.getDoctorId_i()+" successfully";
	}
	
	public String updateRecord(DoctorEntity doctorEntity)
	{
		doctorRepo.save(doctorEntity);
		return "Updated Record with id: "+doctorEntity.getDoctorId_i()+" successfully";
	}
	
	public String deleteRecord(DoctorEntity doctorEntity)
	{
		doctorRepo.delete(doctorEntity);
		return "Deleted Record with id: "+doctorEntity.getDoctorId_i()+" successfully";
	}
}
