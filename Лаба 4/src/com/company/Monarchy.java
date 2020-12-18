package com.company;

abstract public class Monarchy extends State
{
    protected String type_of_monarchy;
    protected static void Work(String name, String form_of_government)
    {
        boolean check;
        System.out.println("Какой тип монархии в этом государстве? (Введите \"true\", если королевство и \"false\", если султанат");
        check = Main.StrtoBoolean();
        if(check)
        {
            Kingdom kingdom = new Kingdom(name, form_of_government, "Королевство");
            Work_with_States.AddState(kingdom);
        }
        else
        {
            Sultanate sultanate = new Sultanate(name, form_of_government, "Султанат");
            Work_with_States.AddState(sultanate);
        }
    }

}
