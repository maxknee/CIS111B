/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package NotePadApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author maxknee1
 */
class DisplayListener extends ActionListener {
    NotePadTest outer;

    DisplayListener(NotePadTest outer) {
        this.outer = outer;
    }

    public void actoinPerformed(ActionEvent e) {
        outer.display.displayNotes();
    }
    
}
