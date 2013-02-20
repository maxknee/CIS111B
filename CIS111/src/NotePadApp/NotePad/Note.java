/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NotePadApp;

import java.io.*;
import java.util.Date;

/**
 *
 * @author maxknee1
 */

public class Note implements Comparable{
   

  private Date timeStamp;

  private String title;

  private String body;
  private int priority;

  private String tags;
  public Note(){
      
  }
  
    public Note(Date timeStamp, String title, String body, int priority, String tags){
        this.timeStamp = timeStamp;
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
    public String getTags() {
        return tags;
    }

    /**
     * @param tags the tags to set
     */
    public void setTags(String tags) {
        this.tags = tags;
    }
    @Override
    public int compareTo(Object a){
        if (getPriority() > ((Note)a).getPriority()){
            return 1;
        }
        else if (getPriority() < ((Note)a).getPriority()){
            return -1;
        }
        else {return 0;}
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


   

  
  }


