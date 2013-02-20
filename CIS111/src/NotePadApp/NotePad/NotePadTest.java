/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NotePadApp;
import java.util.*;
import java.io.*;


/**
 *
 * @author maxknee1
 */
public class NotePadTest {


    public static void main(String[] args) throws IOException, ClassNotFoundException{
        System.out.println("Welcome to Notepad");
        System.out.println("Please read the following options");
        System.out.println("[d]isplay all");
        System.out.println("[a]dd note");
        System.out.println("de[l]ete note");
        System.out.println("[e]dit note");
        java.io.File file = null;      
        
        boolean exists = (new File("notepad.txt")).exists();
        if (exists){
            file = new java.io.File("notepad.txt");
            }
        else{
            file = new java.io.File("notepad.txt");                    
        }
        Date date = new Date();
        Scanner in = new Scanner(System.in);
        ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));
        NotePad notePadObject = new NotePad();
        String menu = in.next();
        //NotePad newNotes = (NotePad)(inputSer.readObject());
        if ("d".equals(menu)){
            System.out.println("Displaying all notes");
            ObjectInputStream inputSer = new ObjectInputStream(new FileInputStream("notepad.txt"));
            NotePad newOutput = (NotePad)(inputSer.readObject());
            System.out.println(newOutput.toString());
            inputSer.close();

        }
        if(menu.equals("a")){
            System.out.println("Add note");
            System.out.print("Enter Title ");
            String title = in.next();
            System.out.println("Enter Note ");
            String body = in.next();
            System.out.println("Enter Priority");
            int priority = in.nextInt();
            System.out.println("Enter Tags");
            String tags = in.next();
            Note newNote = new Note(date, title, body, priority, tags);
            notePadObject.add(newNote);
            output.writeObject(notePadObject);
            output.close();


            
            
        }
       // Note first = new Note();
        if(menu.equals("e")){
            System.out.print("Enter the note number ");
            int noteNumber = in.nextInt();
        System.out.println("Edit your note ");
        String newBody = in.nextLine();
        notePadObject.add(noteNumber, newBody);
        }
        if (menu.equals("l")){
            System.out.println("Enter note number to delete: ");
            int noteNumber = in.nextInt();
            notePadObject.delete(noteNumber);
        }
        
        
  
    }


    
    
}
