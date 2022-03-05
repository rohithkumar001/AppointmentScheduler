package com.dbs.dbshackathon.model;


import java.sql.Timestamp;
import java.sql.Date;
import java.sql.Time;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Appointment {

	@Id
	@GeneratedValue
	private  Long id;
 //   private Timestamp createdAt = new Timestamp(System.currentTimeMillis());
 //  @Temporal(TemporalType.TIMESTAMP)
    private String appointmentDate;
//    @PrePersist
//    private void onCreate()
//    {
//    	appointmentDate=new Date(id);
//    }
    private String appointmentStartTime;
    private String appointmentEndTime;
    private String nameOfCustomer;
    private AppointmentStatus status = AppointmentStatus.Accepted;
    
    
    public Appointment() {

    }
    
    
    public Appointment(/*Timestamp createdAt, */String appointmentDate, String appointmentStartTime, String appointmentEndTime, AppointmentStatus status) {
 //       this.createdAt = createdAt;
        this.appointmentDate = appointmentDate;
        this.appointmentStartTime = appointmentStartTime;
        this.appointmentEndTime = appointmentEndTime;
        this.status = status;
    }
    
    
    
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
//	public Timestamp getCreatedAt() {
//		return createdAt;
//	}
//	public void setCreatedAt(Timestamp createdAt) {
//		this.createdAt = createdAt;
//	}
	public String getAppointmentDate() {
		return appointmentDate;
	}
	public void setAppointmentDate(String appointmentDate) {
		this.appointmentDate = appointmentDate;
	}
	public String getAppointmentStartTime() {
		return appointmentStartTime;
	}
	public void setAppointmentStartTime(String appointmentStartTime) {
		this.appointmentStartTime = appointmentStartTime;
	}
	public String getAppointmentEndTime() {
		return appointmentEndTime;
	}
	public void setAppointmentEndTime(String appointmentEndTime) {
		this.appointmentEndTime = appointmentEndTime;
	}
	public String getNameOfCustomer() {
		return nameOfCustomer;
	}
	public void setNameOfCustomer(String nameOfCustomer) {
		this.nameOfCustomer = nameOfCustomer;
	}
	public AppointmentStatus getStatus() {
		return status;
	}
	public void setStatus(AppointmentStatus status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Appointment [id=" + id + /*", createdAt=" + createdAt + */", appointmentDate=" + appointmentDate
				+ ", appointmentStartTime=" + appointmentStartTime + ", appointmentEndTime=" + appointmentEndTime
				+ ", nameOfCustomer=" + nameOfCustomer + ", status=" + status + "]";
	}

    
    
}
