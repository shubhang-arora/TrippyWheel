/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package spinnigwheel;

/**
 *
 * @author Shubhang
 */

import java.util.*;



public class MyTimer extends TimerTask  {

    private CircleCanvas canvas;
    
    public MyTimer(CircleCanvas canvas)
  {
    this.canvas = canvas;
  }
 
    public void run() {
       
        if ((canvas.rCurr - canvas.rNext < 0) )      
    {          
        canvas.rCurr = 360;
        
    }
        if ((canvas.gCurr - canvas.gNext < 0) )      
    {          
        canvas.gCurr = 360;
        
    }
        if ((canvas.bCurr - canvas.bNext  < 0) )      
    {          
        canvas.bCurr = 360;
        
    }
    canvas.rCurr -= canvas.rNext;
    canvas.gCurr -= canvas.gNext;
    canvas.bCurr -= canvas.bNext;
    
    canvas.repaint();        }

}
