
import java.util.*;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MKnee000
 */
public class TestAccount {
    public static void main (String[]args){
        Date d = new Date();
        Account test = new Account();         
        Account testAccount = new Account(1122, 20000, 4.5, d);
        System.out.println("");
        double monthlyInterest = Account.getMonthlyInterestRate(testAccount.getAnnualInterestRate());
        double withdrawAmt = 2500;
        double depositAmt = 3000;
        testAccount.deposit(testAccount.getBalance(), depositAmt);
        testAccount.withdraw(testAccount.getBalance(), withdrawAmt);
        System.out.printf("Final balance after transactions: $ %.2f Interest Rate: %.4f %n", testAccount.getBalance(), monthlyInterest);
        System.out.println("Date Account was Created: " + testAccount.getdateCreated());
        
        
        
        
    
  
    

    }

}