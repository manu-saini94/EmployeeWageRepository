package com.bridgelabz.empwage;

import java.util.Random;

public class EmployeeWage {

    static final int WAGE_PER_HOUR = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employeewage");
        int randomVal = (int)Math.floor(Math.random()*10) % 2;
        if(randomVal == 1) {
            int empHrs = 8;
            int empWage = WAGE_PER_HOUR*empHrs;
            System.out.println("Emp Wage:"+ empWage);
            System.out.println("Employee is present");
        }
        else {
            System.out.println("Employee is absent");
        }






    }



}
