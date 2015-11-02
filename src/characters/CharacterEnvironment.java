/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package characters;

import environment.Environment;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Liam
 */
class CharacterEnvironment extends Environment {
    
    private Pikachu george, fred;

    public CharacterEnvironment() {
        george = new Pikachu(50, 50, 400, 400);
        fred = new Pikachu(500, 100, 200, 200);
        this.setBackground(Color.WHITE);
    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (george != null) {
            george.draw(graphics);
        }
        if (fred != null) {
            fred.draw(graphics);
     
        }
        
    }
    
    
    
}
