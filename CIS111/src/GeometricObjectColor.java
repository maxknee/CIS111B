public abstract class GeometricObjectColor  implements Colorable{

  private String color;

  private boolean filled;

  private java.util.Date dateCreated;

  protected void GeometricObject() {
  }

  protected void GeometricObject(String color, boolean filled) {
  }

  public String getColor() {
  return null;
  }

  public void setColor(String color) {
  }

  public boolean isFilled() {
  return false;
  }

  public void setFilled(boolean filled) {
  }

  public java.util.Date getDateCreated() {
  return null;
  }

  public String toString() {
  return null;
  }

  public abstract double getArea();

  public abstract double getPerimeter();

  public void howToColor() {
      System.out.println("Color all for sides");
  }
}
