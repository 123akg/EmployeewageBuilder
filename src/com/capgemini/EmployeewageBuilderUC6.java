package com.capgemini;

public class EmployeewageBuilderUC6 {
	public static final int IsFullTime=1;
	public static final int IsPartTime=2;
	public static final int wagePerHour=20;
	public static final int maxWorkingDays=20;
	public static final int maxHours=100;

	public static void main(String[ ] args){

		int empHours=0;
		int totalEmpHours=0;
		int totalWorkingDays=0;
		int totalEmpWage=0;
		while(totalEmpHours<=maxHours && totalWorkingDays<=maxWorkingDays){
			totalWorkingDays++;
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
			}
			totalEmpHours+=empHours;
			System.out.println("Day : "+totalWorkingDays+" Employee Hours : "+empHours);
		}
		totalEmpWage+=totalEmpHours*wagePerHour;
		System.out.println("Total Employee Wage : "+totalEmpWage);
	}


}
