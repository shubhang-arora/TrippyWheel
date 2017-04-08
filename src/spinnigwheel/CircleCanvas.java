/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spinnigwheel;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Graphics;



/**
 *
 * @author Shubhang
 */
  class CircleCanvas extends Canvas implements CommandListener{
  int degree = 120;
  long startTime;
  int seconds;
  Display display;
  private Midlet midlet;  
  private Command commandExit;
  private int keyUp, keyDown; 
  
  int speedChange = 300;
  int rCurr = 0;
  int gCurr = 120;
  int bCurr = 240;
  int rNext = 5;
  int gNext = 5;
  int bNext = 5;
  int k  = 0;



    CircleCanvas(Midlet aThis) {
        this.seconds = seconds;
  startTime = System.currentTimeMillis();
       this.midlet = midlet;
    
    commandExit = new Command("Exit", Command.EXIT, 1);
 
    keyUp = getKeyCode(UP);
    keyDown = getKeyCode(DOWN);
   
    addCommand(commandExit);
    setCommandListener(this); }

    

  public void paint(Graphics g){
  g.setColor(0, 0, 0);
  g.fillRect(0, 0, getWidth(), getHeight());

  g.setColor(255, 0, 0);
  g.fillArc(15,15, 200, 200, rCurr, degree);
  
  g.setColor(255, 0, 0);
  g.drawArc(15, 15, 200, 200, rCurr, 120);
  
  

  g.setColor(0, 255, 0);
  g.fillArc(15,15, 200, 200, gCurr, degree);
  
  g.setColor(0, 255, 0);
  g.drawArc(15, 15, 200, 200, gCurr, 120);
  
  
  g.setColor(0, 0, 255);
  g.fillArc(15,15, 200, 200, bCurr, degree);
  
  g.setColor(0, 0, 255);
  g.drawArc(15, 15, 200, 200, bCurr, 120);
  
  
  }

    public void commandAction(Command c, Displayable dsplbl) {
    if (c == commandExit)
      midlet.exitMIDlet();   
    }
    
    
    protected void keyPressed(int key)
  {
    if(key== KEY_NUM8)
    {
       rNext = rNext + 5;
       gNext = gNext + 5;
       bNext = bNext + 5;
        repaint();
        
    }
     else if(key== KEY_NUM2)
    {
       rNext = rNext - 5;
       gNext = gNext - 5;
       bNext = bNext - 5;
        repaint();
        
    }
     
    else if(key==KEY_NUM5)
    {
        rNext = rNext + 5;
       gNext = gNext + 5;
       bNext = bNext + 5;
        
    }
     
  }
 }