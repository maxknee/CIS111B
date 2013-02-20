
import java.util.*;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maxknee1
 */
public class ArrayException {
    public static void main(String[]args){
        
        int[] random = new int[100];
        Random insertNumber = new Random();
        for (int i = 0; i < random.length; i++){
            random[i] = insertNumber.nextInt(); 
        }
        boolean continueInput = true;
        
        do{
            try{
                Scanner in = new Scanner(System.in);
                System.out.println("Please enter a number of the array ");
                int userInput = in.nextInt();
                System.out.println(random[userInput]);
                continueInput = false;
                
            }
            catch(ArrayIndexOutOfBoundsException ex) {
                System.out.println("Number not in index of array");
                
            }
           
        } while(continueInput);
        
        
        
        
    }
    
}
