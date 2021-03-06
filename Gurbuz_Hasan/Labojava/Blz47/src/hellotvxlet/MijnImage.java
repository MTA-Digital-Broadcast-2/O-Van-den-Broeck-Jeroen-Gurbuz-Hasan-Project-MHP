/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hellotvxlet;

import org.havi.ui.*;
import java.awt.*;

public class MijnImage extends HComponent {
    
    private Image bmap;
    private MediaTracker mtrack;
    
    
    
    public MijnImage(String bitmapnaam, int x, int y)
    {
        bmap = this.getToolkit().getImage(bitmapnaam);
        mtrack = new MediaTracker(this);
        mtrack.addImage(bmap, 0);
        
        try
        {
            mtrack.waitForAll();
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
        
        this.setBounds(x, y, bmap.getWidth(null), bmap.getWidth(null));
    } 
    
    public void Verplaats(int x, int y)
    {
        this.setBounds(x, y, bmap.getWidth(this), bmap.getHeight(this));
    }
    
    public void paint(Graphics g)
    {
        g.drawImage(bmap, 0,0,null);
    }

}
