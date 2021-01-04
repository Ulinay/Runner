package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainFrame extends JFrame implements Runnable{
    Thread thread = new Thread(this);
    static String nick = "";
    JPanel back;
    int time = 0;
    static   int forThread = 0;
    int countThread = 0;
    int score = 0;
    Person person = new Person();
    Box box = new Box();
    Image image = new ImageIcon(getClass().getResource("image\\backMain.png")).getImage();
    Image image1 = new ImageIcon(getClass().getResource("image\\backMain.png")).getImage();
    Font font = new Font("Typesauce",Font.BOLD,30);
    static int movex = 0;
    static int movex1 = 1000;
    static int speed = 10;
    Image arr[] = {image,image1};
    JLabel jLabel = new JLabel("Your score: "  +score);

    public MainFrame(){
 back = new JPanel(){
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        Image image = new ImageIcon(getClass().getResource("image\\backMain.png")).getImage();
        g.drawImage(arr[0], movex, 0, null);
        g.drawImage(arr[1], movex1, 0, null);
        g.drawImage(new ImageIcon(getClass().getResource(person.animAdress)).getImage(),person.flyX,person.flyY,null);
        g.drawImage(box.box1,box.boxX1,box.boxY1,null);
        g.drawImage(box.box2,box.boxX2,box.boxY2,null);
        g.drawImage(box.box3,box.boxX3,box.boxY3,null);
        g.drawImage(box.box4,box.boxX4,box.boxY4,null);
        repaint();

    }
};
jLabel.setFont(font);
back.add(jLabel);
startStream();
add(back);
addKeyListener(new Actions(this.person,this));
        setResizable(false);
        setTitle("Runner");
        setSize(1000,600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    @Override
    public void run() {
        while (true){

            if(countThread >= 10000){
                forThread-=1;
                countThread = 0;
            }
countThread+= forThread;
            time+=50;
            if(time >= 1000){
                score++;
                time=0;
                jLabel.setText("Your score: " + score);
            }

            person.update();
            person.fly();
            try {
                check();
            } catch (IOException e) {
                e.printStackTrace();
            }
            box.boxUpdate();
            movex-=speed;
            movex1 -= speed;
            if(movex == -1000){
                movex = 0;
            }
            if(movex1 == 0){
                movex1= 1000;
            }
            try {
                Thread.sleep(forThread);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    public void startStream(){
       thread = new Thread(this);
        thread.start();
    }
    public void check() throws IOException {
        if(person.getPersonFrame().intersects(box.getBox1Frame()) || person.getPersonFrame().intersects(box.getBox2Frame())
        || person.getPersonFrame().intersects(box.getBox3Frame()) || person.getPersonFrame().intersects(box.getBox4Frame())
        ){

            nick = JOptionPane.showInputDialog("Your nick: ");
            nick += " = " + score + "\n";
            File file = new File("results.txt");
            FileWriter fileWriter = new FileWriter(file, true);
            if(file.exists() && !file.isDirectory()) {
                fileWriter.write(nick);
                fileWriter.flush();
                fileWriter.close();
            }else {
                file.createNewFile();
                fileWriter.write(nick);
                fileWriter.flush();
                fileWriter.close();
            }
stopStream();
        }
    }
    public void stopStream(){
        thread.stop();
    }

}
