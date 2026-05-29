/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mathscalculator;

/**
 *
 * @author Ofentse
 */
import java.util.Scanner;

public class MathsCalculator {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        // ask user to enter two number 
        System.out.print("Enter the first number:");
        int num1 = kbd.nextInt();
        
        System.out.print("Enter the second number:");
        int num2 = kbd.nextInt();
        
        // ask user for the operator 
        System.out.println("What would you like to do ?");
        System.out.println("A to add");
        System.out.println("S to subtract");
        System.out.println("M to multiply");
        System.out.println("D to divide");
        
        System.out.print("Enter choice:");
        char calculation= kbd.next().charAt(0);
        
        switch (calculation) {
            case 'A':
                System.out.println(num1 + " plus " + num2 + " is " + (num1 + num2));
                break;
            case 'S':
                System.out.println(num1 + " minus " + num2 + " is " + (num1 - num2));
                break;
            case 'M':
                System.out.println( num1 + " multiply " + num2 + " is " + (num1 * num2));
                break;
            case 'D':
                if (num2 != 0){
                     System.out.println( num1 + " divide " + num2 + " is " + ((double) num1 / num2));
                } else{
                    System.out.println("**Error** Cannot divide by zero.");
                } 
                break;
            Default:
               System.out.println("**Error** Invalid input. please enter A,S,M,D );
                break;
        }  
kbd.close();
    }
}
