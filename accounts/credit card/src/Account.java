import java.util.*;

public class Account {

  private int id;

  private double balance;

  private double annualInterestRate;

  private Date dateCreated;

  public Account() {
  }

   
  public Account (int accountId, double startingBalance, double startingAnnualInterestRate, Date accountDate){
      id = accountId;
      balance = startingBalance;
      annualInterestRate = startingAnnualInterestRate;
      dateCreated = accountDate;
      
      
  }


  public int setId() {

  return id;
  
  }

  public double setBalance() {
    
  return getBalance();
  }

  public double getAnnualInterestRate() {
  return annualInterestRate;
  }

  public Date getdateCreated() {

  return dateCreated;
  }

  public static double getMonthlyInterestRate(double annualInterestRate) {
      double monthlyInterest = annualInterestRate / 12;
  return monthlyInterest;
  }

  public void withdraw(double balance, double withdrawAmount) {
      if (withdrawAmount <= balance){
          balance -= withdrawAmount;
          
      }
      else {System.out.println("Not enough money");}

        
  }

  public void deposit(double balance, double depositAmount) {

        balance += depositAmount;

  }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

}

