package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingJFrameDemo extends javax.swing.JFrame {

    public SwingJFrameDemo(){
        super("Demo program for JFrame");
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Demo program for JFrame");

        frame.setLayout(new GridLayout());

        frame.add(new JButton());

        frame.setTitle("Title");

        frame.setSize(100,100);

        JButton jButton=new JButton("Edit");

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //
            }
        });
    }
}
