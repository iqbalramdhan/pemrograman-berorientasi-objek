package com.aritmatika;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CalcAritmatika extends JFrame implements ActionListener {

    JTextField input1 = new JTextField();
    JTextField input2 = new JTextField();

    JButton btambah = new JButton("+");
    JButton bkurang = new JButton("-");
    JButton bbagi = new JButton("/");
    JButton bperkalian = new JButton("*");
    JButton bmodulus = new JButton("mod");

    JLabel equal = new JLabel("\t\t=\t");
    JLabel hasil = new JLabel("Hasil");

    CalcAritmatika() {
        super("Calc Aritmatika");
        setSize(450, 375);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        FlowLayout fl = new FlowLayout(FlowLayout.LEFT);
        JPanel panelinput = new JPanel(fl);
        panelinput.setBounds(0, 0, 450, 75);

        panelinput.add(input1);
        input1.setPreferredSize(new Dimension(150, 50));
        
        panelinput.add(input2);
        input2.setPreferredSize(new Dimension(150, 50));

        panelinput.add(equal);
        panelinput.add(hasil);

        add(panelinput);

        JPanel buttonpanel = new JPanel();
        buttonpanel.setLayout(new BoxLayout(buttonpanel, BoxLayout.Y_AXIS));
        buttonpanel.setBackground(Color.GREEN);
        buttonpanel.setBounds(0, 75, 300, 250);

        buttonpanel.add(btambah);
        buttonpanel.add(bkurang);
        buttonpanel.add(bperkalian);
        buttonpanel.add(bbagi);
        buttonpanel.add(bmodulus);

        btambah.setMaximumSize(new Dimension(300, 50));
        bkurang.setMaximumSize(new Dimension(300, 50));
        bperkalian.setMaximumSize(new Dimension(300, 50));
        bbagi.setMaximumSize(new Dimension(300, 50));
        bmodulus.setMaximumSize(new Dimension(300, 50));

        add(buttonpanel);

        btambah.addActionListener(this);
        bkurang.addActionListener(this);
        bperkalian.addActionListener(this);
        bbagi.addActionListener(this);
        bmodulus.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub

        try {
            int x = Integer.parseInt(input1.getText());
            int y = Integer.parseInt(input2.getText());

            if (e.getActionCommand().equals("+")) {
                hasil.setText(Integer.toString(y + x));
            } else if (e.getActionCommand().equals("-")) {
                hasil.setText(Integer.toString(y - x));
            } else if (e.getActionCommand().equals("*")) {
                hasil.setText(Integer.toString(y * x));
            } else if (e.getActionCommand().equals("/")) {
                hasil.setText(Integer.toString(y / x));
            } else if (e.getActionCommand().equals("mod")) {
                hasil.setText(Integer.toString(y % x));
            }
        } catch (Exception j) {
            // TODO: handle exception

            hasil.setText(j.getMessage());
        }
    }

    public static void main(String[] args) {
        CalcAritmatika cl = new CalcAritmatika();
    }
}