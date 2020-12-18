package com.company;

public class Sultanate extends Monarchy
{
    private String sultan;
    protected Sultanate(String name, String form_of_government, String type_of_monarchy)
    {
        this.name = name;
        this.form_of_government = form_of_government;
        this.type_of_monarchy = type_of_monarchy;
        Work();
    }

    private void Work()
    {
        System.out.println("Введите население");
        super.Inputpopulation();
        System.out.println("Введите армию");
        super.Inputarmy();
        System.out.println("Введите индекс счастья");
        super.Inputhappiness_index();
        System.out.println("Введите имя султана");
        Setpresident(Main.in.nextLine());
    }

    private void Setpresident(String president)
    {
        this.sultan = president;
    }


    @Override
    protected String getRuler() {
        return "Султан: " + sultan;
    }

    @Override
    protected String gettype_of_monarchy() {
        return "; Тип монархии: " + super.type_of_monarchy;
    }
}
