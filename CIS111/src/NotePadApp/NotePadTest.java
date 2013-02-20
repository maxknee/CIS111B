/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NotePadApp;
import java.util.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
                                
/**
 *
 * @author maxknee1
 */
public class NotePadTest extends JFrame implements Serializable {
  /*  private static final long serialVersionUID = 1L;
    private JButton display =  new JButton("Display Notes");
    private JButton addNote = new JButton("Add Notes");
    private JButton deleteNote = new JButton("Delete Notes");
    private JButton editNote = new JButton("Edit Notes");
    private JTextField noteEnter = new JTextField();
    private JTextArea displayNotes = new JTextArea();
    
    // Editable fields
    private JTextField priortityEdit = new JTextField();
    private JTextField titleEdit = new JTextField();
    private JTextField bodyEdit = new JTextField();
    private JTextField tagsEdit = new JTextField();
 */   
      public NotePadTest() { 
          NotePad instance = NotePad.getInstance();
          NotePad anotherInstance = new NotePad();
      }




    public static void main(String[] args) throws IOException, ClassNotFoundException{
        NotePadTest frame = new NotePadTest();
     /*   frame.pack();
        frame.setTitle("Note Pad");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    */
      //  frame.setVisible(true);
        Scanner in = new Scanner(System.in);
        String menu = "f";
        while (!menu.equals("x")){
            
        
        System.out.println("Welcome to Notepad");
        System.out.println("Please read the following options");
        System.out.println("[d]isplay all");
        System.out.println("[a]dd note");
        System.out.println("de[l]ete note");
        System.out.println("[e]dit note");
        System.out.println("e[x]it to quit");
        menu = in.next();
        
	// Note that the constructor is private
	
        
        NotePad notePadObject = new NotePad();
        java.io.File file = null;      
        Note newNote = null;
        boolean exists = (new File("notepad.dat")).exists();
        if (exists){
             newNote = new Note();
            }
        else{
            file = new java.io.File("notepad.dat");                    
        }
        notePadObject.open(notePadObject);
        //ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
       
        //NotePad newNotes = (NotePad)(inputSer.readObject());
        if ("d".equals(menu)){
            System.out.println("Displaying all notes");
            
           notePadObject.display(notePadObject);


        }
        if(menu.equals("a")){
            
             
            System.out.println("Add note");
            System.out.println("Enter Priority");
                newNote.setPriority(in.nextInt());
            System.out.print("Enter Title ");
            String title = in.next();
                newNote.setTitle(title);
            System.out.println("Enter Note ");
                newNote.setBody(in.next());
            ArrayList tags = new ArrayList(2);
            String userTags;
            
            System.out.println("Enter up to 3 Tags");
            for (int i = 0; i <= 2; i++){
               userTags =  in.next();
               tags.add(i, userTags);
            }
                
                newNote.setTimeStamp(new Date());
                notePadObject.add(newNote);
               
              
        }
       // Note first = new Note();
        if(menu.equals("e")){
            System.out.print("Enter the note number ");
            int noteNumber = in.nextInt();
            System.out.println(notePadObject.get(noteNumber));
            
        System.out.println("Edit your note ");
        String newBody = in.nextLine();
        notePadObject.add(noteNumber, newBody);
        }
        if (menu.equals("l")){
            System.out.println("Enter note number to delete: ");
            int noteNumber = in.nextInt();
            notePadObject.remove(noteNumber);
        }
        
         notePadObject.saveNotePad();
        }
    }
 /*   class DisplayListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {
            try {
                try {
                    displayNotes();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(NotePadTest.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(NotePadTest.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(NotePadTest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    
}
    public void displayNotes() throws ClassNotFoundException, FileNotFoundException, IOException{
        System.out.println("Displaying all notes");
        ObjectInputStream input = new ObjectInputStream(new FileInputStream("notepad.txt"));
        NotePad newNotepad = (NotePad)(input.readObject());
        
            System.out.print(newNotepad.toString() + " ");
            System.out.println();
            
        
        

           
    }
    class NotePadFunctions extends JPanel{
        
    
    
    }
    public NotePadTest(){
        JPanel p1 = new JPanel(new GridLayout(5,3));
        p1.add(display);
        p1.add(addNote);
        p1.add(deleteNote);
        p1.add(editNote);
        p1.add(noteEnter);
        add(p1, BorderLayout.WEST);
        display.addActionListener(new DisplayListener());

        displayNotes.setLineWrap(true);
        displayNotes.setWrapStyleWord(true);
        displayNotes.setEditable(false);
        JScrollPane noteDisplay = new JScrollPane(displayNotes);
       // setLayout(new BorderLayout(5, 5));
        add(displayNotes, BorderLayout.EAST);
        
        
    }
     * 
     */
    }


         
    
    


    
    

