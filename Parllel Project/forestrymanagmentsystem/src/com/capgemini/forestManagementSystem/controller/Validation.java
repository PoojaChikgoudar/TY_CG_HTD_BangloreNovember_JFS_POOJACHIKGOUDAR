package com.capgemini.forestManagementSystem.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation {
	public static boolean isValidPhoneNo(String phone) {
		String regexp=("(0/91)?[6-9][0-9]{9}");
		Pattern pattern=Pattern.compile(regexp);
		Matcher matcher=pattern.matcher(phone);
		return matcher.matches();
		
	}

}
