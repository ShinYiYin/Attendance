package com.example.attendance.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "department")
	private String department;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "password")
	private String pwd;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "job_position")
	private String jobPosition;
	
	@Column(name = "birth_date")
	private LocalDate birthDate;
	
	@Column(name = "arrival_date")
	private LocalDate arrivalDate;
	
	@Column(name = "resignation_date")
	private LocalDate resignationDate;
	
	@Column(name = "quit_reason")
	private String quitReason;
	
	@Column(name = "active")
	private boolean active;
	
	@Column(name = "annual_leave")
	private int annualLeave;
	
	@Column(name = "sick_leave")
	private int sickLeave;
	
	

}
