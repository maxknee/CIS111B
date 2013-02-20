public class TestCircle2D {
    public static void main(String[] args) {
    MyPoint p1 = new MyPoint(2, 2);
    Circle2D c1 = new Circle2D(p1, 5.5);

    System.out.println("Area is " + c1.getArea());
    System.out.println("Perimeter is " + c1.getPerimeter());
    MyPoint p2 = new MyPoint(3,3);
    System.out.println("Does circle c1 contains the 3, 3? " + c1.contains(p2));
    MyPoint p3 = new MyPoint(4, 5);
    System.out.println("Does circle c1 contains cirlce with 4, 5 and 10.5? " + c1.contains(new Circle2D(p3, 10.5)));
    MyPoint p4 = new MyPoint(3, 5);

    System.out.println("Does circle c1 overlap with 3, 5, 2.3? " + c1.overlaps(new Circle2D(p4, 2.3)));

  }
}
