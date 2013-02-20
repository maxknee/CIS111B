/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maxknee1
 */
public class ExceptionCalculator {
    public static void main(String[]args){
        if (args.length != 3) {
            System.out.println( "Usage: java Calculator operand1 operator operand2");
            System.exit(0);
        }
        
        
            
       

        
        int result = 0;
        if(checkNumbers(args[0]) && checkNumbers(args[2])){
                      
        switch (args[1].charAt(0)) {
            case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]);
            break;
            case '-': result = Integer.parseInt(args[0]) + Integer.parseInt(args[3]);
                break;
            case '*': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]);
                break;
            case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]);
        
        }
        
        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
   
        } 
        else if (!checkNumbers(args[0])){
            System.out.println(args[0] + " contains an invalid number");
        }
            else if(!checkNumbers(args[2])){
                System.out.println(args[2] + " contains an invalid number");
                
            }
        }
    
    public static boolean checkNumbers(String commandArgument){
        char[] c = commandArgument.toCharArray();
        for (int i = 0; i < commandArgument.length(); i++){
            if (!Character.isDigit(c[0-9])) {
                return false;
            }
        }
        
        return true;
    }

}


    

    

