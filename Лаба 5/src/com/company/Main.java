package com.company;

public class Main
{

    public static void main(String[] args)
    {
        new MainWindow();
    }


    public static int StrtoInt(String string)
    {
        String Str = string;
        int exit;
        try {
            exit = Integer.valueOf(Str);
            return exit;
        }catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
            return StrtoInt(string);
        }
    }

   /* public static boolean StrtoBoolean()
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
    }*/
}
