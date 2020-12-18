package com.company;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame {

    static JButton task1 = new JButton("Задача 1");
    static JButton task2 = new JButton("Задача 2");
    static JButton task3 = new JButton("Задача 3");
    static JButton save = new JButton("Сохранить");
    static JRadioButton task1RadioButton = new JRadioButton("Задание 1");
    static JRadioButton task2RadioButton = new JRadioButton("Задание 2");
    static JRadioButton task3RadioButton = new JRadioButton("Задание 3");
    private JLabel help = new JLabel("Если вы хотите сохранить в файл данные для задачи, отметте нужную задачу и нажмите \"Сохранить\"");
    public MainWindow()
    {
        super("Главное меню");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(8,3));
        setLocationRelativeTo(null);

        ButtonGroup group1 = new ButtonGroup();
        group1.add(task1);
        group1.add(task2);
        group1.add(task3);

        ButtonGroup group3 = new ButtonGroup();
        group3.add(task1RadioButton);
        group3.add(task2RadioButton);
        group3.add(task3RadioButton);

        ButtonGroup group4 = new ButtonGroup();
        group4.add(save);
        task1RadioButton.setSelected(true);

        container.add(task1);
        container.add(task2);
        container.add(task3);

        container.add(help);

        container.add(task1RadioButton);
        container.add(task2RadioButton);
        container.add(task3RadioButton);

        container.add(save);

        pack();
        setVisible(true);





        task1.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                new Task1Window();
            }
        });
        task2.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                new Task2Window();
            }
        });
        task3.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                new Task3Window();
            }
        });
        save.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(task1RadioButton.isSelected() == true) new Task1SaveWindow();
                else if(task2RadioButton.isSelected() == true) new Task2SaveWindow();
                else new Task3SaveWindow();
            }
        });
    }
}
