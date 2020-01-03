package com.capgemini.forestManagementSystem.controller;

import java.util.Scanner;

public class Home {

	public static void main() {
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("******Welcome to Home Page******");
			System.out.println("Enter the choice");
			System.out.println("1.Customer");
			System.out.println("2.Product");
			System.out.println("3.Haulier");
			System.out.println("4.Land");
			System.out.println("5.Client");
			System.out.println("6.Main page");
			
			int choice=sc.nextInt();
			switch(choice) {
			case 1:CustomerMain.main();
			break;
			case 2:ProductMain.main();
			break;
			case 3:HaulierMain.main();
			break;
			case 4:LandMain.main();
			break;
			case 5:ClientMain.main();
			break;
			case 6:AdminMain.main();
			break;
			
			}
			
			
			
		}
	  

	}

}
