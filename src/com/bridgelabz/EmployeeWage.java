package com.bridgelabz;

public class EmployeeWage {
    static int WAGE_DAY_HOUR = 20;
    static int FULL_DAY_HRS = 8;
    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computation");
        int x = (int)(Math.round((Math.random())*10))%2;
        int daily_wage = WAGE_DAY_HOUR * FULL_DAY_HRS;
        if(x == 1){
            System.out.println("Employee is present");
            System.out.println("Daily Wage is: "+ daily_wage);
        } else{
            System.out.println("Employee is absent");
        }
    }
}
