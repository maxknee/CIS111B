/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NotePadApp;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
/**
 *
 * @author maxknee1
 */
public class EditNotes extends JPanel {
    private NotePad notePad;
    private Note newNote;
    private JComboBox jcb;
    private JTextArea notes;
    private JLabel title = new JLabel("Title");
    private JLabel body = new JLabel("Body");
    private JLabel tags = new JLabel("Tags");
    private JLabel priority = new JLabel("Priority");
    private JTextField noteTitle = new JTextField(10);
    private JTextField noteBody = new JTextField(200);
    private JTextField noteTag1 = new JTextField(20);
    private JTextField noteTag2 = new JTextField(20);
    private JTextField noteTag3 = new JTextField(20);
    private JTextField notePriority = new JTextField(2); 
    private JButton save = new JButton("Save");
    public void editNotes(NotePad notePad) throws FileNotFoundException, IOException, ClassNotFoundException{
        this.notePad = notePad;
        String[] noteIndex = new String[notePad.size()];
        for(int i = 0;i <= notePad.indexOf(notePad); i++){
            
            noteIndex[i] = "Note " + i;
            JComboBox jcb = new JComboBox(noteIndex);
        }
        
        
    }
    public void EditNotes(){
        setLayout(new GridLayout(3, 2 ,2, 5));
        notes.setWrapStyleWord(true);
        notes.setLineWrap(true);
        add(jcb);
        add(title);
        add(noteTitle);
        add(body);
        add(noteBody);
        add(tags);
        add(noteTag1);
        add(noteTag2);
        add(noteTag3);
        add(priority);
        add(notePriority);
        add(save);
        save.addActionListener(new ButtonListener());
    }
    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            String bodyNote = noteBody.getText();
            int priorityNote = Integer.parseInt(notePriority.getText());
            String titleNote = noteTitle.getText();
            String tags1 = noteTag1.getText();
            String tags2 = noteTag2.getText();
            String tags3 = noteTag3.getText();
            newNote.setPriority(priorityNote);
            newNote.setTitle(titleNote);
            newNote.setBody(bodyNote);
            ArrayList noteTags = new ArrayList();
            noteTags.add(tags1);
            noteTags.add(tags2);
            noteTags.add(tags3);
            newNote.setTags(noteTags);
            notePad.add(newNote);
            

            
}
        
    
            
        }

        
        
    }
    

