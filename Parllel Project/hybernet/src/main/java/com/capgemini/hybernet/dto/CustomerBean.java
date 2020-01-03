package com.capgemini.hybernet.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Data
@Entity
@Table(name="customer")
public class CustomerBean {
	@Column(name="customerid")
	@Id
	private int customerId;
	@Column(name="customername")
	private String customerName;
	@Column(name="streetadress1")
	private String streetAdress1;
	@Column(name="streetadress2")
	private String streetAdress2;
	@Column
	private String town;
	@Column(name="postalcode")
	private int postalCode;
	@Column
	private String email;
	@Column(name="telephone")
	private long telephoneNumber;

}
