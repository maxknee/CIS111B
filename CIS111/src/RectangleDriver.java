/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maxknee1
 */
public class RectangleDriver {
    public static void main(String[] args){
        Rectangle rectangle1 = new Rectangle(4, 40);
        rectangle1.setWidth(4);
        rectangle1.setHeight(40);
        Rectangle rectangle2 = new Rectangle(3.5, 35.9);
        rectangle2.setHeight(35.9);
        rectangle2.setWidth(3.5);
        System.out.println("Width of Rectangle 1 " + rectangle1.getWidth() + " Height of Rectangle 1 " + rectangle1.getHeight() +
                " Area of Rectangle 1 " + rectangle1.getArea() + " Perimeter of Rectangle 1 " + rectangle1.getPerimeter());
        System.out.println("Width of Rectangle 2 " + rectangle2.getWidth() + " Height of Rectangle 2 " + rectangle2.getHeight() +
                " Area of Rectangle 2 " + rectangle2.getArea() + " Perimeter of Rectangle 2 " + rectangle2.getPerimeter());


    }
    
}
