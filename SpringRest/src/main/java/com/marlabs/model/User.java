package com.marlabs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
@Entity
@Table(name = "userdata")
@Data
public class User {
	 @Id
	    @GeneratedValue(strategy= GenerationType.IDENTITY)
	    private int id;
	    @Column
	    private String firstName;
	    @Column
	    private String lastName;
	    @Column
	    private String username;
	    @Column
	    @JsonIgnore
	    private String password;
	    @Column
	    private long salary;
	    @Column
	    private int age;
}
