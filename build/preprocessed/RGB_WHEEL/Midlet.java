/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RGB_WHEEL;




/**
 * @author Shubhang
 */

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import java.util.Timer;

public class Midlet extends MIDlet{
  
    private Display  myDisplay;  
    private CCANVAS c1;
    Timer time;              
   M_timer timerTask; 
    public Midlet()
  {
    myDisplay = Display.getDisplay(this);
    c1  = new CCANVAS( this);
 
   time = new Timer();
   timerTask = new M_timer(c1);
    time.schedule(timerTask,0,50);   
  
  }
  public void startApp(){
  myDisplay.setCurrent(c1);
  }

  public void pauseApp(){}

  public void destroyApp(boolean unconditional){
  notifyDestroyed();
  }

    /**
     *
     */
    public void exitMIDlet()
  {
    destroyApp(true);
    
  }
}