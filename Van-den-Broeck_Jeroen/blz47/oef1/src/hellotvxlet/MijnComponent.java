/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

import org.havi.ui.*;
import java.awt.*;

/**
 *
 * @author student
 */
public class MijnComponent extends HComponent{
    private Image ship;
    private MediaTracker mtrack;
    private int currXpos ,currYpos;
    
    
    public MijnComponent(int x, int y)
    {
        currXpos = x;
        currYpos = y;
        
        ship = this.getToolkit().getImage("spaceship.png");
        mtrack = new MediaTracker(this);
        mtrack.addImage(ship, 0);
        try
        {
            mtrack.waitForAll();
        } catch (Exception e)
        {
            System.out.println(e.toString());
        }
        this.setBounds(x, y, ship.getWidth(null) + x, ship.getHeight(null) + y);
        
        
    }
    
    public void paint(Graphics g)
    {
        g.drawImage(ship, currXpos, currYpos, null);
    }
    
    public void move(int x, int y)
    {
        int speed = 10;
        currXpos +=  speed*x;
        currYpos +=  speed*y;
        this.setBounds(currXpos, currYpos, currXpos + ship.getWidth(null), currYpos + ship.getHeight(null));
        //System.out.println(yPos);
        
        
        
        
        
        
        repaint();
    }

}
