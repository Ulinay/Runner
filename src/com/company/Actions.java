package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

public class Actions implements KeyListener, MouseListener {
    Person person;
    StartFrame startFrame;
    MainFrame mainFrame;
    public Actions(Person person, MainFrame mainFrame){
        this.person = person;
        this.mainFrame = mainFrame;

    }
    public Actions(StartFrame startFrame){
        this.startFrame = startFrame;
    }
    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
double key = keyEvent.getKeyCode();
if(key == KeyEvent.VK_SPACE){
    person.flying = true;
}else if(key == KeyEvent.VK_ESCAPE){
 mainFrame.stopStream();
 mainFrame.dispose();
    Box.getDefaultBox();
    new StartFrame();
}
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        if((mouseEvent.getX() >= 409 && mouseEvent.getX() <= 556)&&(mouseEvent.getY() >= 180 && mouseEvent.getY() <= 220)){
           new LevelFrame();
           this.startFrame.dispose();
        }
        else if((mouseEvent.getX() >= 409 && mouseEvent.getX() <= 556)&&(mouseEvent.getY() >= 230 && mouseEvent.getY()<= 270)){
            System.exit(0);
        }else if((mouseEvent.getX() >= 454 && mouseEvent.getX() <=520)&&(mouseEvent.getY() >= 280 && mouseEvent.getY() <= 320)){
            try {
                new AchievementFrame();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
