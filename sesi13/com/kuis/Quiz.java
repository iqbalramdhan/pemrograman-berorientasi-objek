package com.kuis;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Quiz extends JFrame implements ActionListener {

    int x, y;
    JTextField input3 = new JTextField();
    JLabel ket = new JLabel();
    JPanel pnl;

    Quiz() {
        super("Kuis Asah Otak");
        setSize(450, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
        pnl = new JPanel(fl);
        pnl.setBounds(0, 0, 450, 75);
        pnl.setOpaque(false);

        setRandom();

        JLabel icon = new JLabel("=");
        pnl.add(icon);

        pnl.add(input3);
        input3.setPreferredSize(new Dimension(125, 50));
        add(pnl);

        JPanel btnpnl = new JPanel(new FlowLayout(FlowLayout.LEFT));
        btnpnl.setBounds(0, 75, 450, 75);
        btnpnl.setOpaque(false);

        JButton chk = new JButton("Check");
        chk.setPreferredSize(new Dimension(250, 30));
        btnpnl.add(chk);

        add(btnpnl);

        ket.setBounds(20, 125, 450, 30);
        add(ket);

        chk.addActionListener(this);

        setVisible(true);
    }

    public void setRandom() {
        Random rndm = new Random();
        x = rndm.nextInt(10);
        y = rndm.nextInt(10);

        JTextField input1 = new JTextField();
        input1.setText(Integer.toString(x));
        pnl.add(input1);
        input1.setPreferredSize(new Dimension(125, 50));
        input1.setEditable(false);

        JTextField input2 = new JTextField();
        input2.setText(Integer.toString(y));
        pnl.add(input2);
        input2.setPreferredSize(new Dimension(125, 50));
        input2.setEditable(false);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        try {
            int hasil = Integer.parseInt(input3.getText());

            if (x + y == hasil) {
                getContentPane().setBackground(Color.GREEN);
                ket.setText("Selamat Jawaban Anda Benar!!!");
            } else {
                getContentPane().setBackground(Color.RED);
                ket.setText("Maaf, Jawaban Anda Salah!!!");
            }
        } catch (Exception o) {
            // TODO: handle exception
            System.out.println(o.getMessage());
        }
    }

    public static void main(String[] args) {
        Quiz brainly = new Quiz();
    }
}