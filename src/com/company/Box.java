package com.company;

import javax.swing.*;
import java.awt.*;

public class Box {
    int speed = 10;

    public Image box1 = new ImageIcon(getClass().getResource("image\\block1.png")).getImage();
    public Image box2 = new ImageIcon(getClass().getResource("image\\block2.png")).getImage();
    public Image box3 = new ImageIcon(getClass().getResource("image\\block3.png")).getImage();
    public Image box4 = new ImageIcon(getClass().getResource("image\\block4.png")).getImage();

    public static int boxY1 = 200;
    public static int boxX1 = 500;

    public static int boxY2 = 427;
    public static int boxX2 = 300;

    public static int boxY3 = 427;
    public static int boxX3 = 700;

    public static int boxY4 = 373;
    public static int boxX4 = 700;





public void boxUpdate(){
    boxX1 -= speed;
    boxX2 -= speed;
    boxX3  -= speed;
    boxX4 -= speed;
  if(boxX1 <= -80){
boxX1 = 1000;
boxY1 = (int)(Math.random()*(300-200+1)+200);
  }
  if(boxX2 <= -80){
      boxX2 = 1000;

  }if(boxX3 <= -80 && boxX4 <= -80){
      int a = -150;
      int b = 150;
      boxY3 = 427;
      boxY4 = 373;
      int randY = (int)(Math.random()*(b -a + 1)+a);
      boxX3 = 1000;
      boxX4 = 1000;
      boxY3 += randY;
      boxY4 += randY;
    }
}
public Rectangle getBox1Frame(){
    return new Rectangle(boxX1,boxY1,30,10);
}
public Rectangle getBox2Frame(){
    return new Rectangle(boxX2, boxY2,30,10);
}
public Rectangle getBox3Frame(){
    return new Rectangle(boxX3,boxY3,30,10);
}
public Rectangle getBox4Frame(){
    return new Rectangle(boxX4,boxY4,30,10);
}

public static void getDefaultBox(){
    boxY1 = 200;
    boxX1 = 500;
    boxY2 = 427;
    boxX2 = 300;
    boxY3 = 427;
    boxX3 = 700;

    boxY4 = 373;
    boxX4 = 700;
}
}
