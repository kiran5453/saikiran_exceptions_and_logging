package com.epam_task4;
class house_cost
{
	float find_cost(int choice,float area)
	{
		if (choice==4)
		{
			return 2500*area;
		}
		else
		{
			return 300*(choice+3)*area;
		}
	}
}
