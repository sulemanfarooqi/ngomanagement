package com.sulemanfarooqi.ngomanagement.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Donation implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	//First Name & Last Name from Entity: User
	private Date date;
	private int amount;
	private String donationType;
}
