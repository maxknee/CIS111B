
import java.util.Date;

public class WineBottle {

  private String name;

  private String company;

  private java.util.Date date;

  private double price;

  public WineBottle() {
      
  }

  public WineBottle(String name, String company, Date date, double price) {
      this.name = name;
      this.company = company;
      this.date = date;
      this.price = price;
  }

  public String getName() {
  return name;
  }

  public String getCompany() {
  return company;
  }

  public java.util.Date getDate() {
  return date;
  }

  public double getPrice() {
  return price;
  }

  public void setName(String name) {
      this.name = name;
  }

  public void setCompany(String company) {
      this.company = company;
  }

  public void setDate(java.util.Date date) {
      this.date = date;
  }

  public void setPrice(Double newPrice) throws InvalidPriceException {
      
      if(newPrice >=0) {
          price = newPrice;
      }
      else { throw new InvalidPriceException(newPrice);}
      
      
  }

}