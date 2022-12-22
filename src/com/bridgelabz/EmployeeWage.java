package com.bridgelabz;

public class EmployeeWage {
    static int wage_per_hour = 20;
    static int full_day_hrs = 8;
    static void wagePerFullDay(){
        int daily_wage = wage_per_hour * full_day_hrs;
        System.out.println(daily_wage);
    }
    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        int x = (int)(Math.round((Math.random())*10))%2;
        if(x == 1){
            System.out.println("Employee is present");
        } else{
            System.out.println("Employee is absent");
        }
        System.out.println("Daily Wage is: ");
        wagePerFullDay();
    }
}
