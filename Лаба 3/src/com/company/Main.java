package com.company;

import java.util.InputMismatchException;

public class Main
{
    public static void main(String[] args)
    {
        Menu.Menu();
    }
    public static boolean Variable()
    {
        boolean check = false;
        try
        {
            check = Main.StrtoBoolean();
            return check;
        } catch(InputMismatchException z)
        {
            System.err.println("Должно быть введено \"true\" или \"false\"");
            return Variable();
        }
    }

    public static int StrtoInt()
    {
        String Str = Menu.in.nextLine();
        int exit;
        try {
            exit = Integer.valueOf(Str);
            return exit;
        }catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
            return StrtoInt();
        }
    }

    public static boolean StrtoBoolean()
    {
        String Str = Menu.in.nextLine();
        boolean help;
        if((Str.equals("true")) | (Str.equals("false")))
        {
            help = Boolean.parseBoolean(Str);
            return help;
        }
        else
        {
            System.err.println("Неправильный формат строки!");
            return StrtoBoolean();
        }
    }
}