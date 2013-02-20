import java.util.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mknee000
 */
public class TestAccount2 {
    public static void main(String[] args){
        double withdraw = 2000;
        double deposit = 1000;
        double balance = 3000;
        Date today = new Date();
        SavingsAccount savings = new SavingsAccount(1, balance, .02, today);
        
        if (savings.overdraft(savings.getBalance(), withdraw)){
            savings.withdraw(withdraw);
        }
        savings.deposit(deposit);
        System.out.println(savings);
        withdraw = 100;
        deposit = 30;
        CheckingAccount checking = new CheckingAccount(2, 150, .02, today);
        checking.overdraft(checking.getBalance(), withdraw);
        checking.deposit(deposit);
        
        System.out.println(checking);
        

        
    }
    
}
