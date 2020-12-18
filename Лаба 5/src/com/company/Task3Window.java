package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task3Window extends JFrame
{
    private JLabel label1 = new JLabel("Введите предложение");
    private JLabel label2 = new JLabel("Введите название файла");
    private JLabel label3 = new JLabel("Ваше предложение без каждого 3-го слова:   ");
    private JLabel label4 = new JLabel("");
    static JRadioButton now = new JRadioButton("Ввести данные");
    static JRadioButton file = new JRadioButton("Взять из файла");
    static JTextField text = new JTextField ();
    static JTextField filename = new JTextField ();
    static JButton answer = new JButton("Ответ");


    public Task3Window()
    {
        super("Решение 3-й Задачи");
        //setBounds(100,100,700,600);

        answer.setPreferredSize(new Dimension(1,1));

        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3,2));

        ButtonGroup group = new ButtonGroup();
        group.add(now);
        group.add(file);

        container.add(now);
        container.add(file);
        now.setSelected(true);

        container.add(file);
        container.add(label2);
        container.add(filename);
        container.add(now);
        container.add(label1);
        container.add(text);
        container.add(answer);
        container.add(label3);
        container.add(label4);
        pack();

        answer.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(now.isSelected() == true) Task3.answer(text.getText(), label4);
                else
                {
                    text.setText(FileManager.GetStringFromReadedFile(filename.getText()));
                    Task3.answer(text.getText(), label4);
                }
            }
        });

    }
    /*private void close()
    {

    }*/
}
