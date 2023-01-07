package com.layout;

import javax.swing.*;
import java.awt.*;

public class MyForm extends JFrame {
    JTextField t1 = new JTextField(27);
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton b0 = new JButton("0");
    JButton c1 = new JButton("+");
    JButton c2 = new JButton("-");
    JButton c3 = new JButton("*");
    JButton c4 = new JButton("/");
    JButton c5 = new JButton("=");
    JButton c6 = new JButton("%");
    JButton c7 = new JButton("Mod");
    JButton c8 = new JButton("Exit");

    MyForm() {
        super("Belajar GUI");
        setSize(327, 330);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        getContentPane(). setBackground(Color.CYAN);
        setLocationRelativeTo(null);
        FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
        setLayout(fl);
        add(t1);        
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        add(b7);
        add(b8);
        add(b9);
        add(b0);
        add(c1);
        add(c2);
        add(c3);
        add(c4);
        add(c5);
        add(c6);
        add(c7);
        add(c8);
    }

    public static void main(String[] args) {
        MyForm form = new MyForm();
        System.out.println(form);
    }
}