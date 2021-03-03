package com.collinskandie;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //call selection
        selection();
    }
    public static void selection(){
        //variables and scanner class
        Scanner scanner = new Scanner(System.in);
        int choice;
        do{
        menu();
        choice= scanner.nextInt();
            switch (choice) {
                case 1 -> personaDetails();
                case 2 -> ternaryOperator();
                case 3 -> examGrading();
                default -> quit();
            }
        }while(choice<4);
    }
    public static void menu(){
        System.out.println("Help On:");
        System.out.println("1. If statement.");
        System.out.println("2. Ternary Operator");
        System.out.println("3. If... else statement");
    }

    public static void personaDetails() {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age;
        System.out.println("Enter your name");
        name= scanner.next();
        System.out.println("Enter your age");
        age= scanner.nextInt();

        //display name and age
        System.out.println("Your name is:"+name);
        System.out.println("your age is:"+age);
         if(age >17){
             System.out.println("You are eligible to vote");
         }
    }
    public static void ternaryOperator(){
        Scanner scanner = new Scanner(System.in);
        int num1,num2,max;

        //input two numbers
        System.out.println("Enter the first number");
        num1=scanner.nextInt();
        System.out.println("Enter the second number");
        num2=scanner.nextInt();
        max=num1>num2? num1:num2;
        System.out.println("The largest number is"+max);

    }
    public static void examGrading(){
        Scanner scanner = new Scanner(System.in);
        int examMark;
        String grade;

        //prompt the user for input.
        System.out.println("Enter the exam mark");
        examMark=scanner.nextInt();

        if(examMark>80){
            grade="A";
        }else if(examMark>61){
            grade="B";
        }else if(examMark>41){
            grade="C";
        }
        else{
            grade="F";
        }
        System.out.println("Your grade is "+grade);
    }
    public static void quit(){
        //exit the system
        System.out.println("Invalid choice");
        System.out.println("Exiting ....");
    }
}
