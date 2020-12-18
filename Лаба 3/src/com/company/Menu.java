package com.company;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Menu
{
    public static Scanner in = new Scanner(System.in);
    public static void Menu()
    {
        int exit = 1;
        boolean input;
        while (exit != 0)
        {
            {
                System.out.println("Выбирете, какую задачу Вы хотите решить");
                System.out.println("Введите '1', если вы хотите решить первую задачу");
                System.out.println("Введите '2', если вы хотите решить вторую задачу");
                System.out.println("Введите '3', если вы хотите решить третюю задачу");
                System.out.println("Введите '4', если вы хотите создать файл для решения какой-либо задачи");
                System.out.println("Введите '0', если вы Не хотите решать задачи");
                exit = Main.StrtoInt();
            }
            switch (exit) {
                case 0: {
                    System.out.println("Выход из программы");
                    break;
                }
                case 1: {
                    System.out.println("Решаем первую задачу");
                    Matrix matrix = new Matrix();

                    System.out.println("Хотите ввести данные вручную (введите \"true\") или взять из файла (введите \"false\")?");
                    input = Main.StrtoBoolean();
                    if (input)
                    {
                        System.out.println("Введите 'false', если хотите ввести порядок матрицы вручную и 'true', если сгенерировать случайным образом");
                        boolean check = Main.StrtoBoolean();
                        if (check) {
                            matrix.setRandRang();
                            System.out.println("Порядок вашей матрицы - " + matrix.getrang());
                        } else {
                            matrix.setHandRang(handRang());
                        }
                        System.out.println("Введите 'false', если хотите вводить элементы матрицы вручную и 'true', если сгенерировать случайным образом");
                        check = Main.StrtoBoolean();
                        if (check) {
                            matrix.setRandMas();
                        } else {
                            matrix.setHandMas(handcreate(matrix.getrang()));
                        }
                        matrix.sign_out_mas();
                        System.out.println("Минимальным элементом квадратной матрицы является:");
                        System.out.println(matrix.min(matrix.getmas()));
                        break;
                    } else {
                        while (true) {
                            String FileName;
                            String strmatrix;
                            System.out.println("Введите название файла, из которого хотите взять данные для задачи");
                            FileName = FileManager.CheckFile(in.nextLine());
                            if (FileManager.CheckFile(FileName) != "Cancellation") {
                                strmatrix = FileManager.GetStringFromReadedFile(FileName);
                                if (strmatrix.indexOf("Task1: ") != 0)
                                {
                                    System.err.println("Это файл не для первой задачи. Введите true, чтоб выбрать новый файл. Отмена - false");
                                    if (Main.StrtoBoolean())
                                    {
                                        continue;
                                    } else
                                        {
                                        break;
                                    }
                                }
                                matrix.setHandMas(FileManager.Decoding(strmatrix));
                                System.out.println(matrix.min(matrix.getmas()));
                                break;
                            }
                        }
                    }
                    break;
                }
                case 2: {
                    System.out.println("Решаем вторую задачу");
                    Task2 decision2 = new Task2();
                    System.out.println("Хотите ввести данные вручную (введите \"true\") или взять из файла (введите \"false\")?");
                    input = Main.StrtoBoolean();
                    if (input) {
                        System.out.println("Введите строку так, чтоб вконце каждого слова стояла запятая и пробел (после последнего - просто запятая)");
                        decision2.setstr(in.nextLine());
                        System.out.println("Введите слово, которое нужно написать задом наперёд");
                        decision2.setword(in.nextLine());
                        System.out.println(decision2.getword());
                        decision2.answer();
                    } else {
                        while (true) {
                            String FileName;
                            System.out.println("Введите название файла, из которого хотите взять данные для задачи");
                            FileName = FileManager.CheckFile(in.nextLine());
                            if (FileManager.CheckFile(FileName) != "Cancellation") {
                                decision2.setstr(FileManager.GetStringFromReadedFile(FileName));
                                if (decision2.getstr().indexOf("Task2: ") != 0) {
                                    System.err.println("Это файл не для второй задачи. Введите true, чтоб выбрать новый файл. Отмена - false");
                                    if (Main.StrtoBoolean()) {
                                        continue;
                                    } else {
                                        break;
                                    }
                                }
                                decision2.setstr(decision2.getstr().substring(7));
                                System.out.println("Ваша строка: " + decision2.getstr());
                                System.out.println("Введите слово, которое нужно написать задом наперёд");
                                decision2.setword(in.nextLine());
                                System.out.println(decision2.getword());
                                decision2.answer();
                                break;
                            }
                        }

                    }
                    break;
                }
                case 3: {

                    System.out.println("Решаем третюю задачу");
                    Task3 decision3 = new Task3();
                    System.out.println("Хотите ввести данные вручную (введите \"true\") или взять из файла (введите \"false\")?");
                    input = Main.StrtoBoolean();
                    if (input) {
                        System.out.println("Введите строку так, чтоб вконце каждого слова стояла запятая и пробел (после последнего - просто запятая)");
                        decision3.setstr(in.nextLine());
                        System.out.println("Введите слово, которое нужно написать задом наперёд");
                        decision3.answer();
                    } else {
                        while (true) {
                            String FileName;
                            System.out.println("Введите название файла, из которого хотите взять данные для задачи");
                            FileName = FileManager.CheckFile(in.nextLine());
                            if (FileManager.CheckFile(FileName) != "Cancellation") {
                                decision3.setstr(FileManager.GetStringFromReadedFile(FileName));
                                if (decision3.getstr().indexOf("Task3: ") != 0) {
                                    System.err.println("Это файл не для третей задачи. Введите true, чтоб выбрать новый файл. Отмена - false");
                                    if (Main.StrtoBoolean()) {
                                        continue;
                                    } else {
                                        break;
                                    }
                                }
                                decision3.setstr(decision3.getstr().substring(7));
                                System.out.println("Ваше предложение: " + decision3.getstr());
                                decision3.answer();
                                break;
                            }
                        }

                    }
                    break;
                }
                case 4: {
                    int check;
                    System.out.println("Для решения какой задачи вы хотите создать файл? (Введите \"1\", \"2\", или \"3\" в соответствии с задачей");
                    check = Main.StrtoInt();
                    switch (check)
                    {
                        case 1:{
                            System.out.println("Введите, как вы хотите назвать файл");
                            String FileName = in.nextLine();
                            FileName = FileManager.CheckWriteFile(FileName);
                            if(FileName != "Cancellation")
                            {
                                Matrix matrix = new Matrix();
                                System.out.println("Введите 'false', если хотите ввести порядок матрицы вручную и 'true', если сгенерировать случайным образом");
                                boolean check1 = Main.StrtoBoolean();
                                if (check1) {
                                    matrix.setRandRang();
                                    System.out.println("Порядок вашей матрицы - " + matrix.getrang());
                                } else {
                                    matrix.setHandRang(handRang());
                                }
                                System.out.println("Введите 'false', если хотите вводить элементы матрицы вручную и 'true', если сгенерировать случайным образом");
                                check1 = Main.StrtoBoolean();
                                if (check1) {
                                    matrix.setRandMas();
                                } else {
                                    matrix.setHandMas(handcreate(matrix.getrang()));
                                }
                                //matrix.sign_out_mas();
                                System.out.println(matrix.getmas());
                                String strmatrix = "Task1: ";
                                strmatrix = strmatrix + Integer.toString(matrix.getrang());
                                for(int i = 0; i < matrix.getrang(); i++)
                                {
                                    strmatrix = strmatrix + "[";
                                    for(int j = 0; j < matrix.getrang(); j++)
                                    {
                                        strmatrix = strmatrix + Integer.toString(matrix.getmasElement(i, j)) + " ";
                                    }
                                    strmatrix = strmatrix + "]";
                                }
                                System.out.println(strmatrix);
                                FileManager.WriteFile(strmatrix, FileName);
                            }
                            break;
                        }
                        case 2:{
                            System.out.println("Введите, как вы хотите назвать файл");
                            String FileName = in.nextLine();
                            FileName = FileManager.CheckWriteFile(FileName);
                            if(FileName != "Cancellation")
                            {
                                System.out.println("Введите строку так, чтоб вконце каждого слова стояла запятая и пробел (после последнего - просто запятая)");
                                String line = "Task2: " + in.nextLine();
                                FileManager.WriteFile(line, FileName);
                            }
                            break;
                        }
                        case 3:{
                            System.out.println("Введите, как вы хотите назвать файл");
                            String FileName = in.nextLine();
                            FileName = FileManager.CheckWriteFile(FileName);
                            if(FileName != "Cancellation")
                            {
                                System.out.println("Введите предложение");
                                String line = "Task3: " + in.nextLine();
                                FileManager.WriteFile(line, FileName);
                            }
                            break;
                        }
                        default:{
                            System.err.println("Неверный ввод");
                        }
                    }
                    break;
                }
                default: {
                    System.err.println("Неверный ввод");
                }
            }
        }
    }




    private static int handRang()
    {
        int rang;
        System.out.println("Введите порядок матрицы");
        do rang = Main.StrtoInt();
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
                mas[i][j] = Main.StrtoInt();
            }
        }
        return mas;
    }
}
