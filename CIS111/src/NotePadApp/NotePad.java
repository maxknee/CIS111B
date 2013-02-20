/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NotePadApp;

import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;







/**
 *
 * @author maxknee1
 */
@SuppressWarnings("serial")
public class NotePad  extends ArrayList{
    private int noteIndex = 0;
    private Object in;
    private Note note;
    private NotePad notePad;


    
    protected NotePad() {
        super();
 
    }
   private static NotePad instance = null;

   public static NotePad getInstance() {
      if(instance == null) {
         instance = new NotePad();
      }
      return instance;
   }

    public void setNoteIndex(int noteIndex) {
        this.noteIndex = noteIndex;
    }
  
    public void dropNote(int noteIndex) {
        super.remove(noteIndex);
    }
    public void printNote(){
        System.out.println(super.get(noteIndex));
    }
    
    public void addNote(Note note){
        super.add(note);
    }


    
    public void sort(NotePad notePad, int priority){
       PriorityQueue sort = new PriorityQueue();
       note.compareTo(note);
       sort.addAll(notePad);
    }
    
    public void saveNotePad() throws IOException{
        try {
            FileOutputStream fos = new FileOutputStream("notepad.dat");
            ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream("notepad.dat", true));
            os.writeObject(notePad);
            os.close();
           
            
        } catch (FileNotFoundException ex) {
            System.out.println("File Not Found!");
        }
        
    }
    public void display(NotePad notePad) throws FileNotFoundException, IOException, ClassNotFoundException{
        NotePad reading = null;
        notePad.open(notePad);
        ObjectInputStream input = null;
        try {
            input = new ObjectInputStream(new FileInputStream("notepad.dat"));
        } catch (IOException ex) {
            Logger.getLogger(NotePad.class.getName()).log(Level.SEVERE, null, ex);
        }
        reading = (NotePad)(input.readObject());
        
        
        System.out.println(reading);
    }

    

    public void open(NotePad notePad) throws FileNotFoundException {
        try{
            FileInputStream fis = new FileInputStream("notepad.dat");
        }
        catch (FileNotFoundException ex){
            System.out.println("File not Found");
        }
    }


}
