package com.bridgelabz;

public class EmployeeWage {
    public static void main(String[] args){
        System.out.println("Welcome to Employee Wage Computation Program on Master Branch");
        int x = (int)(Math.round((Math.random())*10))%2;
        if(x == 1){
            System.out.println("Employee is present");
        } else{
            System.out.println("Employee is absent");
        }
    }
}
