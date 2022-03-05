package com.dbs.dbshackathon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dbs.dbshackathon.model.Appointment;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

	// List<Appointment> findAllByAppointmentDate(LocalDate startDate, LocalDate endDate);

	
}
