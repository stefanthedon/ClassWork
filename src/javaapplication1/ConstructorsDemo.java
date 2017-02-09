/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author 11314
 */
        
public class ConstructorsDemo {
    double interest;
    int accountNumber;
    float accountBalance;
    
    public ConstructorsDemo(int accountNumber, float accountBalance, double interest){
        interest = 18.5;
        accountNumber = 6023;
        accountBalance = 20000;        
    }
    
    public static void main(String[] args){
        ConstructorsDemo newAccount = new ConstructorsDemo(3,12,123.123);
        System.out.println("Parameter 1 = " + newAccount.accountNumber + " Parameter 2 = " + newAccount.accountBalance + " Parameter 3 = " + newAccount.interest);
    }
    
}
