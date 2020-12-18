package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Work_with_States
{
    private static ArrayList<State> states = new ArrayList<>();

    public static void AddState(State state)
    {
        states.add(state);
        System.out.println(states.size());
    }

    public static void PrintStatesList()
    {
        for(int i = 0; i < states.size(); i++)
        {
            System.out.print("Страна: " + states.get(i).getname() + "; Государственный строй: " + states.get(i).getform_of_government() + states.get(i).gettype_of_monarchy() + "; Население: " + states.get(i).getpopulation() + "; ");
            System.out.println("Числинность армии: " + states.get(i).getarmy() + "; Индекс счастья: " + states.get(i).gethappiness_index() + "; " + states.get(i).getRuler());
        }
        //System.out.println(states.toString());
    }

    public static void DeleatState(String name)
    {
        for(int i = 0; i < states.size(); i++)
        {
            if(states.get(i).getname().equals(name))
            {
                states.remove(i);
                break;
            }
        }
    }

    public static void SortName()
    {
        ArrayList<String> names = new ArrayList<>();
        for(int i = 0; i < states.size(); i++)
        {
            names.add(states.get(i).getname());
        }

        Collections.sort(names);
        for(int i = 0; i < names.size(); i++)
        {
            for(int j = 0; j < states.size() - i; j++)
            {
                if(names.get(i).equals(states.get(j).getname()))
                {
                    System.out.print("Страна: " + states.get(j).getname() + "; Государственный строй: " + states.get(j).getform_of_government() + states.get(j).gettype_of_monarchy() + "; Население: " + states.get(j).getpopulation() + "; ");
                    System.out.println("Числинность армии: " + states.get(j).getarmy() + "; Индекс счастья: " + states.get(j).gethappiness_index() + "; " + states.get(j).getRuler());
                    states.add(states.get(j));
                    states.remove(j);
                    break;
                }
            }
        }
    }

    public static void SortPopulation()
    {
        ArrayList<Integer> populations = new ArrayList<>();
        for(int i = 0; i < states.size(); i++)
        {
            populations.add(states.get(i).getpopulation());
        }
        Collections.sort(populations);

        for(int i = 0; i < populations.size(); i++)
        {
            for(int j = 0; j < states.size() - i; j++)
            {
                if(populations.get(i) == states.get(j).getpopulation())
                {
                    System.out.print("Страна: " + states.get(j).getname() + "; Государственный строй: " + states.get(j).getform_of_government() + states.get(j).gettype_of_monarchy() + "; Население: " + states.get(j).getpopulation() + "; ");
                    System.out.println("Числинность армии: " + states.get(j).getarmy() + "; Индекс счастья: " + states.get(j).gethappiness_index() + "; " + states.get(j).getRuler());
                    states.add(states.get(j));
                    states.remove(j);
                    break;
                }
            }
        }
    }

    public static void Sortarmy()
    {
        ArrayList<Integer> armys = new ArrayList<>();
        for(int i = 0; i < states.size(); i++)
        {
            armys.add(states.get(i).getarmy());
        }
        Collections.sort(armys);
        for(int i = 0; i < armys.size(); i++)
        {
            for(int j = 0; j < states.size(); j++)
            {
                if(armys.get(i) == states.get(j).getarmy())
                {
                    System.out.print("Страна: " + states.get(j).getname() + "; Государственный строй: " + states.get(j).getform_of_government() + states.get(j).gettype_of_monarchy() + "; Население: " + states.get(j).getpopulation() + "; ");
                    System.out.println("Числинность армии: " + states.get(j).getarmy() + "; Индекс счастья: " + states.get(j).gethappiness_index() + "; " + states.get(j).getRuler());
                    states.add(states.get(j));
                    states.remove(j);
                    break;
                }
            }
        }
    }

    public static void Sorthappiness_index()
    {
        ArrayList<Float> happiness_indexes = new ArrayList<>();
        for(int i = 0; i < states.size(); i++)
        {
            happiness_indexes.add(states.get(i).gethappiness_index());
        }
        Collections.sort(happiness_indexes);
        for(int i = 0; i < happiness_indexes.size(); i++)
        {
            for(int j = 0; j < states.size(); j++)
            {
                if(happiness_indexes.get(i) == states.get(j).gethappiness_index())
                {
                    System.out.print("Страна: " + states.get(j).getname() + "; Государственный строй: " + states.get(j).getform_of_government() + states.get(j).gettype_of_monarchy() + "; Население: " + states.get(j).getpopulation() + "; ");
                    System.out.println("Числинность армии: " + states.get(j).getarmy() + "; Индекс счастья: " + states.get(j).gethappiness_index() + "; " + states.get(j).getRuler());
                    states.add(states.get(j));
                    states.remove(j);
                    break;
                }
            }
        }
    }
    public static void Sorthappiness_index(boolean q)
    {
        ArrayList<Float> happiness_indexes = new ArrayList<>();
        for(int i = 0; i < states.size(); i++)
        {
            happiness_indexes.add(states.get(i).gethappiness_index());
        }
        Collections.sort(happiness_indexes);
        for(int i = 0; i < happiness_indexes.size(); i++)
        {
            for(int j = 0; j < states.size(); j++)
            {
                if(happiness_indexes.get(i) == states.get(j).gethappiness_index())
                {
                    states.add(states.get(j));
                    states.remove(j);
                    break;
                }
            }
        }
    }

    public static int SumPopulation()
    {
        int sum = 0;
        for(int i = 0; i < states.size(); i++)
        {
            sum += states.get(i).getpopulation();
        }
        return sum;
    }

    public static float ArmyPercentage(String name)
    {
        float percent = 1;
        for(int i = 0; i < states.size(); i++)
        {
            if(states.get(i).getname().equals(name))
            { 
                percent = ((float) states.get(i).getarmy() / states.get(i).getpopulation());
            }
        }
        return percent*100;
    }
    public static float Difference_in_Happines_index()
    {
        Sorthappiness_index(true);
        return states.get(states.size() - 1).gethappiness_index() - states.get(0).gethappiness_index();
    }
    public static void Predominance_getform_of_government()
    {
        int count = 0;
        for(int i = 0; i < states.size(); i++)
        {
            if(states.get(i).getform_of_government().equals("Республика"))
            {
                count += 1;
            }
            else
            {
                count -= 1;
            }
        }
        if(count > 0) System.out.println("Республик больше, чем монархических государств");
        else if(count < 0) System.out.println("Монархических государств больше, чем республик");
        else System.out.println("Республик и монархических государств поровну");
    }
    public static void Predominance_gettype_of_monarchy()
    {
        int count = 0;
        for(int i = 0; i < states.size(); i++)
        {
            if(states.get(i).gettype_of_monarchy().equals("; Тип монархии: Королевство"))
            {
                count += 1;
            }
            else
                if(states.get(i).gettype_of_monarchy().equals("; Тип монархии: Султанат"))
                {
                    count -= 1;
                }
        }
        if(count > 0) System.out.println("Королевств больше, чем султанатов");
        else if(count < 0) System.out.println("Cултанатов больше, чем Королевств");
        else System.out.println("Королевств и султанатов поровну");
    }

}
