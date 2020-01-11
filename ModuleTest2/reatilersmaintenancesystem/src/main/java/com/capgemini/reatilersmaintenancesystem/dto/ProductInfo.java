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
public class ProductInfo {
	@Id
	@Column
	@GeneratedValue
private int product_id;
	@Column
private int user_id;
	@Column(unique=true,nullable=false)
private String name;
	@Column
private int quantity;
	@Column
private String details;
}
