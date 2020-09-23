package com.capgemini;

public class EmployeewageBuilderUC3 {
	public static final int IsFullTime=1;
	public static final int IsPartTime=2;
	public static final int wagePerHour=20;

	public static void main(String[ ] args){

		int empHours=0;
		int empWage=0;
		
		int empCheck=(int)Math.floor(Math.random()*10)%3;
		if (empCheck==IsFullTime)
			empHours=8;
		else if(empCheck==IsPartTime)
			empHours=4;
		else
			empHours=0;
		empWage=empHours*wagePerHour;
		System.out.println("Employee Wage : "+empWage);
	}
}

