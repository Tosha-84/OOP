package com.company;
import java.util.Scanner;
public class New {
    public static void main(String[] args) {
        System.out.println("ЗАДАЧА c");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите предложение");
        String sen = in.nextLine();
        String[] arr = sen.split(" ");
        StringBuilder newStr = new StringBuilder();
        for (int i = 0; i < arr.length; ++i) {
            if ((i + 1) % 3 != 0) {
                newStr.append(arr[i]);
                newStr.append(" ");
            }
        }
        System.out.println(newStr.toString());
    }
}
