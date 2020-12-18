package com.company;

import javax.swing.*;

public class Task3
{

    public static void answer(String str, JLabel label)
    {
        String[] arr = str.split(" ");
        StringBuilder newStr = new StringBuilder();
        for(int i=0; i<arr.length; ++i)
        {
            if((i+1) % 3 != 0)
            {
                newStr.append(arr[i]);
                newStr.append(" ");
            }
        }
        label.setText(String.valueOf(newStr));
    }
}