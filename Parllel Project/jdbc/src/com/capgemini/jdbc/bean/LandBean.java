package com.capgemini.jdbc.bean;

public class LandBean {
	private int landId;

	private String landlocation;
	private String landOwner;
	public String getLandOwner() {
		return landOwner;
	}
	public void setLandOwner(String landOwner) {
		this.landOwner = landOwner;
	}
	public int getLandId() {
		return landId;
	}
	public void setLandId(int landId) {
		this.landId = landId;
	}
	
	@Override
	public String toString() {
		return "LandBean [landId=" + landId + ", landlocation="  + landlocation
				+ ", landOwner=" + landOwner + "]";
	}
	public String getLandlocation() {
		return landlocation;
	}
	public void setLandlocation(String landlocation) {
		this.landlocation = landlocation;
	}
	


}
