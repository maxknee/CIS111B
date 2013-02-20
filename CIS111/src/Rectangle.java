/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MKnee000
 */
public class Rectangle {

    private double width = 1;

    private double height = 1;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.width = width;
        this.height = height;

    }

    public double getArea() {
        double area = getWidth() * getHeight();
        return area;
    }

    public double getPerimeter() {

        double perimeter = (getWidth() * 2) + (getHeight() * 2);
        return perimeter;
    }

    

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
