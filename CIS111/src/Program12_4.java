import javax.swing.*;
import java.awt.*;
import java.util.*;


public class Program12_4 extends JFrame {

    public Program12_4() {
        setLayout(new GridLayout(1,3));

    }
   
           

    


public static void  main(String[] args){
    System.out.println("current working directory is: " + System.getProperty("user.dir")); 
    ImageIcon[] cards = new ImageIcon[51];
    buildCards(cards);
    Program12_4 frame = new Program12_4();
    Random random = new Random();
    int rand1 = random.nextInt(cards.length);
    int rand2 = random.nextInt(cards.length);
    int rand3 = random.nextInt(cards.length);
    JLabel random1 = new JLabel(cards[rand1]);
    JLabel random2 = new JLabel(cards[rand2]);
    JLabel random3 = new JLabel(cards[rand3]);
    frame.add(random1);
    frame.add(random2);
    frame.add(random3);
    frame.pack();
    frame.setTitle("card Game");
    frame.setLocationRelativeTo(null);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setVisible(true);


}
  public static void buildCards(ImageIcon[] cardHolder){
        for (int i = 0; i < 51; i++){ 
            cardHolder[i] = new ImageIcon( "cards/" + (i + 1) + ".png");
            
    }
 }

}
