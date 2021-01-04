package com.company;



import javax.swing.*;
import java.awt.*;

public class LevelFrame extends JFrame{
    Font font = new Font("Typesauce",Font.BOLD,30);
static String text = "";



    public LevelFrame(){
JPanel jPanel = new JPanel(){
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(new ImageIcon(getClass().getResource("image\\easy.png")).getImage(),0,0,null);
        g.drawImage(new ImageIcon(getClass().getResource("image\\medium.png")).getImage(),0,100,null);
        g.drawImage(new ImageIcon(getClass().getResource("image\\hard.png")).getImage(),0,200,null);
g.drawString(text,200,100);
        repaint();
    }
};


ActionsLevel actionsLevel = new ActionsLevel(this);
addKeyListener(actionsLevel);
addMouseListener(actionsLevel);

JLabel jLabel = new JLabel("Choose level");
jLabel.setFont(font);
jPanel.add(jLabel);




        add(jPanel);
        setTitle("Runner");
        setSize(400,350);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

}
