import java.util.*;

public class SavingsAccount extends Account {
    public SavingsAccount(){
        
    }
    public SavingsAccount(int id, double balance, double annualInterestRate, Date dateCreated){
        super(id, balance, annualInterestRate, dateCreated);
        
    }
    public boolean overdraft(double balance, double withdraw){
        if (withdraw > balance){
            return true;
        }
        else {return false;}

    }
    public String toString(){
        return super.toString();
        
    }
    
    
    
}
