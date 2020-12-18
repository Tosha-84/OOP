package com.company;
import javax.swing.*;
import java.util.ArrayList;
public class Task2
{
    private static boolean setword(String str, String word)
    {
        System.out.println(str);
        System.out.println(word);
        String[] arr = str.split(",");
        for (String s : arr)
        {
            if (word.equals(s))
            {
                return true;
            }
            else
            {
                new Error1(new JFrame());
                return false;
            }
        }
        return false;
    }

    public static void answer(String str, String word, JLabel answer)
    {
        /*if(setword(str, word))
        {*/
            System.out.println("Слово, написанное наоборот");
            char linemas[] = word.toCharArray();
            //char[] outcome = new char[20];
            ArrayList<Character> outcome = new ArrayList<>();
            for (int i = linemas.length - 1; i >= 0; i--)
            {
                outcome.add(linemas[i]);
            }
            String outcome1 = "";
            for (int i = 0; i <= linemas.length - 1; i++)
                outcome1 = outcome1 + outcome.get(i);
            answer.setText(String.valueOf(outcome1));
        //}
    }
}
