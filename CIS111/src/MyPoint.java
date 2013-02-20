public class MyPoint {

  private double x = 0; 
  private double distance;
  private double y = 0;
  public MyPoint(){

  }

  public MyPoint(double x, double y) {
      this.x = x;
      this.y = y;
  }

  public double getDistance() {
      return distance;
  }
  public double distance(MyPoint p1, MyPoint p2){
      return Math.sqrt((p1.x - p2.x) * (p1.x - p2.x) + (p1.y - p2.y) * (p1.y - p2.y));
  }
   public double getX() {
      return x;
  }

  public double getY() {
      return y;
  }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }


}

