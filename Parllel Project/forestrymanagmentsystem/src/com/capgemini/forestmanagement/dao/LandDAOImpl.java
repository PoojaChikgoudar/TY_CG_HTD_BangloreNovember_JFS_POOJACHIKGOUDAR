package com.capgemini.forestmanagement.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



import com.capgemini.forestrymanagement.bean.LandBean;

public class LandDAOImpl implements LandDAO{
	List<LandBean> beans=new ArrayList<LandBean>();
	Scanner sc=new Scanner(System.in);

	

	@Override
	public boolean add(LandBean bean) {
		for(LandBean landbean:beans) {
			if(landbean.getLandId()==bean.getLandId())
			{
				return false;
			}
		}
		beans.add(bean);
		return true;
		
	}



	@Override
	public List<LandBean> getAllLandDetails() {
		// TODO Auto-generated method stub
		return beans;
	}



	@Override
	public boolean delete(int landId) {
		for(LandBean landbean:beans) {
			LandBean bean=null;
			if(landbean.getLandId()==landId) {
       			bean=landbean;
				
			}

		if(bean!=null) {
			beans.remove(bean);
			return true;
			}
		}
		
		return false;
	}



	@Override
	public boolean modify(int landId) {
		for(LandBean landBean:beans) {
			if(landBean.getLandId()==landId) {
				
				System.out.println("choose feild to be modified\n1.landcost\n2.landOwner\n");
				int c=sc.nextInt();
				switch(c) {
				case 1:boolean costmatcher;
				do {
					System.out.println("enter landcost to be modified");
				
				int landcost=sc.nextInt();
				String id1=Integer.toString(landcost);
				String idregexpr="^[0-9][0-9]{0,99999999999}$";
				costmatcher=id1.matches(idregexpr);
				
				if(!costmatcher) 
					System.out.println("Invalid cost");
					
				
				else {
					landBean.setLandCost(landcost);
				}
				}while(!costmatcher);
				break;
				
				
				
				case 2:
				boolean flag;
				do {
					String nameregexpr="^[A-Z][a-z]*";
					System.out.println("enter land location to be modified");
				System.out.println("should enter in capitalized format");
				String landlocation=sc.next();
				flag=landlocation.matches(nameregexpr);
				if(!flag)
					System.out.println("Invalid...Please Enter alphabets only");
				else {
					landBean.setLandlocation(landlocation);
				}
				}while(!flag);
				break;
				case 3:
				boolean landownermatches;
				do {
					String nameregexpr="^[A-Z][a-z]*";
					System.out.println("enter land Ownername to be modified");
				System.out.println("should enter in capitalized format");
				String landowner=sc.next();
				landownermatches=landowner.matches(nameregexpr);
				if(!landownermatches)
					System.out.println("Invalid...Please Enter alphabets only");
				else {
					landBean.setLandOwner(landowner);
				}
				}while(!landownermatches);

				
				break;
				
				default:
					break;
				}
				
				}
				
			
			
			return true;
			
		}
		
		return false;
	}



	@Override
	public LandBean getlanddetails(int landId) {
		for(LandBean landbean:beans) {
			if(landbean.getLandId()==landId) {
				return landbean;
			}

		}

		return null;
	}
		

	

}
