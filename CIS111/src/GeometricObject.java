
public abstract class GeometricObject  implements Comparable {

  private String color = "white";

  private boolean filled;

  private java.util.Date dateCreated;

  protected void GeometricObject() {
      dateCreated = new java.util.Date();
      
  }

  protected void GeometricObject(String color, boolean filled) {
      dateCreated = new java.util.Date();
      this.color = color;
      this.filled = filled;
  }

  public String getColor() {
  return color;
  }

  public void setColor(String color) {
      this.color = color;
  }

  public boolean isFilled() {
  return filled;
  }

  public void setFilled(boolean filled) {
      this.filled = filled;
  }

  public java.util.Date getDateCreated() {
  return dateCreated;
  }

  public String toString() {
  return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
  }

  public abstract double getArea();

  public abstract double getPerimeter();

  public  int compareTo(Object o) {
        if (getArea() > ((GeometricObject)o).getArea()){
            return 1;
        }
        else if (getArea() < ((GeometricObject)o).getArea()){
            return -1;
        }
        else {return 0;}
        
    }

    public boolean equals(Object o){
        if (getArea() == ((GeometricObject)o).getArea()){
            return true;
        }
        else {return false;}

       
        }
    public static double sumArea(GeometricObject[] a){
        double sum = 0;
        for (int i = 0; i < a.length; i++){
            sum += a[i].getArea();
            
        }
        return sum;
    }
}

  
       
  

