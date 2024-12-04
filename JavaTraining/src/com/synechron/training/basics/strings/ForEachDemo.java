package com.synechron.training.basics.strings;

public class ForEachDemo {

	
	static String employeeDetails= "Name=Aravinda;EmployeeID=EMP123;Company=Synechron;Location=Bangalore";
	
	
	public static void main(String[] args) {
		
		String[] detailsArray = employeeDetails.split(";");
		
		for(String str : detailsArray)
		{
			System.out.println(str.split("=")[1]);
		}
	}
}
