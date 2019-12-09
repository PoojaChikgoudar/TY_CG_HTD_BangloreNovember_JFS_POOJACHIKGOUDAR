package com.capgemini.jdbc.bean;

import java.io.Serializable;

import lombok.Data;


@Data
public class UserBean implements Serializable {
	private int user_id;
	private String username;
	private String usermail;
	private String password;
//	public int getUser_id() {
//		return user_id;
//	}
//	public void setUser_id(int user_id) {
//		this.user_id = user_id;
//	}
//	public String getUsername() {
//		return username;
//	}
//	public void setUsername(String username) {
//		this.username = username;
//	}
//	public String getUsermail() {
//		return usermail;
//	}
//	public void setUsermail(String usermail) {
//		this.usermail = usermail;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}	

}
