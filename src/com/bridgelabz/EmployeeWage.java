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
        System.out.println("Welcome to Employee Wage Computation");
        int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (employeeCheck) {
            case IS_FULL_TIME:
                System.out.println("Employee is Present for Full Time");
                System.out.println("Daily Wage per Full-Time Employee : ");
                wagePerFullDay();
                break;
            case IS_PART_TIME:
                System.out.println("Employee is Part_Time");
                System.out.println("Daily Wage per Part-Time Employee : ");
                wagePerPartTime();
                break;
            default:
                System.out.println("Employee is Absent");
        }
    }
}
