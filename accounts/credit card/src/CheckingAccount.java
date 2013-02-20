import java.util.*;
public class CheckingAccount extends Account {
    private int overdraft = 5;


    public CheckingAccount(){
        
        
    }
    public CheckingAccount(int id, double balance, double annualInterestRate, Date dateCreated){
        super(id, balance, annualInterestRate, dateCreated);
    }
    public void overdraft(double balance, double withdrawAmount){
        if (withdrawAmount >= balance){
            balance = balance - withdrawAmount - overdraft;
        }
        else {balance -= withdrawAmount;}
    }

    public void statements(){
        System.out.println(super.toString());
    }

    public int getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(int overdraft) {
        this.overdraft = overdraft;
    }

}
