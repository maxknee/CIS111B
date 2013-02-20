
public class testgeo {
    public static void main (String[]args){
        GeometricObject rectangle1 = new Rectangle(3.3, 5.1);
        GeometricObject rectangle2 = new Rectangle(4, 5);
        
        GeometricObject circle1 = new Circle(1);
        GeometricObject circle2 = new Circle(3);
        
        System.out.println(rectangle1.compareTo(rectangle2));
        System.out.println(circle1.compareTo(circle2));
        
        GeometricObjectColor square1 = new Square(3);
        GeometricObjectColor square2 = new Square(4);
        square1.howToColor();
        square2.howToColor();
        
        GeometricObject circle3 = new Circle2(2);
        GeometricObject circle4 = new Circle2(2);
        GeometricObject circle5 = new Circle2(3);
        
        System.out.println(circle3.equals(circle4));
       
        System.out.println(circle4.equals(circle5));
        
        GeometricObject[] a = new GeometricObject[4];
        a[0] = rectangle1;
        a[1] = rectangle2;
        a[2] = circle1;
        a[3] = circle4;
        System.out.println(GeometricObject.sumArea(a));
    }
    
    
}
