package com.company;

public class Interface {
    public static void Menu()
    {
        int exit = -1;
        while (exit != 0)
        {
            System.out.println("Меню");
            System.out.println("Введите \"1\", если хотите добавить страну в список");
            System.out.println("Введите \"2\", если хотите вывести список стран");
            System.out.println("Введите \"3\", если хотите удалить страну из списка");
            System.out.println("Введите \"4\", если хотите получить отсортировать страны по какому-либо признаку");
            System.out.println("Введите \"5\", если хотите получить статистику о странах");
            System.out.println("Введите \"0\", если хотите закончить работу");
            exit = Main.StrtoInt();
            switch (exit)
            {
                case 0:
                {
                    System.out.println("Выход из программы");
                    break;
                }
                case 1:
                {
                    String name;
                    String form_of_government = null;
                    boolean check;
                    System.out.println("Введите название страны");
                    name = Main.in.nextLine();
                    System.out.println("Введите государственный строй (true - если республика, false - если монархия)");
                    check = Main.StrtoBoolean();
                    if(check)
                    {
                        form_of_government = "Республика";
                    }
                    else
                    {
                        form_of_government = "Монархия";
                    }
                    State.Definition(name, form_of_government);
                    break;
                }
                case 2:
                {
                    Work_with_States.PrintStatesList();
                    break;
                }
                case 3:
                {
                    System.out.println("Введите название страны, которую хотите удалить из списка");
                    Work_with_States.DeleatState(Main.in.nextLine());
                    break;
                }
                case 4:
                {
                    int check;
                    System.out.println("Как Вы хотите отсортировать страны?");
                    System.out.println("Введите \"1\", если по названию");
                    System.out.println("Введите \"2\", если по числинности населения");
                    System.out.println("Введите \"3\", если числинности армии");
                    System.out.println("Введите \"4\", если индексу счастья");
                    check = Main.StrtoInt();
                    switch (check)
                    {
                        case 1:
                        {
                            Work_with_States.SortName();
                            break;
                        }
                        case 2:
                        {
                            Work_with_States.SortPopulation();
                            break;
                        }
                        case 3:
                        {
                            Work_with_States.Sortarmy();
                            break;
                        }
                        case 4:
                        {
                            Work_with_States.Sorthappiness_index();
                            break;
                        }
                        default:
                        {
                            System.out.println("Неверный ввод");
                            break;
                        }
                    }
                    break;
                }
                case 5:
                {
                    int check;
                    System.out.println("Что Вы хотите узнать?");
                    System.out.println("Введите \"1\", если суммарную численность населения");
                    System.out.println("Введите \"2\", если какой процент занисает армия от населения у выбранной страны");
                    System.out.println("Введите \"3\", если разницу максимального и минимального индекса счастья");
                    System.out.println("Введите \"4\", если какой тип государственного строя преобладает");
                    System.out.println("Введите \"5\", если какой тип монархии преобладает");
                    check = Main.StrtoInt();
                    switch (check)
                    {
                        case 1:
                        {
                            System.out.println("Суммарнон население: " + Work_with_States.SumPopulation());
                            break;
                        }
                        case 2:
                        {
                            System.out.println("Введите название страны, у которой нужно вычислить процент армии от населения");
                            System.out.println(Work_with_States.ArmyPercentage(Main.in.nextLine()) + "%");
                            break;
                        }
                        case 3:
                        {
                            System.out.println(Work_with_States.Difference_in_Happines_index());
                            break;
                        }
                        case 4:
                        {
                            Work_with_States.Predominance_getform_of_government();
                            break;
                        }
                        case 5:
                        {
                            Work_with_States.Predominance_gettype_of_monarchy();
                            break;
                        }
                        default:
                        {
                            System.out.println("Неверный ввод");
                        }
                    }
                    break;
                }
                default:
                {
                    System.out.println("Неверный ввод");
                    break;
                }
            }
        }
    }
}
