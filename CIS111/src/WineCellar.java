public class WineCellar extends WineBottle {

  private WineBottle[] wine = new WineBottle[12];
  private WineBottle bottle;
  private int count = 0;
  protected WineCellar(){
      
  }
  public WineCellar(WineBottle[] wine){
      this.wine = wine;
  }

  public void add(WineBottle bottle) {
      if (this.bottle == null){
          wine[count] = null;
      }
      wine[count] = this.bottle;
      count++;
          
  }
  public WineBottle[] getWine(){
      return wine;
  }
  public void setWine(WineBottle[] wine){
      this.wine = wine;
  }

  public void getWineBottle(int i) {
      System.out.print(wine[i]);
  }

  public void dropWineBottle(int count) {
      wine[count] = null;
      
  }

  public void print(WineBottle[] wine) {
      for (int i = 0; i < wine.length; i++){
          System.out.print(wine[i]);
      }
      
  }

  public int size(WineBottle[] wine) {
      int size = 0;
      for (int i = 0; i < wine.length; i++){
          if (wine[i] != null){
              size++;
          }
      }
  return size;
  }

  public double totalValue(WineBottle bottle) {
      double totalPrice = 0;
      double price = this.bottle.getPrice();
      totalPrice += price;
      
  return totalPrice;
  }

  public void clear(WineBottle[] wine) {
      for (int i = 0; i < wine.length; i++){
          wine[i] = null;
      }
  }
  
  public WineBottle getBottle(){
      return bottle;
  }
  
  public void setBottle(WineBottle bottle){
      this.bottle = bottle;
  }
   private static WineCellar instance = null;
  public static WineCellar getInstance(){
      if(instance == null){
          instance = new WineCellar();
      }
      return instance;
  }

}