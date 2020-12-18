package com.company;
import java.util.Scanner;
public class Qwerty {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите строку так, чтоб вконце каждого слова стояла запятая и пробел (после последнего - просто запятая)");
        String line = in.nextLine();
        System.out.println("Введите слово, которое нужно написать задом наперёд");
        char linemas[] = line.toCharArray();
        while (1 > 0) {
            String word = in.nextLine();
            if ((line.indexOf(word) != -1) && ((line.indexOf(word) == 0 && linemas[line.indexOf(word) + word.length()] == ',') || (linemas[line.indexOf(word) - 1] == ' ' && linemas[line.indexOf(word) + word.length()] == ','))) {
                System.out.println(word);
                linemas = word.toCharArray();
                for (int i = linemas.length - 1; i >= 0; i--) {
                    System.out.print(linemas[i]);
                }
                break;
            } else {
                System.out.println("Такого слова нет, введите слово, которое есть");
            }
        }
    }
}