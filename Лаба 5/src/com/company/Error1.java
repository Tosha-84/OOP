package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Error1 extends JDialog
{
    JLabel label = new JLabel("Такого слова нет");
    JPanel panel = new JPanel();
    JButton b = new JButton("Ок");
    public Error1(JFrame frame) {
        super(frame, true);
        setSize(100, 100);
        setLocationRelativeTo(null);
        //panel.setLayout(null);
        label.setBounds(60, 10, 50, 15);
        panel.add(label);
        add(panel, BorderLayout.CENTER);
        b.setBounds(40, 40, 100, 25);
        panel.add(b);
        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evnt)
            {
                dispose();
            }
        });
        setVisible(true);
    }
}



