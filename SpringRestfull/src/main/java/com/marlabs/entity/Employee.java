package com.marlabs.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import lombok.Data;

@Data
@Entity
public class Employee {
	@Id()
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "eid")
	private Long eid;
	private String ename;
	private Integer eage;
	private String elocation;
	private String edepartment;
	@CreationTimestamp
	private Date createdAt;
	@UpdateTimestamp
	private Date updatedAt;
}
