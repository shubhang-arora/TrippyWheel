/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spinnigwheel;




/**
 * @author Shubhang
 */

import javax.microedition.midlet.*;
import javax.microedition.lcdui.*;
import java.util.Timer;

public class Midlet extends MIDlet{
  
    private Display  myDisplay;  
    private CircleCanvas c1;
    Timer time;              
   MyTimer timerTask; 
    public Midlet()
  {
    myDisplay = Display.getDisplay(this);
    c1  = new CircleCanvas( this);
 
   time = new Timer();
   timerTask = new MyTimer(c1);
    time.schedule(timerTask,0,50);   
  
  }
  public void startApp(){
  myDisplay.setCurrent(c1);
  }

  public void pauseApp(){}

  public void destroyApp(boolean unconditional){}
  
  public void exitMIDlet()
  {
    destroyApp(true);
    notifyDestroyed();
  }
}