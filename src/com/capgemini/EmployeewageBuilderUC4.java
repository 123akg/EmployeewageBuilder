package com.capgemini;

public class EmployeewageBuilderUC4 {
	public static final int IsFullTime=1;
	public static final int IsPartTime=2;
	public static final int wagePerHour=20;

	public static void main(String[ ] args){

		int empHours=0;
		int empWage=0;

		int empCheck=(int)Math.floor(Math.random()*10)%3;
		switch(empCheck){
			case IsFullTime:
				empHours=8;
				break;
			case IsPartTime:
				empHours=4;
				break;
			default:
			empHours=0;
			break;
		}
		empWage=empHours*wagePerHour;
		System.out.println("Employee Wage : "+empWage);
	}
}


