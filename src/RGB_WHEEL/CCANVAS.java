/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RGB_WHEEL;

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
  class CCANVAS extends Canvas implements CommandListener{
  int degree = 120;
  long startTime;
  int seconds;
  Display display;
  private Midlet midlet;  
  private Command exit;
  private int keyUp, keyDown; 
  
  int speedChange = 300;
  int rCurr = 0;
  int gCurr = 120;
  int bCurr = 240;
  int rNext = 0;
  int gNext = 0;
  int bNext = 0;
  int initialPointerX;
  int initialPointerY;
  int finalPointerX;
  int finalPointerY;
  int difference;



    CCANVAS(Midlet aThis) {
        this.seconds = seconds;
        startTime = System.currentTimeMillis();
        this.midlet = midlet;
    
        exit = new Command("Exit", Command.EXIT, 1);
 
        keyUp = getKeyCode(UP);
        keyDown = getKeyCode(DOWN);
   
        addCommand(exit);
        setCommandListener(this); }

    

  public void paint(Graphics g){
        g.setColor(0, 0, 0);
        g.fillRect(0, 0, getWidth(), getHeight());

        g.setColor(255, 0, 0);
        g.fillArc(getWidth()/2-100, getHeight()/2-100, 200, 200, rCurr, degree);
  
        g.setColor(255, 0, 0);
        g.drawArc(getWidth()/2-100, getHeight()/2-100, 200, 200, rCurr, 120);
  
        g.setColor(0, 255, 0);
        g.fillArc(getWidth()/2-100, getHeight()/2-100, 200, 200, gCurr, degree);
  
  g.setColor(0, 255, 0);
  g.drawArc(getWidth()/2-100, getHeight()/2-100, 200, 200, gCurr, 120);
  
  
  g.setColor(0, 0, 255);
  g.fillArc(getWidth()/2-100, getHeight()/2-100, 200, 200, bCurr, degree);
  
  g.setColor(0, 0, 255);
  g.drawArc(getWidth()/2-100, getHeight()/2-100, 200, 200, bCurr, 120);
  
  
  }

    public void commandAction(Command c, Displayable dsplbl) {
    if (c == exit)
      midlet.exitMIDlet();   
    }
    
    
    protected void keyPressed(int key)
  {
    if(key== -1)
    {
       
        if(rNext + 5 < this.getWidth())
        {
            rNext = rNext + 5;
       gNext = gNext + 5;
       bNext = bNext + 5;
       repaint(); 
        }
       
    }
     else if(key== -2)
    {
        if(rNext- 5>=0)
        {
            rNext = rNext - 5;
            gNext = gNext - 5;
            bNext = bNext - 5;
            repaint();
        }
        else
        {
            rNext =  0;
           gNext = 0;
            bNext = 0;
            
        }
        
    }
    else if(key==KEY_NUM5)
    {
        rNext = rNext + 5;
        gNext = gNext + 5;
        bNext = bNext + 5;
    }   
  }
    protected void pointerPressed(int x, int y){
        this.initialPointerX = x;
        this.initialPointerY = y;
    }
    
    protected void pointerDragged(int x, int y){
        
        
        
        
    }
    
    protected void pointerReleased(int x, int y){
        this.finalPointerX = x;
        this.finalPointerY = y;
        this.difference = this.finalPointerX - this.initialPointerX;
        if(this.difference >= 0)
        {
            if(rNext + this.difference >= 0 && rNext + this.difference <= this.getWidth())
            {
                rNext = rNext + this.difference;
                gNext = gNext + this.difference;
                bNext = bNext + this.difference;
                repaint();
            }
        }
        else
        {
            if(rNext + this.difference >= 0 && rNext + this.difference <= this.getWidth())
            {
                rNext = rNext + this.difference;
                gNext = gNext + this.difference;
                bNext = bNext + this.difference;
                repaint();
            }
            else
            {
                rNext = 0;
                gNext = 0;
                bNext = 0;
                repaint();
            }
              
        }
    }
    
 }