package com.capgemini.reatilersmaintenancesystem.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table
public class UserInfo {
	@Id
	@Column
	@GeneratedValue
private int user_id;
	@Column
private String name;
	@Column(unique=true,nullable=false)
private String email;
	@Column
private String password;
}
