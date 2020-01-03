package com.capgemini.forestrymanagement.bean;

public class Schedular {
	private int contractNo;
	private String status;
	public int getContractNo() {
		return contractNo;
	}
	public void setContractNo(int contractNo) {
		this.contractNo = contractNo;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Schedular [contractNo=" + contractNo + ", status=" + status + "]";
	}
	

}
