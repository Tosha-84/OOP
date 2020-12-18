package com.company;
import java.util.ArrayList;
import java.util.Scanner;
public class Task2
{
    static Scanner in = new Scanner(System.in);
    private String str;
    private String word;
    /*private ArrayList<String> ListofWords = new ArrayList<String>();
    private ArrayList<String> ListofSymbols = new ArrayList<String>();*/


    public String getstr()
    {
        return str;
    }
    public void setstr(String str)
    {
        this.str = str;
    }
    public String getword()
    {
        return word;
    }
    public void setword(String word)
    {
        this.word = word;
        char linemas[] = str.toCharArray();
        if (!((str.indexOf(word) != -1) && ((str.indexOf(word) == 0 && linemas[str.indexOf(word) + word.length()] == ',') || (linemas[str.indexOf(word) - 1] == ' ' && linemas[str.indexOf(word) + word.length()] == ','))))
        {
            System.out.println("Такого слова нет, введите слово, которое есть");
            setword(in.nextLine());
        }
    }
    public void answer()
    {
        System.out.println("Слово, написанное наоборот");
        char linemas[] = word.toCharArray();
        for (int i = linemas.length - 1; i >= 0; i--)
        {
            System.out.print(linemas[i]);
        }
        System.out.println();
    }
}
