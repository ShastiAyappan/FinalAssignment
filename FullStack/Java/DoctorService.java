package com.assesment.fullstack.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assesment.fullstack.dao.DoctorDao;
import com.assesment.fullstack.entity.DoctorEntity;

@Service
public class DoctorService implements DoctorSerciceI{
	
	@Autowired
	private DoctorDao doctorDao;
	 
	public List<DoctorEntity> getAll()
	{
		List<DoctorEntity> doctorEntity = doctorDao.getAllRecords();
		return doctorEntity;
	}
	
	public String addRecord(DoctorEntity doctorEntity)
	{
		String str = doctorDao.addRecord(doctorEntity);
		return str;
	}
	
	public DoctorEntity checkAvailablity(int id)
	{
		DoctorEntity doctorEntity = new DoctorEntity();
		doctorEntity = doctorDao.getOneRecords(id);
		if(doctorEntity.isStatus_boo()==true)
			return doctorEntity;
		else
			return null;
	}
}
