/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maxknee1
 */
class FV {

         public double amount;
        public int year; 
         public double interestRate;
        public  FV(double amount, int year, double interestRate) { 
          
        }

        public static double getFV(){
            double monthlyInterest = getInterestRate() / 12;
            return getAmount() * Math.pow((1 + monthlyInterest),(getYear() *12));
        }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
       
    }