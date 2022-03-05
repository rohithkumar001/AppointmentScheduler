package com.dbs.dbshackathon.controller;

import java.net.BindException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.dbshackathon.model.Appointment;
import com.dbs.dbshackathon.service.AppointmentService;

@RestController
@RequestMapping("/api/v1/appointments")
public class AppointmentRestController {
	
	private static final Logger logger = LoggerFactory.getLogger(AppointmentRestController.class);

	
    @Autowired(required=true)
    private AppointmentService appointmentService;

    
    
    
    @RequestMapping(method = RequestMethod.POST, produces = "application/json", consumes = "application/json" ,path= "insert")
	public Appointment addSchedule(@RequestBody Appointment appointment) throws Exception {
		logger.info("in Festival controller to insert Festival into the Database");

		try {
			return appointmentService.addSchedule(appointment);
		} catch (Exception exception) {
			throw new BindException("binding error");
		}

	}
    
    
    /** GET request to return all appointments **/
    @RequestMapping(path = "/", method = RequestMethod.GET)
    List<Appointment> findAll() {
        return appointmentService.getAll();
    }
	
}
