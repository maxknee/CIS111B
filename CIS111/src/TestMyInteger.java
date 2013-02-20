/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maxknee
 */
public class TestMyInteger {
    public static void main(String[] args){
        MyInteger a1 = new MyInteger(10);
        System.out.println("Is " + a1 + " even? " + a1.isEven());
        System.out.println("Is " + a1 + " odd?" + a1.isOdd());
        System.out.println("Is 43 odd?" + MyInteger.isOdd(43));
        System.out.println("Is 2 odd?" + MyInteger.isOdd(2));
        System.out.println("Is " + a1 + " prime? " + a1.isPrime());
        String b = "153";
        int c = MyInteger.parseInt(b);
        System.out.println("Is " + c + " equal to " + a1 + "? " + a1.equals(c));
        char[] d = {'1', '4', '5'};
        System.out.println("Array d converted to integers " + MyInteger.parseInt(d));
        
        
    }
    
}
