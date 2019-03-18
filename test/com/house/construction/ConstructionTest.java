package com.house.construction;

import static org.junit.Assert.*;

import org.junit.Test;

public class ConstructionTest {
	Construction object=new Construction();
	
	@Test
	public void Construction_Test_Pass() {

			//test cases for standard materials
			assertEquals(" Excuted successfully ",180000,object.cost(1,150),0.0);
			assertEquals(" Excuted successfully ",936000,object.cost(1,780),0.0);
			assertEquals(" Excuted successfully ",1068720,object.cost(1,890.6),0.0);
			
			//test cases for above standard materials
			assertEquals(" Excuted successfully ",2250000,object.cost(2,1500),0.0);
			assertEquals(" Excuted successfully ",3000000,object.cost(2,2000),0.0);
			assertEquals(" Excuted successfully ",1148700,object.cost(2,765.8),0.0);
			
			//test cases for high standard materials
			assertEquals(" Excuted successfully ",1476000,object.cost(3,820),0.0);
			assertEquals(" Excuted successfully ",3165840,object.cost(3,1758.8),0.0);
			assertEquals(" Excuted successfully ",13777200,object.cost(3,7654),0.0);
			
			//test cases fully automated home 
			assertEquals(" Excuted successfully ",4995000,object.cost(4,1998),0.0);
			assertEquals(" Excuted successfully ",2247500,object.cost(4,899),0.0);
			assertEquals(" Excuted successfully ",4387250,object.cost(4,1754.9),0.0);

}
	
	@Test
	public void Construction_Test_Fail() {

			//test cases which fail for standard materials
		assertFalse(" Excuted successfully ",180000!=object.cost(1,150));
		assertFalse(" Excuted successfully ",936000!=object.cost(1,780));
		assertFalse(" Excuted successfully ",1068720!=object.cost(1,890.6));
			
			//test cases which fail for above standard materials
		assertFalse(" Excuted successfully ",2250000!=object.cost(2,1500));
		assertFalse(" Excuted successfully ",3000000!=object.cost(2,2000));
		assertFalse(" Excuted successfully ",1148700!=object.cost(2,765.8));
			
			//test cases which fail for high standard materials
		assertFalse(" Excuted successfully ",1476000!=object.cost(3,820));
		assertFalse(" Excuted successfully ",3165840!=object.cost(3,1758.8));
		assertFalse(" Excuted successfully ",13777200!=object.cost(3,7654));
			
			//test cases which fail fully automated home 
		assertFalse(" Excuted successfully ",4995000!=object.cost(4,1998));
		assertFalse(" Excuted successfully ",2247500!=object.cost(4,899));
		assertFalse(" Excuted successfully ",4387250!=object.cost(4,1754.9));

}
	
}