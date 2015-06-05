package hellotvxlet;

//import 
import javax.tv.xlet.*;
import org.havi.ui.*;
import org.dvb.ui.*;
import java.awt.*;

import java.awt.event.*;
import org.havi.ui.event.*;


public class HelloTVXlet implements Xlet, HActionListener {
    private XletContext actueleXletContext;
    private HScene scene;
    private boolean debug = true;
    
    private HStaticText tekstLabel;
    private HTextButton knop1, knop2, knop3, knop4, knopHulplijn;
    
    private DVBColor green = new DVBColor(0,255,0,179);
    private DVBColor red = new DVBColor(255,0,0,179);
  
    public HelloTVXlet() {
        
    }

    public void initXlet(XletContext context) throws XletStateChangeException {
      if(debug) System.out.println("Xlet Initialiseren");
      this.actueleXletContext = context;
      
      HSceneTemplate sceneTemplate = new HSceneTemplate();
      
      sceneTemplate.setPreference( HSceneTemplate.SCENE_SCREEN_DIMENSION, new HScreenDimension(1.0f, 1.0f), HSceneTemplate.REQUIRED);
      sceneTemplate.setPreference(HSceneTemplate.SCENE_SCREEN_LOCATION, new HScreenPoint(0.0f,0.0f), HSceneTemplate.REQUIRED);
      
      scene = HSceneFactory.getInstance().getBestScene(sceneTemplate);
      
      tekstLabel = new HStaticText("Wie wordt multimiljonair?");
      tekstLabel.setLocation(100, 20);
      tekstLabel.setSize(250, 100);
      tekstLabel.setBackground(new DVBColor(0,0,0, 179));
      tekstLabel.setBackgroundMode(HVisible.BACKGROUND_FILL);
      
      scene.add(tekstLabel);
      
      knop1 = new HTextButton("Jeroen");
      knop2 = new HTextButton("iemand anders");
      knop3 = new HTextButton("de 3e persoon");
      knop4 = new HTextButton("jouw moeder");
      knopHulplijn = new HTextButton("hulplijn aanvragen");
      
      knop1.setLocation(100, 150);
      knop1.setSize(300,50);
      knop1.setBackground(new DVBColor(0,0,0,179));
      knop1.setBackgroundMode(HVisible.BACKGROUND_FILL);
      
      scene.add(knop1);
      
      knop2.setLocation(100, 250);
      knop2.setSize(300,50);
      knop2.setBackground(new DVBColor(0,0,0,179));
      knop2.setBackgroundMode(HVisible.BACKGROUND_FILL);
      
      scene.add(knop2);
      
      knop3.setLocation(100, 350);
      knop3.setSize(300,50);
      knop3.setBackground(new DVBColor(0,0,0,179));
      knop3.setBackgroundMode(HVisible.BACKGROUND_FILL);
      
      scene.add(knop3);
      
      knop4.setLocation(100, 450);
      knop4.setSize(300,50);
      knop4.setBackground(new DVBColor(0,0,0,179));
      knop4.setBackgroundMode(HVisible.BACKGROUND_FILL);
      
      scene.add(knop4);
      
      knopHulplijn.setLocation(500, 225);
      knopHulplijn.setSize(300,50);
      knopHulplijn.setBackground(new DVBColor(0,0,0,179));
      knopHulplijn.setBackgroundMode(HVisible.BACKGROUND_FILL);
      
      scene.add(knopHulplijn);
      
      knop1.requestFocus();
      
      knop1.setFocusTraversal(knop4, knop2, null, knopHulplijn);
      knop2.setFocusTraversal(knop1, knop3, null, knopHulplijn);
      knop3.setFocusTraversal(knop2, knop4, null, knopHulplijn);
      knop4.setFocusTraversal(knop3, knop1, null, knopHulplijn);
      knopHulplijn.setFocusTraversal(knop1, knop4, knop2, knop3);
      
      
      knop1.setActionCommand("1");
      knop2.setActionCommand("2");
      knop3.setActionCommand("3");
      knop4.setActionCommand("4");
      knopHulplijn.setActionCommand("5");
      
      knop1.addHActionListener(this);
      knop2.addHActionListener(this);
      knop3.addHActionListener(this);
      knop4.addHActionListener(this);
      knopHulplijn.addHActionListener(this);
      
      
      
    }

    public void startXlet() {
        if(debug) System.out.println("XLet starten");
        
        scene.validate();
        scene.setVisible(true);
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }
    
    public void actionPerformed(ActionEvent e)
    {
        System.out.println(e.getActionCommand());
        if(e.getActionCommand().equals("1")){
                knop1.setBackground(green);
                //knop1.setBackgroundMode(HVisible.BACKGROUND_FILL);
                tekstLabel.setBackground(green);
                //tekstLabel.setBackgroundMode(HVisible.BACKGROUND_FILL);
                System.out.println("correct!");
        } else if(e.getActionCommand().equals("5"))
        {
            knop3.setBackground(red);
            knop4.setBackground(red);
        }
        else{
                knop1.setBackground(new DVBColor(0,0,0,179));
                tekstLabel.setBackground(red);
                System.out.println("fail!");
                scene.validate();
        }
    }
}
