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
public class NotePadGui extends JFrame implements Serializable {
    private static final long serialVersionUID = 1L;
    private JButton display =  new JButton("Display Notes");
    private JButton addNote = new JButton("Add Notes");
    private JButton deleteNote = new JButton("Delete Notes");
    private JButton editNote = new JButton("Edit Notes");
    private JTextField noteEnter = new JTextField();
    private DisplayNotes displayNotes = new DisplayNotes();
    private EditNotes editNotes = new EditNotes();
    private addNotes addNotes = new addNotes();
    private NotePad notePadObject = null;

      public NotePadGui() { 
          NotePad instance = NotePad.getInstance();
          NotePad anotherInstance = new NotePad();
          JPanel p1 = new JPanel(new GridLayout(5,3));
        p1.add(display);
        p1.add(addNote);
        p1.add(deleteNote);
        p1.add(editNote);
        p1.add(noteEnter);
        add(p1, BorderLayout.WEST);
        display.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                    try {
                        displayNotes.displayNotes(notePadObject);
                    } catch (IOException ex) {
                        System.out.println("Error ");
                    } catch (ClassNotFoundException ex) {
                        System.out.println("Error found");
                    }
            } 
        });
        editNote.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    editNotes.editNotes(notePadObject);
                }catch (IOException ex) {
                        System.out.println("Error ");
                    } catch (ClassNotFoundException ex) {
                        System.out.println("Error found");
                    }
            } 
        });
        addNote.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                addNotes.AddNotes();   
            } 
        });
      }
        
      
            
        

      




    public static void main(String[] args) throws IOException, ClassNotFoundException{
        NotePadGui frame = new NotePadGui();
        frame.pack();
        frame.setTitle("Note Pad");
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
        frame.setVisible(true);
        
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
        
         notePadObject.saveNotePad();
        }
        
    }
  

       



    


         
    
    


    
    

