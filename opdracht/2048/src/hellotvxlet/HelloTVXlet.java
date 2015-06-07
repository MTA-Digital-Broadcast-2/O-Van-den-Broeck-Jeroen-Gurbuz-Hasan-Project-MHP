package hellotvxlet;

//import 
import javax.tv.xlet.*;
import org.havi.ui.*;


import java.awt.event.*;
import org.havi.ui.event.*;
import org.dvb.event.*;

import java.awt.event.*;
import org.havi.ui.event.*;

import java.util.Random;
import java.awt.Graphics;
import org.dvb.ui.*;
import java.util.Timer ;
import java . util . TimerTask ;
import java.util.Arrays;


public class HelloTVXlet implements Xlet, UserEventListener {
    Integer[][] playingField;
    int score;
    boolean dead;
    HScene scene;
    Random randomGenerator;
    int tiles;
    
    public HStaticText scoretext = new HStaticText("score: " + Integer.toString(score));
    
//    public HStaticText fieldtext = new HStaticText(Arrays.deepToString(playingField));
    
    
  
    public HelloTVXlet() {
        
    }

    public void initXlet(XletContext context) throws XletStateChangeException {
      HSceneTemplate sceneTemplate = new HSceneTemplate();
        sceneTemplate.setPreference(HSceneTemplate.SCENE_SCREEN_DIMENSION, 
                new HScreenDimension(1.0f,1.0f), HSceneTemplate.REQUIRED);
        sceneTemplate.setPreference(HSceneTemplate.SCENE_SCREEN_LOCATION, 
                new HScreenPoint(0.0f,0.0f), HSceneTemplate.REQUIRED);
        scene = HSceneFactory.getInstance().getBestScene(sceneTemplate);
        
        tiles = 4;
        randomGenerator = new Random();
        
        scoretext.setLocation(250, 50);
        scoretext.setSize(150, 50 );
        scoretext.setBackground( new DVBColor(0, 0, 179, 179) );
        scoretext.setBackgroundMode(HVisible.BACKGROUND_FILL );
        scoretext.setVisible(true);
       scene.add(scoretext);
       
//       fieldtext.setLocation(250, 150);
//        fieldtext.setSize(150, 50 );
//        fieldtext.setBackground( new DVBColor(0, 0, 179, 179) );
//        fieldtext.setBackgroundMode(HVisible.BACKGROUND_FILL );
//        fieldtext.setVisible(true);
//       scene.add(fieldtext);

      
    }

    public void startXlet() {
        scene.validate();
    scene.setVisible(true);
        
        EventManager manager = EventManager.getInstance();
        UserEventRepository repository = new UserEventRepository("move");
        repository.addKey( org.havi.ui.event.HRcEvent.VK_UP );
        repository.addKey( org.havi.ui.event.HRcEvent.VK_DOWN );
        repository.addKey( org.havi.ui.event.HRcEvent.VK_LEFT );
        repository.addKey( org.havi.ui.event.HRcEvent.VK_RIGHT );
        
        manager.addUserEventListener( this , repository);
        
        
        
       
restart();
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }
    
    public void userEventReceived(org.dvb.event.UserEvent e){
        
        if(e.getType() == KeyEvent.KEY_PRESSED){
            switch (e.getCode()){
                case HRcEvent.VK_UP:
                    move(0);
                    
                    break;
                case HRcEvent.VK_DOWN:
                    move(1);
                    break;
                case HRcEvent.VK_LEFT:
                    move(2);
                    break;
                case HRcEvent.VK_RIGHT:
                    move(3); 
                    
                    break;
                default:
                    restart();
                    break;
            }
        }
    }
    
    public void newTile()
    {
        boolean found = false;
        int i = 0;
        int j = 0;
        while(!found)
        {
            i = randomGenerator.nextInt(tiles);
            j = randomGenerator.nextInt(tiles);
            if(playingField[i][j] == null)
            {
                found = true;
            }
        }
        System.out.print("found: i=" );
        System.out.print(i);
        System.out.print(", j=");
        System.out.print(j);
        System.out.println();
        int number = newNumber();
        playingField[i][j] = new Integer(number);
        score = score + number;
        
        
        
    }
    

    
    public void move(int direction)
    {
        boolean moved = false;
        
                for(int i=0; i<tiles; i++)
                {
                    for(int j = 0; j<tiles; j++)
                    {
                        switch (direction)
                        {
                            //up
                            case 0:                        
                                if(playingField[i][j] != null)
                                {
                                    for(int k = 0; k < i; k++)
                                    {
                                        if(playingField[k][j] == null)
                                        {
                                            playingField[k][j] = playingField[i][j];
                                            playingField[i][j] = null;
                                            moved = true;
                                        } else if (playingField[i][j] != null && i!=k && playingField[k][j].intValue() == playingField[i][j].intValue() )
                                        {
                                            score = score + playingField[k][j].intValue();
                                            playingField [k][j] = new Integer(playingField[k][j].intValue() * 2);
                                            playingField[i][j] = null;
                                            moved=true;
                                            
                                            
                                        }
                                        
                                    }
                                }
                                break;
                            //down
                            case 1:
                                if(playingField[3-i][j] != null)
                                {
                                    for(int k = 0; k < i; k++)
                                    {
                                        if(playingField[3-k][j] == null)
                                        {
                                            playingField[3-k][j] = playingField[3-i][j];
                                            playingField[3-i][j] = null;
                                            moved = true;
                                        } else if (playingField[3-i][j] != null && playingField[3-k][j].intValue() == playingField[3-i][j].intValue() )
                                        {
                                            score = score + playingField[3-k][j].intValue();
                                            playingField [3-k][j] = new Integer(playingField[3-k][j].intValue() * 2);
                                            playingField[3-i][j] = null;
                                            moved=true;
                                            
                                            
                                        }
                                        
                                    }
                                }
                                
                                break;
                            //left
                            case 2:
                                if(playingField[i][j] != null)
                                {
                                    for(int k = 0; k < j; k++)
                                    {
                                        if(playingField[i][k] == null)
                                        {
                                            playingField[i][k] = playingField[i][j];
                                            playingField[i][j] = null;
                                            moved = true;
                                        } else if (playingField[i][j] != null && j != k && playingField[i][k].intValue() == playingField[i][j].intValue() )
                                        {
                                            score = score + playingField[i][k].intValue();
                                            playingField [i][k] = new Integer(playingField[i][k].intValue() * 2);
                                            playingField[i][j] = null;
                                            moved=true;
                                            
                                            
                                        }
                                        
                                    }
                                }
                                break;
                            //right
                            case 3:
                                
                                if(playingField[i][3-j] != null)
                                {
                                    for(int k = 0; k < j; k++)
                                    {
                                        if(playingField[i][3-k] == null)
                                        {
                                            System.out.println(3-j);
                                            playingField[i][3-k] = playingField[i][3-j];
                                            playingField[i][3-j] = null;
                                            moved = true;
                                            
                                        } else if (playingField[i][3-j] != null && playingField[i][3-k].intValue() == playingField[i][3-j].intValue() )
                                        {
                                            score = score + playingField[i][3-k].intValue();
                                            playingField [i][3-k] = new Integer(playingField[i][3-k].intValue() * 2);
                                            playingField[i][3-j] = null;
                                            moved=true;
                                            
                                            
                                        }
                                        
                                    }
                                }
                                break;
                        }
                    }
                }
        if(moved)
        {
            
            
            newTile();
            drawField();
        }
        
    }
    
    
    public void actionPerformed(ActionEvent e)
    {
        
    }
    
    public void restart(){
        System.out.println("restart");
        playingField = new Integer[tiles][tiles];
        playingField[1][1] = new Integer(2);
        drawField();
        score = 0;
        dead = false;
    }
    
    public void drawField()
    {
        System.out.println("score: " + score);
        
        
        
        
        for(int i = 0; i< tiles; i++ )
        {
            for(int j = 0; j < tiles; j++)
            {
                if(playingField[i][j] != null)
                {
                    System.out.print(playingField[i][j]);
                    
                } else
                {
                    System.out.print(0);
                }
                 System.out.print(" ");
                
            }
           System.out.println();
        }
    }
    
    public int newNumber()
    {
        int X      =   randomGenerator.nextInt(4);
        int numberOfPositions   =   playingField[X].length;
        int Y      =   randomGenerator.nextInt(numberOfPositions);
        
        int twoOrFour   =   randomGenerator.nextInt(10);
        if(twoOrFour > 7)
        {
            return 4;
        } else 
        {
            return 2;
        }
        
        
    }
}
