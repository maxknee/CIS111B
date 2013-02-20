
public class Circle2D {



  private MyPoint p;
  private double radius;
  




  public Circle2D() {
    radius = 1;
  }
  
  public Circle2D(MyPoint p, double radius) {
    this.p = p;
    this.radius = radius;
  }
  public MyPoint getP(){
      return p;
  }
  public void setP(MyPoint p){
      this.p = p;
  }
 
  
  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }
  
  public double getPerimeter() {
    return 2 * radius * Math.PI;
  }
  
  public double getArea() {
    return radius * radius * Math.PI;
  }






  public boolean contains(MyPoint p) {
    if ( Math.abs(p.getX() - this.p.getX()) <= this.radius &&
         Math.abs(p.getY() - this.p.getY()) <= this.radius ) {
            return true;
        }
    else {
            return false;
        }
  }


  public boolean contains(Circle2D circle) {
      if ((this.p.getDistance() + this.getRadius()) <= circle.getRadius() ){
          return true;
      }
      else {return false;}




  }


  public boolean overlaps(Circle2D circle) {    

    double distance = Math.sqrt((this.p.getX() - circle.p.getX()) * (this.p.getX() - circle.p.getX()) + (this.p.getY() - circle.p.getY()) * (this.p.getY() - circle.p.getY()));

    if ( distance <= this.radius + circle.getRadius() ) {
            return true;
        }
    else {
            return false;
        }
  }
}
