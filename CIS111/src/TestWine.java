import java.util.*;
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author maxknee
 */
public class TestWine {
    public static void main(String[] args){
        Date date = new Date();
        WineBottle[] wine = new WineBottle[12];
        WineCellar cellar = new WineCellar();     
        WineCellar cellar1 = new WineCellar(wine);
        WineBottle bottle = new WineBottle();
        
        try { 
            WineBottle bottle1 = new WineBottle("Cotes D'Rohne", "Sutter Home", date, 300.00);
            WineBottle bottle2 = new WineBottle("Zinfindel", "Robert Mondavi", date, 35.00);
            WineBottle bottle3 = new WineBottle("Reisling", "Coppola", date, -35.00);
            
            cellar1.add(bottle1);
            cellar1.add(bottle2);
            cellar1.add(bottle3);
                    
        }
        catch (InvalidPriceException ex){
            System.out.println("The invalid price is " + ex.getPrice());
        }
        
        cellar1.dropWineBottle(1);
        cellar1.getWineBottle(2);
        cellar1.print(wine);
        int size = cellar1.size(wine);
        cellar1.dropWineBottle(2);
        double price = cellar1.getPrice();
        System.out.printf("Total Price of bottles %2d", price );
        System.out.print("Size of cellar " + size);
        cellar1.clear(wine);
        WineBottle bottle4 = new WineBottle("Champagne", "Crystal", date, 3000);
        cellar1.add(bottle4);
        size = cellar1.size(wine);
        System.out.print("Size of cellar " + size);
        WineBottle[] wine1 = new WineBottle[12];
        WineBottle bottleNew = new WineBottle();
        WineBottle bottleNew1 = new WineBottle("fake wine", "wont work", date, 3.00);
        WineCellar cellar2 = new WineCellar(wine1);
                
        
    }
 
    
}
