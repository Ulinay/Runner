package com.company;

import javax.swing.*;
import java.awt.*;


public class StartFrame extends JFrame {
    public StartFrame(){
        JPanel jPanel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(new ImageIcon(getClass().getResource("image\\backStart.png")).getImage(), 0, 0, null);
g.drawImage(new ImageIcon(getClass().getResource("image\\Button.png")).getImage(),400,150,null);
g.drawImage(new ImageIcon(getClass().getResource("image\\Button_2.png")).getImage(),400,200,null);
g.drawImage(new ImageIcon(getClass().getResource("image\\Button_3.png")).getImage(),450,250,null);

            }
        };
addMouseListener(new Actions(this));
add(jPanel);




        setTitle("Runner");
        setResizable(false);
        setSize(1000,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }
}
