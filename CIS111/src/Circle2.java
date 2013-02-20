/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maxknee1
 */
public class Circle2 extends GeometricObject implements Comparable {
    private double radius;

    public Circle2() {
    }

    public Circle2(double radius) {
        this.radius = radius;
    }


    public double getRadius() {
        return radius;
    }


    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Return area */
    public double getArea() {

        return radius * radius * Math.PI;
    }

    /** Return diameter */
    public double getDiameter() {
        return 2 * radius;
    }

    /** Return perimeter */
    public double getPerimeter() {

        return 2 * radius * Math.PI;
    }


    public int compareTo(Object o)
            {
            if (getRadius() > ((Circle2)o).getRadius()){
                return 1;
            }
            else if (getRadius() < ((Circle2)o).getRadius()){
                    return -1;
            }
            else
            {
                    return 0;
            }
            }
    public boolean equals(Object o){
        if (getRadius() == ((Circle2)o).getRadius()){
            return true;
        }
        else {return false;}
    }

    
}
