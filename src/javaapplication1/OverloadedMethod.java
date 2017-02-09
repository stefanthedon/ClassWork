/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author 11314
 */
public class OverloadedMethod {
    public void nameChecker(String s, float a){
        System.out.println("s " + "- " + "a");
    }
    
    public float nameChecker(int a, float b){
        while (a < 10){
            return b;
        }
        return 0;
    }
    
    public double nameChecker(double a, double b){
        double averageTime = a / b;
        return averageTime;
    }
    
    private static Scanner ab=new Scanner (System.in);
    public static void main(String[] args){
        OverloadedMethod m = new OverloadedMethod();
        System.out.println("Input first number");
        float a = ab.nextFloat();
        System.out.println("Second number");
        float b = ab.nextFloat();
                
        System.out.println("Time = " + m.nameChecker(a,b));
    }
}
