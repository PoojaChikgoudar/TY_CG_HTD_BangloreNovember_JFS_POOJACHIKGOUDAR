package com.capgemini.forestmanagement.dao;

import java.util.ArrayList;
import java.util.List;


import com.capgemini.forestrymanagement.bean.Schedular;

public class SchedulerDaoImpl implements SchedulerDao{
private static List<Schedular> beans=new ArrayList<Schedular>();
	@Override
	public boolean add(Schedular scheduler) {
		for(Schedular bean:beans) {
			if(bean.getContractNo()==bean.getContractNo())
			{
				return true;
			}
		}
		
		return false;

}
}
