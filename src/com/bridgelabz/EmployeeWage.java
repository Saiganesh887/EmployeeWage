package com.bridgelabz;

public class EmployeeWage {
    static int WAGE_DAY_HOUR = 20;
    static int FULL_DAY_HRS = 8;
         
    static void wagePerFullDay(){
           int daily_wage = WAGE_DAY_HOUR * FULL_DAY_HRS;
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
