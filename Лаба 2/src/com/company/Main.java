package com.company;
import java.util.Scanner;
public class Main
{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        int exit;
        exit = 1;
        while (exit != 0)
        {
            {
                System.out.println("Выбирете, какую задачу Вы хотите решить");
                System.out.println("Введите '1', если вы хотите решить первую задачу");
                System.out.println("Введите '2', если вы хотите решить вторую задачу");
                System.out.println("Введите '3', если вы хотите решить третюю задачу");
                System.out.println("Введите '0', если вы Не хотите решать задачи");
                exit = in.nextInt();
            }
            switch (exit)
            {
                case 0: {
                    System.out.println("Выход из программы");
                    break;
                }
                case 1: {
                    System.out.println("Решаем первую задачу");
                    Matrix matrix = new Matrix();

                    System.out.println("Введите 'false', если хотите ввести порядок матрицы вручную и 'true', если сгенерировать случайным образом");
                    boolean check = in.nextBoolean();
                    if (check) {
                        matrix.setRandRang();
                        System.out.println("Порядок вашей матрицы - " + matrix.getrang());
                    } else {
                        matrix.setHandRang(handRang());
                    }
                    System.out.println("Введите 'false', если хотите вводить элементы матрицы вручную и 'true', если сгенерировать случайным образом");
                    check = in.nextBoolean();
                    if (check) {
                        matrix.setRandMas();
                    } else {
                        matrix.setHandMas(handcreate(matrix.getrang()));
                    }
                    matrix.sign_out_mas();
                    System.out.println("Минимальным элементом квадратной матрицы является:");
                    System.out.println(matrix.min(matrix.getmas()));

                    Matrix matrix1 = new Matrix(matrix);
                    System.out.println("Первая матрица");
                    matrix.sign_out_mas();
                    System.out.println();
                    System.out.println("Вторая матрица");
                    matrix1.sign_out_mas();
                    System.out.println();
                    //matrix1.setHandRang(3);
                    matrix1.setRandMas();
                    System.out.println("Первая матрица после изменения второй");
                    matrix.sign_out_mas();
                    System.out.println();
                    System.out.println("Вторая матрица после изменения второй");
                    matrix1.sign_out_mas();
                    System.out.println();
                    break;
                }
                case 2: {
                    System.out.println("Решаем вторую задачу");
                    String porzhat2 = in.nextLine();
                    task2 decision2 = new task2();
                    System.out.println("Введите строку так, чтоб вконце каждого слова стояла запятая и пробел (после последнего - просто запятая)");
                    decision2.setstr(in.nextLine());
                    System.out.println("Введите слово, которое нужно написать задом наперёд");
                    decision2.setword(in.nextLine());
                    System.out.println(decision2.getword());
                    decision2.answer();
                    break;
                }
                case 3: {
                    String porzhat3 = in.nextLine();
                    System.out.println("Решаем третюю задачу");
                    task3 decision3 = new task3();
                    System.out.println("Введите предложение");
                    decision3.setstr(in.nextLine());
                    decision3.answer();

                    task3 decision4 = new task3();
                    task3 decision5 = new task3(decision4);
                    System.out.println(decision4.getstr());
                    System.out.println(decision5.getstr());
                    decision5.setstr("ЫЫЫЫЫЫ");
                    System.out.println(decision4.getstr());
                    System.out.println(decision5.getstr());



                    break;
                }
                default: {
                    System.out.println("Неверный ввод");
                    break;
                }
            }
        }
    }
    private static int handRang()
    {
        int rang;
        System.out.println("Введите порядок матрицы");
        do rang = in.nextInt();
        while (rang > 10);
        return rang;
    }
    private static int[][] handcreate(int rang)
    {
        int[][] mas = new int[11][11];
        for (int i = 0; i < rang; i++)
        {
            for (int j = 0; j < rang; j++)
            {
                System.out.println("Введите элемент матрицы " + (i + 1) + "-й строки " + (j + 1) + "-го столбца");
                mas[i][j] = in.nextInt();
            }
        }
        return mas;
    }


}
