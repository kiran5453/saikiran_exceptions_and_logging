package com.epam_task4;
import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
class App extends find_interest
{
	
	void Ap()
	{
		Logger LOGGER =LogManager.getLogger(App.class);
		Scanner s=new Scanner(System.in);
		LOGGER.info("Enter the type of interest you want to find\n1.SIMPLE INTEREST\n2.COMPOUND INTEREST");
		int type=s.nextInt();
		if(type==1)
		{
			LOGGER.info("Enter the principal amount");
			float principal_amount=s.nextFloat();
			LOGGER.info("Enter number of years");
			int years=s.nextInt();
			LOGGER.info("Enter rate of interest");
			float rate_of_interest=s.nextFloat();
			LOGGER.info("Simple interest is "+simple_interest(principal_amount,years,rate_of_interest));
		}
		else if(type==2)
		{
			LOGGER.info("Enter the principal amount");
			float principal_amount=s.nextFloat();
			LOGGER.info("Enter number of times to be calculated");
			int times_calc=s.nextInt();
			LOGGER.info("Enter number of years");
			int years=s.nextInt();
			LOGGER.info("Enter rate of interest");
			float rate_of_interest=s.nextFloat();
			LOGGER.info("Compound interest is "+compound_interest(principal_amount,times_calc,years,rate_of_interest));
		}
		else
		{
			LOGGER.info("Enter valid type of interest number");
		}
	s.close();
	}
	public static void main(String args[])
	{
		Logger LOGGER =LogManager.getLogger(App.class);
		App obj1=new App();
		obj1.Ap();
		LOGGER.info("This is info");
		LOGGER.debug("This is debug");
		LOGGER.warn("This is warn");
		LOGGER.error("This is error");
		
	}
}
