package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Task1Window extends JFrame
{
    private JLabel label1 = new JLabel("Выберите ранг матрицы");
    private JLabel label2 = new JLabel("Введите название файла");
    private JLabel label3 = new JLabel("Минимальный элемент матрицы");
    private JLabel label4 = new JLabel("");
    static JRadioButton now = new JRadioButton("Ввести данные");
    static JRadioButton file = new JRadioButton("Взять из файла");
    static JTextField filename = new JTextField ();
    static JButton input = new JButton("Ввод");
    static JButton answer = new JButton("Ответ");
    static JButton answerfromfile = new JButton("Решить задачу из файла");
    static JButton randmas = new JButton("Сгенерировать случайным образом");
    static JSpinner rang = new JSpinner();
    private Object[][] array = new String[10][10];
    private Object[] columnsHeader = new String[] {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10",};
    protected JTable table = new JTable(array, columnsHeader);
    private int q;

    public Task1Window()
    {
        super("Решение 1-й Задачи");
        rang = new JSpinner(new SpinnerNumberModel(4, 2, 10, 1));
        table.getColumn("1").setPreferredWidth(36);
        table.getColumn("2").setPreferredWidth(36);
        table.getColumn("3").setPreferredWidth(36);
        table.getColumn("4").setPreferredWidth(36);
        table.getColumn("5").setPreferredWidth(36);
        table.getColumn("6").setPreferredWidth(36);
        table.getColumn("7").setPreferredWidth(36);
        table.getColumn("8").setPreferredWidth(36);
        table.getColumn("9").setPreferredWidth(36);
        table.getColumn("10").setPreferredWidth(36);
        filename.setPreferredSize(new Dimension(100,20));
        //setBounds(100,100,700,600);
        JPanel Panel1 = new JPanel();
        JPanel Panel2 = new JPanel();
        JPanel Panel3 = new JPanel();
        JPanel Panel4 = new JPanel();
        setVisible(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        /*Container container = this.getContentPane();
        container.setLayout(new GridLayout(4,4));*/

        ButtonGroup group = new ButtonGroup();
        group.add(now);
        group.add(file);


        Panel1.add(file);
        Panel1.add(label2);
        Panel1.add(filename);
        Panel1.add(answerfromfile);
        Panel2.add(now);
        Panel2.add(label1);
        Panel2.add(rang);
        Panel2.add(input);
        Panel3.add(table);
        Panel3.add(randmas);
        Panel4.add(answer);
        Panel4.add(label3);
        Panel4.add(label4);
        add(Panel1, BorderLayout.EAST);
        add(Panel2, BorderLayout.NORTH);
        add(Panel3, BorderLayout.CENTER);
        add(Panel4, BorderLayout.SOUTH);
        now.setSelected(true);
        pack();



        input.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(now.isSelected() == true)
                {
                    label4.setText("");
                    for(int i = 0; i < 10; i++)
                        for(int j = 0; j < 10; j++)
                            table.setValueAt(null, i, j);
                    q = (int) rang.getValue();
                    for(int i = 0; i < 10; i++)
                    {
                        for(int j = 0; j < 10; j++)
                        {
                            if((i > q - 1) && (j > q - 1))
                            {
                                table.setValueAt("Пусто", i, j);
                            }
                            else if(i > q - 1) table.setValueAt("Пусто", i, j);
                            else if(j > q - 1) table.setValueAt("Пусто", i, j);
                        }
                    }
                }
            }
        });

        randmas.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(now.isSelected() == true)
                {
                    label4.setText("");
                    Matrix.setRandMas(q, table);
                }
            }
        });

        answer.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                int[][] mas = new int[q][q];
                for(int i = 0; i < q; i++)
                    for(int j = 0; j < q; j++)
                        mas[i][j] = Main.StrtoInt((String) table.getValueAt(i, j));
                Matrix.min(mas, label4);
            }
        });

        answerfromfile.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e)
            {
                if(file.isSelected() == true)
                {
                    String strmas = FileManager.GetStringFromReadedFile(filename.getText());
                    int[][] mas = new int[10][10];
                    label4.setText("");
                    q = Integer.valueOf(strmas.substring(0, 1));
                    mas = FileManager.Decoding(strmas);
                    for(int i = 0; i < 10; i++)
                        for(int j = 0; j < 10; j++)
                            table.setValueAt(null, i, j);

                    for(int i = 0; i < 10; i++)
                    {
                        for(int j = 0; j < 10; j++)
                        {
                            if((i > q - 1) && (j > q - 1))
                            {
                                table.setValueAt("Пусто", i, j);
                            }
                            else if(i > q - 1) table.setValueAt("Пусто", i, j);
                            else if(j > q - 1) table.setValueAt("Пусто", i, j);
                        }
                    }
                    for(int i = 0; i < q; i++)
                        for(int j = 0; j < q; j++)
                            System.out.println(mas[i][j]);
                    for(int i = 0; i < q; i++)
                        for(int j = 0; j < q; j++)
                        {
                            table.setValueAt(Integer.toString(mas[i][j]), i, j);
                        }
                    for(int i = 0; i < q; i++)
                        for(int j = 0; j < q; j++)
                            mas[i][j] = Main.StrtoInt((String) table.getValueAt(i, j));
                    Matrix.min(mas, label4);
                }
            }
        });



    }

}
