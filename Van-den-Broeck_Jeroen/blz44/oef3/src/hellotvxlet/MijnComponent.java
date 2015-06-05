/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

import org.havi.ui.*;
import java.awt.*;
import org.dvb.ui.*;

/**
 *
 * @author student
 */
public class MijnComponent extends HComponent {
    public MijnComponent(int x1,int y1,int w,int h)
    {
        this.setBounds(x1 , y1, w, h);
    }
    
    public void paint(Graphics g)
    {
        g.setColor(new DVBColor(85,85,85,179));
        g.fillRoundRect(15, 15, 100, 100, 15, 15);
        g.setColor(new DVBColor(0,0,255,255));
        g.fillRoundRect(0,0,100,100, 15, 15);
        g.setColor(new DVBColor(200,200,0,100));
        g.drawString("test", 30, 50);
    }

}
