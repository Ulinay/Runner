package com.company;

import javax.swing.*;
import java.awt.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class AchievementFrame extends JFrame {
ArrayList<String> list = new ArrayList<>();
public String s = "";
    public AchievementFrame() throws IOException {
     FileReader fileReader = new FileReader("results.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        while ((s = bufferedReader.readLine()) != null){
            list.add(s);
            s = "";
        }
String[] forList = list.toArray(new String[0]);
JList<String>jList = new JList<>(forList);

JScrollPane scrollPane = new JScrollPane(jList);


add(scrollPane);
        setSize(400,200);
        setResizable(false);
        setTitle("Results");
        setLocationRelativeTo(null);
        setVisible(true);
    }

}
