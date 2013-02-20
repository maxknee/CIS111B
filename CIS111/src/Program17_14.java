import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
public class Program17_14 extends JFrame {


  private JScrollPane jScrollPane1 = new JScrollPane();
  private JList list = new JList();

  private JPanel jpSelectionMode = new JPanel();
  private JComboBox jcboSelectionMode = new JComboBox();
  private JLabel status = new JLabel();

  private JLabel jLabel1 = new JLabel();


  // Create an array of strings for country names
  private String[] carModels = {"SLK", "WRX", "Delta Integrale",
    "LS460", "MP4-12C", "Rs200", "F458 Italia"};

  //Construct the applet
  public Program17_14() {
    this.setSize(new Dimension(800, 800));

    list.setListData(carModels);
    list.addListSelectionListener(new ListSelectionListener() {
    public void valueChanged(ListSelectionEvent e) {list_valueChanged(e);}});

    jcboSelectionMode.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) {selectionMode(e);}});
    status.setText("Status");
    jLabel1.setText("Choose Selection Mode");
    add(jScrollPane1, BorderLayout.CENTER);
    jScrollPane1.getViewport().add(list, null);
    add(jpSelectionMode, BorderLayout.NORTH);
    jpSelectionMode.add(jLabel1, BorderLayout.WEST);
    jpSelectionMode.add(jcboSelectionMode, BorderLayout.CENTER);
    add(status, BorderLayout.SOUTH);

    // Add selection modes to the combo box
    jcboSelectionMode.addItem("SINGLE_SELECTION");
    jcboSelectionMode.addItem("SINGLE_INTERVAL_SELECTION");
    jcboSelectionMode.addItem("MULTIPLE_INTERVAL_SELECTION");
  }

  //Main method
  public static void main(String[] args) {
    Program17_14 frame = new Program17_14();
    frame.setTitle("Program 17_14");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(400,320);
    frame.setLocationRelativeTo(null); // Center the frame
    frame.setVisible(true);
  }

  // Handler for selecting items from a combo box
  void selectionMode(ActionEvent e) {
    String selectedMode =
    (String)jcboSelectionMode.getSelectedItem();

    if (selectedMode.equals("single selection")) {
            list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        }
    else if (selectedMode.equals("interval selection")) {
            list.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        }
    if (selectedMode.equals("multiple selection")) {
            list.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        }
  }

  // Handler for item selection in the list
  void list_valueChanged(ListSelectionEvent e) {
    int[] indices = list.getSelectedIndices();
    Object[] selectedItems = list.getSelectedValues();
    String display = "";

    for (int i = 0; i < indices.length; i++) {
      display += (String)selectedItems[i] + " ";
    }

    status.setText(display);
  }
}


