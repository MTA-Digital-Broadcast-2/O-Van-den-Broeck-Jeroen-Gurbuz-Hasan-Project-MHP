package hellotvxlet;

//import 
import javax.tv.xlet.*;
import org.havi.ui.*;


import java.awt.event.*;
import org.havi.ui.event.*;
import org.dvb.event.*;


public class HelloTVXlet implements Xlet, UserEventListener {
    HScene scene;
    MijnComponent mc;
  
    public HelloTVXlet() {
        
    }

    public void initXlet(XletContext context) throws XletStateChangeException {
      HSceneTemplate sceneTemplate = new HSceneTemplate();
        sceneTemplate.setPreference(HSceneTemplate.SCENE_SCREEN_DIMENSION, 
                new HScreenDimension(1.0f,1.0f), HSceneTemplate.REQUIRED);
        sceneTemplate.setPreference(HSceneTemplate.SCENE_SCREEN_LOCATION, 
                new HScreenPoint(0.0f,0.0f), HSceneTemplate.REQUIRED);
        scene = HSceneFactory.getInstance().getBestScene(sceneTemplate);
        mc = new MijnComponent(30,30);
        
        scene.add(mc);
        
        
      
    }

    public void startXlet() {
        scene.validate();
        scene.setVisible(true);
        
        EventManager manager = EventManager.getInstance();
        UserEventRepository repository = new UserEventRepository("bewegen spaceship");
        repository.addKey( org.havi.ui.event.HRcEvent.VK_UP );
        repository.addKey( org.havi.ui.event.HRcEvent.VK_DOWN );
        repository.addKey( org.havi.ui.event.HRcEvent.VK_LEFT );
        repository.addKey( org.havi.ui.event.HRcEvent.VK_RIGHT );
        
        manager.addUserEventListener( this , repository);
    }

    public void pauseXlet() {
     
    }

    public void destroyXlet(boolean unconditional) {
     
    }
    
    public void userEventReceived(org.dvb.event.UserEvent e){
        
        if(e.getType() == KeyEvent.KEY_PRESSED){
            switch (e.getCode()){
                case HRcEvent.VK_UP:
                    move();
                    
                    System.out.println("up");
                    
                    break;
                case HRcEvent.VK_DOWN:
                    move();
                    System.out.println("down");
                    
                    break;
                case HRcEvent.VK_LEFT:
                    move();
                    System.out.println("left");
                    
                    break;
                case HRcEvent.VK_RIGHT:
                    move();
                    System.out.println("right");
                    
                    
                    break;
                
            }
        }
    }
    
    public void move()
    {
        System.out.println("right pressed");
    }
    
    public void actionPerformed(ActionEvent e)
    {
        
    }
}
