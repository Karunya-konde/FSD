package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;

import lombok.Data;

@Data
@Entity
public class Account {
	private long accountNumber;
	@Column(name="account_type")
	private AccountType accountType;
	@Column(name="active_status")
	private boolean isActive;
	

}
