package com.mlab.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
@Data
@RequiredArgsConstructor

@Entity

@Table
public class BankAccount {
	
	@Id
	@SequenceGenerator(name ="gen1", sequenceName = "ACCNO_SEQ",initialValue = 1000,allocationSize = 1)
	@GeneratedValue(generator = "gen1",strategy = GenerationType.SEQUENCE)
	private Long accNo;
	private String accType;
	private String bankName;
	private Double balance;
	
	public BankAccount(String accType, String bankName, double balance) {
		// TODO Auto-generated constructor stub
		this.accType=accType;
		this.bankName=bankName;
		this.balance=balance;
	}
}
