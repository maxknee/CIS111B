/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maxknee1
 */
public class TestColorable {
    public static void main(String[]args){
        GeometricObjectColor square1 = new Square(3);
        GeometricObjectColor square2 = new Square(4);
        System.out.print(square1 + " "); 
        square1.howToColor();
        square2.howToColor();
    }
    
}
