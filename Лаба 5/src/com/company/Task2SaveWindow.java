package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task2SaveWindow extends JFrame
{
    private JLabel label1 = new JLabel("Введите предложение");
    private JLabel label2 = new JLabel("Введите название файла");
    private JLabel mous1 = new JLabel("");
    private JLabel mous2 = new JLabel("");
    private JLabel mous3 = new JLabel("");
    static JTextField text = new JTextField ();
    static JTextField filename = new JTextField ();
    static JButton save = new JButton("Сохранить");

    public Task2SaveWindow()
    {
        super("Сохранение 2-й Задачи");

        save.setPreferredSize(new Dimension(1,1));

        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(5,4));

        container.add(label2);
        container.add(filename);
        container.add(label1);
        container.add(text);
        container.add(mous1);
        container.add(mous2);
        container.add(save);
        pack();


        save.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                FileManager.WriteFile(text.getText(), filename.getText() + ".task2");
                filename.setText(null);
                text.setText(null);
                dispose();
            }
        });
    }
}
