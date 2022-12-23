package com.bridgelabz;

public class EmployeeWage {
    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HRS = 8;
    static final int PART_TIME_HRS = 4;
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;
    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computation");
        int employeeCheck = (int) Math.floor(Math.random() * 10) % 3;
        switch (employeeCheck) {
            case IS_FULL_TIME:
                System.out.println("Employee is Present for Full Time");
                int daily_Wage = WAGE_PER_HOUR * FULL_DAY_HRS;
                System.out.println("Daily Wage per Full-Time Employee : "+daily_Wage);
                break;
            case IS_PART_TIME:
                System.out.println("Employee is Part_Time");
                int daily_Wage = WAGE_PER_HOUR * PART_TIME_HRS;
                System.out.println("Daily Wage per Part-Time Employee : "+daily_Wage);
                break;
            default:
                System.out.println("Employee is Absent");
        }
    }
}
