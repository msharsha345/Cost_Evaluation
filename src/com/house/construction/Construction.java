package com.house.construction;

public class Construction {
	
	/*
	 * method for cost evaluation for construction
	 */
	
	public double cost(int choice,double area)
	{
		double total_cost=0;
		switch(choice)
		{

		case 1: total_cost=area*1200.0;
				break;
		case 2: total_cost=area*1500.0;
				break;
		case 3: total_cost=area*1800.0;
				break;
		case 4: total_cost=area*2500.0;
				break;
		
		}
		return total_cost;
		
		
}
}
