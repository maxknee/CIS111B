/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NotePadApp;

import java.awt.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.swing.*;

/**
 *
 * @author maxknee1
 */
public class DisplayNotes extends JPanel {
    private NotePad notePad;
    private JTextArea notes;
    public void displayNotes(NotePad notePad) throws FileNotFoundException, IOException, ClassNotFoundException{
        this.notePad = notePad;
        repaint();
        notePad.display(notePad);
    }
    public void DisplayNotes(){
        JScrollPane scrollPane = new JScrollPane(notes = new JTextArea(notePad.toString()));
        scrollPane.setPreferredSize(new Dimension(300, 200));
        notes.setWrapStyleWord(true);
        notes.setLineWrap(true);
        add(scrollPane, BorderLayout.CENTER);
        
    }
    
    
}
