/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RGB_WHEEL;

/**
 *
 * @author Shubhang
 */

import java.util.*;



public class M_timer extends TimerTask  {

    private CCANVAS canvas;
    
    public M_timer(CCANVAS canvas)
  {
    this.canvas = canvas;
  }
 
    public void run() {
       
       
    canvas.rCurr = (canvas.rCurr - canvas.rNext)%360;
    canvas.gCurr =  (canvas.gCurr -canvas.gNext)%360;
    canvas.bCurr = (canvas.bCurr -canvas.bNext)%360;
    
    canvas.repaint();        }

}
