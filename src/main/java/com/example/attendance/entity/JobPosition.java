package com.example.attendance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "job_position")
public class JobPosition {
	
	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "title")
	private String title;

}
