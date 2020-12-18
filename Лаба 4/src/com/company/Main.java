package com.company;
import java.util.Scanner;
public class Main {
    public static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        Interface.Menu();
        Kingdom kingdom = new Kingdom(in.nextLine(), in.nextLine(), in.nextLine());
        System.out.println(kingdom.getname());
    }





    public static int StrtoInt()
    {
        String Str = in.nextLine();
        int exit;
        try {
            exit = Integer.valueOf(Str);
            return exit;
        }catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
            return StrtoInt();
        }
    }
    public static float StrtoFloat()
    {
        String Str = in.nextLine();
        float exit;
        try {
            exit = Float.valueOf(Str);
            return exit;
        }catch (NumberFormatException e) {
            System.err.println("Неправильный формат строки!");
            return StrtoInt();
        }
    }
    public static boolean StrtoBoolean()
    {
        String Str = in.nextLine();
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
