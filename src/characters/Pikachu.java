/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/**
 *
 * @author Liam
 */
public class Pikachu {
    
    public Pikachu(int x, int y, int width, int height){
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width; 
    }
    
    
    public void draw(Graphics graphics){
        //outline
        graphics.setColor(Color.red);
        graphics.drawRect(x, y, width, height);
        
        
//        head
        graphics.setColor(Color.YELLOW);
        graphics.fillOval(x + (width * 40 / 100), y + (height * 20 / 100), width * 40 / 100, height * 40 / 100);
        
        //eyes
        graphics.setColor(Color.black);
        graphics.fillOval(x + (width * 48 / 100), y + (height * 30 / 100), width * 8 / 100, height * 8 / 100);
        graphics.fillOval(x + (width * 65 / 100), y + (height * 30 / 100), width * 8 / 100, height * 8 / 100);
        
        graphics.setColor(Color.white);
        graphics.fillOval(x + (width * 50 / 100), y + (height * 32 / 100), width * 2 / 100, height * 2 / 100);
        graphics.fillOval(x + (width * 67 / 100), y + (height * 32 / 100), width * 2 / 100, height * 2 / 100);
//        graphics.fillOval(125, 143, 10, 10);
//        graphics.fillOval(206, 143, 10, 10);

        
        //mouth
        graphics.setColor(Color.BLACK);
        graphics.drawLine(x + (width * 55 / 100), y + (height * 50 /100), x + (width * 65 / 100), y + (height * 50 /100));

        
        //cheeks
        
        graphics.setColor(Color.red);
        graphics.fillOval(224, 230, 25, 40);
        

        
        graphics.setColor(Color.red);
        graphics.fillOval(330, 230, 25, 40);
        
      
        graphics.setColor(Color.YELLOW);
        graphics.fillOval(320, 29, 40, 120);
       
        graphics.setColor(Color.YELLOW);
        graphics.fillOval(220, 29, 40, 120);
        
        graphics.setColor(Color.black);
        graphics.fillOval(324, 20, 29, 40);
        graphics.setColor(Color.black);
        graphics.fillOval(224, 20, 29, 40);
        
        graphics.setColor(Color.yellow);
        graphics.fillOval(x + (width * 50 / 100), y + (height * 70 / 100), width, height);
     
        

       
        
        
    }
    
    private int x, y, width, height;
    
    
    
    
}

    
    
    
    
    

