package com.mlab.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Entity
@Table
public class Person {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer pid;
	private String pname;
	private String paddrss;
	@OneToMany(targetEntity = BankAccount.class,
				cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JoinColumn(name = "PERSON_ID",referencedColumnName = "PID")
	Set<BankAccount> accounts;
	
	public Person(String pname, String paddrss, Set<BankAccount> accounts) { 
	   this.pname=pname; 
	   this.paddrss=paddrss;
	  this.accounts=accounts; 
	  }
	 
}
