package com.dbs.dbshackathon.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.dbshackathon.model.Appointment;
import com.dbs.dbshackathon.repository.AppointmentRepository;


@Service("AppointmentService")
public class AppointmentService {
	
	
	private static final Logger logger = LoggerFactory.getLogger(AppointmentService.class);

	@Autowired
	AppointmentRepository appointmentRepository;
	
	
	
	public Appointment addSchedule(Appointment appointment) {
		logger.info("Add details of Festival ");
		return appointmentRepository.save(appointment);
		
	}
	
	
	public List<Appointment> getAll() {
		logger.info("Get all the details of Festivals");
		return appointmentRepository.findAll();
	}
	
}