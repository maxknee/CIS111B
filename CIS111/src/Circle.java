public class Circle extends GeometricObject implements Comparable {			
    
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
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
            if (getRadius() > ((Circle)o).getRadius()){
                return 1;
            }
            else if (getRadius() < ((Circle)o).getRadius()){
                    return -1;
            }
            else
            {
                    return 0;
            }
            }

}