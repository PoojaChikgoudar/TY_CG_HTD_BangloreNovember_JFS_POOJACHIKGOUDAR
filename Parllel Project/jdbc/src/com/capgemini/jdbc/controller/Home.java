package com.capgemini.jdbc.controller;

import java.util.Scanner;

import com.capgemini.jdbc.controller.ContractMain;
import com.capgemini.jdbc.controller.CustomerMain;
import com.capgemini.jdbc.controller.ProductMain;

public class Home {

	public static void main() {
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("******Welcome to HomePage******");
			System.out.println("Enter the choice");
			System.out.println("1.Customer");
			System.out.println("2.Product");
			System.out.println("3.Haulier");
			System.out.println("4.Land");
			System.out.println("5.client");
			System.out.println("6.Back to AdminHome page");
			
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
