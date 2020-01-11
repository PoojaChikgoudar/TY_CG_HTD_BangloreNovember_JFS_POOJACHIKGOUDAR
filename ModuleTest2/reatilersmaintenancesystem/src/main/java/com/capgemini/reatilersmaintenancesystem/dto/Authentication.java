package com.capgemini.reatilersmaintenancesystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table( name = "authenticate")
public class Authentication {
	
	@Id
	@GeneratedValue
	@Column
	private int user_id;
	
	@Column
	private String name;
	
	@Column(unique = true)
	private String email;    
	
	@Column
	private Long phone;
	
	@Column
	private String password;
	
	@Column
	private String role;
	
	@Column
	private String gender;

}
