/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maxknee1
 */
public class TestCircle2 {
    public static void main(String[] args) {
        GeometricObject circle1 = new Circle2(2);
        GeometricObject circle2 = new Circle2(2);
        GeometricObject circle3 = new Circle2(3);
        
        System.out.println(circle1.equals(circle2));
       
        System.out.println(circle2.equals(circle3));
    }
    
}
