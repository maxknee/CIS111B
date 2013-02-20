    import javax.swing.*;
    import java.awt.*;
public class Program12_1 extends JFrame {
    public Program12_1(){
        
        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 0 ,0));
        for (int i = 1; i <= 3; i++){
            panel1.add(new JButton("Button " + i));
        }
        JPanel panel2 = new JPanel();
        for (int i = 4; i <= 6; i++){
        panel2.add(new JButton("Button " + i));
        }
        add(panel1);
        add(panel2);
       
        
    }


 
    public static void main(String[]args){
        Program12_1 frame1 = new Program12_1();
        frame1.setTitle("Container 1");
        frame1.setSize(800, 100);
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}
