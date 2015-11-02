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
        graphics.drawLine(x + (width * 52 / 100), y + (height * 45 /100), x + (width * 68 / 100), y + (height * 45 /100));

        graphics.setColor(Color.BLACK);
        graphics.fillOval(x + (width * 54 / 100), y + (height * 40 / 100), width * 12 / 100, height * 14 / 100);
        
        graphics.setColor(Color.YELLOW);
        graphics.fillRect(x + (width * 54 / 100), y + (height * 38 / 100), width * 12 / 100, height * 7 / 100);
        
        graphics.setColor(Color.PINK);
        graphics.fillOval(x + (width * 54 / 100), y + (height * 47 / 100), width * 12 / 100, height * 7 / 100);
        
        
        //cheeks
        
        graphics.setColor(Color.red);
        graphics.fillOval(x + (width * 40 / 100), y + (height * 40 / 100), (width * 9 / 100), (height * 14 / 100));
       
        graphics.setColor(Color.red);
        graphics.fillOval(x + (width * 70 / 100), y + (height * 40 / 100), (width * 9 / 100), (height * 14 / 100));
        
//      ears
        graphics.setColor(Color.YELLOW);
        graphics.fillOval(x + (width * 67 / 100), y + (height * 1 / 100), width * 10 / 100, height * 30 / 100);
       
        graphics.setColor(Color.YELLOW);
        graphics.fillOval(x + (width * 42 / 100), y + (height * 1 / 100), width * 10 / 100, height * 30 / 100);
        
        graphics.setColor(Color.black);
        graphics.fillOval(x + (width * 68 / 100), y + (height * 1 / 100), width * 9 / 100, height * 11 / 100);
        
        graphics.setColor(Color.black);
        graphics.fillOval(x + (width * 42 / 100), y + (height * 1 / 100), width * 9 / 100, height * 11 / 100);
        
        
//        body
        graphics.setColor(Color.yellow);
        graphics.fillOval(x + (width * 37 / 100), y + (height * 54 / 100), (width * 45 / 100), (height * 58 / 100));
        
        graphics.setColor(Color.WHITE);
        graphics.fillArc(x + (width * 45 / 100), y + (height * 100 / 100), width * 30 / 100, height * 30 / 100, 0, 180);
     
//        feet
        
        graphics.setColor(Color.YELLOW);
        graphics.fillOval(x + (width * 35 / 100), y + (height * 100 / 100), (width * 15 / 100), (height * 10 / 100));
        graphics.setColor(Color.YELLOW);
        graphics.fillOval(x + (width * 70 / 100), y + (height * 100 / 100), (width * 15 / 100), (height * 10 / 100));
        
//        arms
        
//        rotate
        
        graphics.setColor(Color.YELLOW);
        graphics.fillOval(x + (width * 30 / 100), y + (height * 50 / 100), width * 11 / 100 , height * 30 / 100);
        graphics.fillOval(x + (width * 77 / 100), y + (height * 50 / 100), width * 11 / 100 , height * 30 / 100);
    
        
    }
    
    private int x, y, width, height;
    
    
    
    
}

    
    
    
    
    

