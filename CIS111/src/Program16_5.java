import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.TitledBorder;

public class Program16_5  extends JFrame{



        
    
    private JTextField investmentAmount = new JTextField();
    private JTextField years = new JTextField();
    private JTextField annualInterestRate = new JTextField();
    private JTextField txtFutureValue = new JTextField();
    private JButton computeValue = new JButton("Calculate");
    
    
    public Program16_5() {
        JPanel p1 = new JPanel(new GridLayout(5,2));
        p1.add(new JLabel("Investment Amount"));
        p1.add(investmentAmount);
        p1.add(new JLabel("Years"));
        p1.add(years);
        p1.add(new JLabel("Annaul Interest Rate"));
        p1.add(annualInterestRate);
        p1.add(new JLabel("Future Value"));
        p1.add(txtFutureValue);
        p1.setBorder(new TitledBorder("Enter Investment Amount, years, and annual interest rate"));
       
        JPanel p2 = new JPanel(new FlowLayout(FlowLayout.CENTER));
        p2.add(computeValue);
        add(p1, BorderLayout.CENTER);
        add(p2, BorderLayout.SOUTH);
        KeyboardFocusManager manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        manager.addKeyEventDispatcher(new MyDispatcher());
        computeValue.addActionListener(new ButtonListener());
         computeValue.registerKeyboardAction(computeValue.getActionForKeyStroke(KeyStroke.getKeyStroke(KeyEvent.VK_SPACE, 0, false)),KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0, false),JComponent.WHEN_FOCUSED);
 
  
    }
    private class MyDispatcher implements KeyEventDispatcher {
    @Override
    public boolean dispatchKeyEvent(KeyEvent e) {
        if (e.getID() == KeyEvent.KEY_PRESSED) {
            System.out.println("tester");
        } else if (e.getID() == KeyEvent.KEY_RELEASED) {
            System.out.println("2test2");
        } else if (e.getID() == KeyEvent.KEY_TYPED) {
            System.out.println("3test3");
        }
        return false;
    }
}
    private class ButtonListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent a){
            double investment = Double.parseDouble(investmentAmount.getText());
            int year = Integer.parseInt(years.getText());
            double interestRate = Double.parseDouble(annualInterestRate.getText());
            double monthlyInterest = interestRate / 12;
            double fv = investment * Math.pow((1 + (monthlyInterest *.01)),(year *12));
            txtFutureValue.setText(String.format("%.2f", fv));
            System.out.printf("%.2f", fv);
            
        }
    }
    public static void main (String[]args){
        Program16_5 frame = new Program16_5();
        frame.pack();
        frame.setTitle("Future Value Calculator");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

   
    
}
