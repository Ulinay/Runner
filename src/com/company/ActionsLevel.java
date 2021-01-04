package com.company;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ActionsLevel implements MouseListener, KeyListener {
    LevelFrame levelFrame;
    public ActionsLevel(LevelFrame levelFrame){
       this.levelFrame = levelFrame;
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        if((mouseEvent.getX() >= 0 && mouseEvent.getX() <= 62)&&(mouseEvent.getY() >=0 && mouseEvent.getY() <= 120)){
MainFrame.forThread = 30;
new MainFrame();
this.levelFrame.dispose();
        }else if ((mouseEvent.getX() >= 0 && mouseEvent.getX() <= 62)&&(mouseEvent.getY() >=120 && mouseEvent.getY() <= 220)){
            MainFrame.forThread = 22;
            new MainFrame();
            this.levelFrame.dispose();
        }else if((mouseEvent.getX() >= 0 && mouseEvent.getX() <= 62)&&(mouseEvent.getY() >=220 && mouseEvent.getY() <= 320)){
           MainFrame.forThread = 15;
           new MainFrame();
            this.levelFrame.dispose();
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
        if ((mouseEvent.getX() >= 0 && mouseEvent.getX() <= 62) && (mouseEvent.getY() >= 0 && mouseEvent.getY() <= 120)) {
LevelFrame.text = "EASY";
        }
        else if ((mouseEvent.getX() >= 0 && mouseEvent.getX() <= 62)&&(mouseEvent.getY() >=120 && mouseEvent.getY() <= 220)){
            LevelFrame.text = "MEDIUM";
        }else if((mouseEvent.getX() >= 0 && mouseEvent.getX() <= 62)&&(mouseEvent.getY() >=220 && mouseEvent.getY() <= 320)){
            LevelFrame.text = "HARD";
        }
    }
    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
double key = keyEvent.getKeyCode();
if(key == KeyEvent.VK_ESCAPE){
    levelFrame.dispose();
    new StartFrame();
}
    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}
