/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NotePadApp;

import java.io.Serializable;
import java.util.ArrayList;






/**
 *
 * @author maxknee1
 */
public class NotePad  extends Note implements Serializable{
    private Note note;
    private ArrayList notePad= new ArrayList();
    private int noteIndex = 0;
    private Object in;
    
    protected NotePad() {
        
    }
    public NotePad(ArrayList notePad){
        this.notePad = notePad;
        this.noteIndex = noteIndex;
    }

    /**
     * @return the Note
     */
    public ArrayList NotePad() {
        return getNotePad();
    }

    /**
     * @param notePad 
     
     */
    public void setNotePad(ArrayList notePad) {
        this.notePad = notePad;
    }

    /**
     * @return the noteIndex
     */
    public int getNoteIndex() {
        return noteIndex;
    }
    /**
    public void addNote(){
        notePad.add(note);
    }
*/
    /**
     * @param noteIndex the noteIndex to set
     */
    public void setNoteIndex(int noteIndex) {
        this.noteIndex = noteIndex;
    }



    /**
     * @return the sample
     */
    public Note getNote() {
        return note;
    }

    /**
     * @param sample the sample to set
     */
    public void setNote(Note note) {
        this.note = note;
    }
     private static NotePad instance = null;
     public static NotePad getInstance(){
      if(instance == null){
          instance = new NotePad();
      }
      return instance;
  }

    /**
     * @return the notePad
     */
    public ArrayList getNotePad() {
        return notePad;
    }
    
    public void dropNote(int noteIndex) {
        notePad.remove(noteIndex);
    }
    public void printNote(){
        System.out.println(notePad.get(noteIndex));
    }
    public void printAllNotes(){
        System.out.println("Displaying all notes");
        String allNotes = notePad.toString();
        System.out.println(allNotes);
    }

    public void add(int noteNumber, String newBody) {   
        notePad.add(noteIndex, getBody());
        
    }


    public void add(Note newNote) {
        notePad.add(note);
    }

    public void delete(int noteNumber) {
        notePad.remove(noteIndex);
        
    }
 
    
}
