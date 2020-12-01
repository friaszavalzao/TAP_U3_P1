/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tap_u3_p1;

import java.awt.Color;
import java.awt.Graphics2D;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Frase {
    int x,y,numFrase;
    Color colorFrase;
    
    public Frase(){
         x=(int)(Math.random()*300+1);
         y=(int)(Math.random()*400+1);
         colorFrase=new Color((int)(Math.random()*255+0),(int)(Math.random()*255+0),(int)(Math.random()*255+0));
         numFrase=(int)(Math.random()*39+0);
    }
    public void pintar(Graphics2D g2,String a[]){
        g2.setColor(colorFrase);
        g2.drawString(a[numFrase], x, y);
        
    }
}
