package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task2Window extends JFrame
{
    private JLabel label1 = new JLabel("Введите предложение");
    private JLabel label2 = new JLabel("Введите название файла");
    private JLabel label3 = new JLabel("Введите слово");
    private JLabel label5 = new JLabel("Ваше слово задом наперёд:   ");
    private JLabel label4 = new JLabel("");
    private JLabel mous1 = new JLabel("");
    private JLabel mous2 = new JLabel("");
    private JLabel mous3 = new JLabel("");
    //static JRadioButton now = new JRadioButton("Ввести данные");
    //static JRadioButton file = new JRadioButton("Взять из файла");
    static JTextField text = new JTextField ();
    static JTextField word = new JTextField ();
    static JTextField filename = new JTextField ();
    static JButton answer = new JButton("Ответ");
    static JButton getfromfile = new JButton("Взять данные");

    public Task2Window()
    {
        super("Решение 2-й Задачи");

        answer.setPreferredSize(new Dimension(1,1));

        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(5,4));

        container.add(label2);
        container.add(filename);
        container.add(getfromfile);
        container.add(label1);
        container.add(text);
        container.add(mous1);
        container.add(label3);
        container.add(word);
        container.add(mous2);
        container.add(answer);
        container.add(label5);
        container.add(label4);
        pack();


        answer.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                Task2.answer(text.getText(), word.getText(), label4);
            }
        });
        getfromfile.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                text.setText(FileManager.GetStringFromReadedFile(filename.getText()));
            }
        });
    }
}
