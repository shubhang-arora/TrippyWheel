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
       
       
    canvas.rCurr = (canvas.rCurr - canvas.rNext)%360;
    canvas.gCurr =  (canvas.gCurr -canvas.gNext)%360;
    canvas.bCurr = (canvas.bCurr -canvas.bNext)%360;
    
    canvas.repaint();        }

}
