package com.bridgelabz;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HRS = 8;
    static final int PART_TIME_HRS = 4;
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;
    static void wagePerFullDay(){
        int daily_Wage = WAGE_PER_HOUR * FULL_DAY_HRS;
        System.out.println(daily_Wage);
    }
    static void wagePerPartTime(){
        int part_Time_Wage = PART_TIME_HRS * WAGE_PER_HOUR;
        System.out.println(part_Time_Wage);
    }
    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        int employeeCheck = (int)(Math.round((Math.random())*10))%3;
        if(employeeCheck == IS_FULL_TIME){
            System.out.println("Employee is present");
        } else if(employeeCheck == IS_PART_TIME){
            System.out.println("Employee is part-time");
        }else{
            System.out.println("Employee is absent");
        }
        System.out.println("Daily Wage per Full-Time Employee : ");
        wagePerFullDay();
        System.out.println("Daily Wage per Part-Time Employee : ");
        wagePerPartTime();
    }
}
