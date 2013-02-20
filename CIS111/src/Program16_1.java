    import javax.swing.*;
    import java.awt.event.*;
    import java.awt.*;
public class Program16_1 extends JFrame {
    public Program16_1(){
        
        setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        JPanel panel1 = new JPanel();
        panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 0 ,0));
        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");
        JButton button3 = new JButton("Button 3");
        JButton button4 = new JButton("Button 4");
        JButton button5 = new JButton("Button 5");
        JButton button6 = new JButton("Button 6");
        panel1.add(button1);
        panel1.add(button2);
        panel1.add(button3);
          
        JPanel panel2 = new JPanel();
        panel2.add(button4);
        panel2.add(button5);
        panel2.add(button6);
        add(panel1);
        add(panel2);
        button1.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        System.out.println("Button 1");
                    }
                    
                }
                );

        button2.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        System.out.println("Button 2");
                    }
                    
                }
                );
        button3.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        System.out.println("Button 3");
                    }
                    
                }
                );
        button4.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        System.out.println("Button 4");
                    }
                    
                }
                );
        button5.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        System.out.println("Button 5");
                    }
                    
                }
                );
        button6.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        System.out.println("Button 6");
                    }
                    
                }
                );
       
        
    }


 
    public static void main(String[]args){
        Program16_1 frame1 = new Program16_1();
        frame1.setTitle("Container 1");
        frame1.setSize(800, 100);
        frame1.setLocationRelativeTo(null);
        frame1.setVisible(true);
        frame1.pack();
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
}