package com.capgemini.jdbc.controller;

import java.util.Scanner;

public class ClientHome {
public static void main() {
		
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("******Welcome to ClientHomePage******");
			System.out.println("Enter the choice");
			System.out.println("1.Contract");
			System.out.println("2.Product");
			
			System.out.println("3.Order");
			System.out.println("4.Back to Main page");
			
			int choice=sc.nextInt();
			switch(choice) {
			case 1:ContractMain.main();
			break;
			case 2:ProductMain.main();
			break;
			case 3:OrderMain.main();
			break;
			
			case 4:AdminMain.main();
			break;
			}
			
			
		}
		}

}
