package hellotvxlet;

//import 
import javax.tv.xlet.*;
import org.havi.ui.*;
import org.dvb.ui.*;
import java.awt.*;

import java.awt.event.*;
import org.havi.ui.event.*;


public class HelloTVXlet implements Xlet, HActionListener {
    int[][] playingField;
    int score;
    boolean dead;
  
    public HelloTVXlet() {
        
    }

    public void initXlet(XletContext context) throws XletStateChangeException {
      
      
    }

    public void startXlet() {
        
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }
    
    public void actionPerformed(ActionEvent e)
    {
        
    }
    
    public void restart(){
        playingField = new int[4][4];
        score = 0;
        dead = false;
    }
}
