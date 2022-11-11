package com.assesment.fullstack.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assesment.fullstack.entity.DoctorEntity;

public interface DoctorRepo extends JpaRepository<DoctorEntity,Integer>{

}
