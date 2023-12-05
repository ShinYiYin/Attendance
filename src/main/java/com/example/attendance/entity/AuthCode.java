package com.example.attendance.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "auth_code")
public class AuthCode {
	
	@Id
	@Column(name = "employee_id")
	private String employeeId;
	
	@Column(name = "auth_code")
	private String authCode;
	
	@Column(name = "auth_datetime")
	private LocalDateTime authDatetime;

}
