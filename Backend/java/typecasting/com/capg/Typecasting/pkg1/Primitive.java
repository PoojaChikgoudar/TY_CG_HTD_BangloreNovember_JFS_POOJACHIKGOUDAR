package com.capg.Typecasting.pkg1;

public class Primitive {
	//implicit typecasting
	byte b=2;
	short s=b;
	int i=b;
	long l=b;
	double b1=b;
	float f=b;
	
	void values() {
		System.out.println("int is " +i);
		System.out.println("short is " +s);
		System.out.println("long is " +l);
		System.out.println("float is " +f);
		System.out.println("double is " +b1);
	}
	//explicit casting
	double pi=3.142;
	int c=(int)pi;
	char c1='a';
	int b2=c1;
	
	void details() {
		System.out.println("int value is "+c);
		System.out.println("double value is "+pi);
		System.out.println(b2);
	}
	

}
