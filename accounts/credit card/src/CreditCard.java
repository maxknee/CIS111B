
/*
 * CreditCard.java class file.
 * This file is different than the 8.7 homework
 * It has some names changed to compensate for payments and charges on the account.
 * Also a monthly interest method has been added to calculate interest for the end of the month.
 * 
 */
public class CreditCard {

  private int id;

  private double balance;

  private double monthlyInterestRate;


  public CreditCard() {
  }

  
   
  public CreditCard (int id, double balance, double monthlyInterestRate){
      this.id = id;
      this.balance = balance;
      this.monthlyInterestRate = monthlyInterestRate;
  
  }



  public double getMonthlyInterestRate() {
  return monthlyInterestRate;
  }


  public void payment(double balance, double paymentAmount) {


        balance =- paymentAmount;

  }

  public void charge(double balance, double chargeAmount) {
        balance += chargeAmount;

  
  }
  public double monthlyInterest(double balance, double monthlyInterestRate){
      double newBalance = balance;
      if (balance > 0){
          double monthlyCharge = balance * monthlyInterestRate;
          newBalance = balance + monthlyCharge;
      }
      return newBalance;
  }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double setBalance() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

}

