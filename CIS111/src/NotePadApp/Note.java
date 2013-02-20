/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NotePadApp;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author maxknee1
 */


public class Note implements Serializable, Comparable{

   

  private Date timeStamp;

  private String title;

  private String body;
  private int priority;

  private ArrayList   tags;
  public Note(){
      
  }
  
    public Note(String title, String body, int priority, ArrayList   tags, Date timeStamp){

        this.title = title;
        this.body = body;
        this.priority = priority;
        this.tags = tags;
    }

   

    /**
     * @return the timeStamp
     */
    public Date getTimeStamp() {
        return timeStamp;
    }

    /**
     * @param timeStamp the timeStamp to set
     */
    public void setTimeStamp(Date timeStamp) {
        this.timeStamp = timeStamp;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * @param body the body to set
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * @return the tags
     */
    public ArrayList   getTags() {
        return tags;
    }

    /**
     * @param tags the tags to set
     */
    public void setTags(ArrayList tags) {
        this.tags = tags;
    }



    /**
     * @return the priority
     */
    public int getPriority() {
        return priority;
    }

    /**
     * @param priority the priority to set
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }




    public int compareTo(Note t) {
        final int FIRST = -1;
        final int SECOND = 0;
        final int THIRD = 1;
        
        if ( this.getPriority() < t.getPriority() ) {return FIRST;}
        if ( this.getPriority() > t.getPriority()) { return THIRD; }
        else if ( this.getPriority() == t.getPriority()) { return SECOND;}
        return SECOND;
    }

    @Override
    public int compareTo(Object t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }






   

  
  }


