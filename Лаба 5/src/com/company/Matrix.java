package com.company;

import javax.swing.*;

public class Matrix
{

    private int[][] mas = new int[11][11];

    public int[][] getmas()
    {
        return mas;
    }

    public static void setRandMas(int rang ,JTable table)
    {
        {
            for (int i = 0; i < rang; i++)
            {
                for (int j = 0; j < rang; j++)
                {
                    table.setValueAt(Integer.toString(rand(1)), i, j);
                }
            }
        }
    }

    private static int rand(int q)
    {
        int rand;
        if (q == 0) rand = (int) (Math.random() * (11 - (2)) + 2);
        else rand = (int) (Math.random() * (101 - (-100)) + (-100));
        return rand;
    }


    public static void min(int[][] A, JLabel label)
    {
        int min = A[0][0];
        for (int i = 0; i < A.length; i ++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i][j] < min)
                {
                    min = A[i][j];
                }
            }
        }
        label.setText(Integer.toString(min));
    }

    public int getmasElement(int i, int j)
    {
        return this.mas[i][j];
    }
}