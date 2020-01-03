package com.capgemini.jdbc.controller;

import java.util.List;
import java.util.Scanner;

import com.capgemini.jdbc.bean.ContractBean;
import com.capgemini.jdbc.factory.ContractDAOManager;

import com.mysql.jdbc.services.ContractService;


public class ContractMain {

	public static void main() {

		ContractService service=ContractDAOManager.instanceOfContractService();
		ContractBean user=new ContractBean();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("1.List all contracts");
			System.out.println("2.insert contract details");
			System.out.println("3.delete contract details");
			System.out.println("4.update contract details");
			System.out.println("5.Clienthome");

			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				List<ContractBean> list=service.getAllContracts();
				if(list!=null) {
					for(ContractBean contract:list) {
						System.out.println(contract);
					}
				}
				break;

			case 2:
				ContractBean bean1=new ContractBean();
				boolean idmatcher=false;
				String idregexpr="^[0-9][0-9]{1,20}$";
				boolean flag1=false;
				while(!flag1){
					try {
						System.out.println("enter contract no");

						System.out.println("Id should contain  numbers only..");
						int contractno=sc.nextInt();
						flag1=true;
						String id1=Integer.toString(contractno);

						idmatcher=id1.matches(idregexpr);

						if(idmatcher) {
							bean1.setContractNo(contractno);
						}
						else {
							
							System.out.println("Invalid contractno");
						}
					}catch(Exception e) {
						sc.next();
						System.out.println("Invalid input");
					}	
				}
				
				
				boolean idmatcher5=false;
				String idregexpr5="^[0-9][0-9]{1,20}$";
				boolean flag4=false;
				while(!flag4){
					try {
						System.out.println("enter customer id");

						System.out.println("Id should contain  numbers only..");
						int customerId=sc.nextInt();
						flag4=true;
						String id1=Integer.toString(customerId);

						idmatcher5=id1.matches(idregexpr5);

						if(idmatcher5) {
							bean1.setCustomerId(customerId);
						}
						else {
							
							System.out.println("Invalid customerid");
						}
					}catch(Exception e) {
						sc.next();
						System.out.println("Invalid input");
					}	
				}

				boolean idmatcher1=false;
				String idregexpr1="^[0-9][0-9]{1,20}$";
				boolean flag2=false;
				while(!flag2){
					try {
						System.out.println("enter product id");

						System.out.println("Id should contain  numbers only..");
						int productId=sc.nextInt();
						flag2=true;
						String id1=Integer.toString(productId);

						idmatcher1=id1.matches(idregexpr1);

						if(idmatcher1) {
							bean1.setProductId(productId);
						}
						else {
							
							System.out.println("Invalid productid");
						}
					}catch(Exception e) {
						sc.next();
						System.out.println("Invalid input");
					}	
				}
				
				boolean idmatcher2=false;
				String idregexpr2="^[0-9][0-9]{1,20}$";
				boolean flag3=false;
				while(!flag3){
					try {
						System.out.println("enter haulier id");

						System.out.println("Id should contain  numbers only..");
						int haulierId=sc.nextInt();
						flag3=true;
						String id1=Integer.toString(haulierId);

						idmatcher2=id1.matches(idregexpr2);

						if(idmatcher2) {
							bean1.setHaulierId(haulierId);
						}
						else {
							
							System.out.println("Invalid haulierid");
						}
					}catch(Exception e) {
						sc.next();
						System.out.println("Invalid input");
					}	
				}
				
				
				
				

				boolean datematcher;
				do {
					System.out.println("enter delivery date in yyyy-mm-dd format");
				System.out.println("Id should contain 4 numbers..");
				String deliveryDate=sc.next();
				
				String reg="\\d{4}-\\d{2}-\\d{2}";
				datematcher=deliveryDate.matches(reg);
				
				if(!datematcher) 
					System.out.println("Invalid id");
					
				
				else {
					bean1.setDeliveryDate(deliveryDate);
				}
				}while(!datematcher);
				
				System.out.println("enter deliveryday");
				String deliveryDay=sc.next();
				
				
				
				
				boolean idmatchers;
				do {
					System.out.println("enter quantity");
				
				int quantity=sc.nextInt();
				String id4=Integer.toString(quantity);
				String idregexpr4="^[0-9]{0,9999999999}$";
				idmatchers=id4.matches(idregexpr4);
				
				if(!idmatchers) 
					System.out.println("Invalid id");
					
				
				else {
					bean1.setQuantity(quantity);
				}
				}while(!idmatchers);
				
				
				
				
				bean1.setDeliveryDay(deliveryDay);
				

				boolean check=service.add(bean1);
				if(check==true) {
					System.out.println("contract added to list");
				}
				else {

					System.out.println("contract id is repeated");
				}
				break;


			case 3:System.out.println("Enter the contractno to delete");
			int contractno1=sc.nextInt();

			boolean check1=service.deleteUser(contractno1);
			if(check1) {
				System.out.println("Deleted..");
			}
			else {
				System.out.println("contractno not present");
			}
			break;
			case 4:System.out.println("enter the contractno");
			int contractno=sc.nextInt();
			ContractBean bean2=new ContractBean();

			System.out.println("enter haulierid to be modified");
			bean2.setHaulierId(sc.nextInt());
			System.out.println("enter deliverydate to be modified");
			bean2.setDeliveryDate(sc.next());
			System.out.println("enter deliveryday to be modified");
			bean2.setDeliveryDay(sc.next());
			System.out.println("enter quantity to be modified");
			bean2.setQuantity(sc.nextInt());


			boolean check2=service.modify(contractno,bean2);
			if(check2) {
				System.out.println("modified..");
			}
			else {
				System.out.println("Enter the correct contractno");
			}
			break;
			case 5:ClientHome.main();
			break;
			}
		}


	} 

}


