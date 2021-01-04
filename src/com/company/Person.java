package com.company;

import javax.swing.*;
import java.awt.*;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Random;

public class Person {
    ArrayList<String> list = new ArrayList<>();
    ArrayList<String> jumpList = new ArrayList<>();
    int flyX = 0;
    int flyY = 390;
    public int listRunCo = 0;
    public int listJumpCo = 0;
    public String animAdress;
    public boolean flying = false;
    float b = (float)(Math.cos(-5)*600);
  public    int jump = 0;
  int i = 0;


    ;

    public Person() {
        list.add("anim\\run_0.png");
        list.add("anim\\run_0.png");
        list.add("anim\\run_0.png");
        list.add("anim\\run_1.png");
        list.add("anim\\run_1.png");
        list.add("anim\\run_1.png");
        list.add("anim\\run_1.png");
        list.add("anim\\run_2.png");
        list.add("anim\\run_2.png");
        list.add("anim\\run_2.png");
        list.add("anim\\run_2.png");
        jumpList.add("anim\\jump_0.png");
        jumpList.add("anim\\jump_0.png");
        jumpList.add("anim\\jump_0.png");
        jumpList.add("anim\\jump_0.png");
        jumpList.add("anim\\jump_0.png");
        jumpList.add("anim\\jump_0.png");
        jumpList.add("anim\\jump_0.png");
        jumpList.add("anim\\jump_0.png");
        jumpList.add("anim\\jump_0.png");
        jumpList.add("anim\\jump_0.png");
        jumpList.add("anim\\jump_1.png");
        jumpList.add("anim\\jump_1.png");
        jumpList.add("anim\\jump_1.png");
        jumpList.add("anim\\jump_1.png");
        jumpList.add("anim\\jump_1.png");
        jumpList.add("anim\\jump_1.png");
        jumpList.add("anim\\jump_2.png");
        jumpList.add("anim\\jump_2.png");
        jumpList.add("anim\\jump_2.png");
        jumpList.add("anim\\jump_2.png");
        jumpList.add("anim\\jump_2.png");
        jumpList.add("anim\\jump_2.png");

    }

    public void update() {
        if (flying) {
            if(listJumpCo >= jumpList.size()){
                listJumpCo = 0;
            }else {
                animAdress = jumpList.get(listJumpCo);
                listJumpCo++;
            }

        } else {
            if (listRunCo >= list.size()) {
                listRunCo = 0;
            } else {
                animAdress = list.get(listRunCo);
                listRunCo++;
            }
        }
    }

    public void fly() {
        if (flying) {
            i++;
            if(jump < (int)b) {
                jump += 27;
                flyY =flyY - (10*i);
                flyX += 5;
            }else {
                if(flyY != 390){
                    flyY = flyY + 20;
                }else {
                    flying = false;
                    jump = 0;
                    i = 0;
                    flyX =0;
                }
            }

        }

    }


    public Rectangle getPersonFrame(){
        return new Rectangle(flyX,flyY,110,60);
    }
}



