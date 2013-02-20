/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maxknee1
 */
public class InvalidPriceException extends Exception {
    private double price;

   
    public InvalidPriceException(double price) {
        super("Invalid price " + price);
        this.price = price;
    }
    public double getPrice(){
        return price;
    }

    
    
}
