package com.capgemini.forestrymanagement.bean;

public class OrderBean {
	private int orderid;
	private String customername;
	private String productname;
	private String hauliername;
	private String deliverydate;
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getHauliername() {
		return hauliername;
	}
	public void setHauliername(String hauliername) {
		this.hauliername = hauliername;
	}
	public String getDeliverydate() {
		return deliverydate;
	}
	public void setDeliverydate(String deliverydate) {
		this.deliverydate = deliverydate;
	}
	@Override
	public String toString() {
		return "OrderBean [orderid=" + orderid + ", customername=" + customername + ", productname=" + productname
				+ ", hauliername=" + hauliername + ", deliverydate=" + deliverydate + "]";
	}
	

}
