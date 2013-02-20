public class TestMyPoint {
    public static void main(String[] args) {

        MyPoint p1 = new MyPoint();
        MyPoint p2 = new MyPoint(10, 30.5);

        System.out.println("Both of the following display the distance between\n" +
                           "p1 @ (x=0, y=0) and p2 @ (x=10, y=30.5):\n");

        System.out.println(p2.distance(p1, p2));



    }
}
