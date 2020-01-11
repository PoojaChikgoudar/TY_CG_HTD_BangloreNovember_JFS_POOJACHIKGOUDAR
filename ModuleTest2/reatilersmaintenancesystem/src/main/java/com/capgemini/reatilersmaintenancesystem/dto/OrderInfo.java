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
public class OrderInfo {
	@Id
	@Column
	@GeneratedValue
private int orderId;
	@Column
private int user_id;
	@Column
private int product_id;

}
