package com.company;

public class Republic extends State
{
    private String president;
    protected Republic(String name, String form_of_government)
    {
        this.name = name;
        this.form_of_government = form_of_government;
        /*this.population = population;
        this.army = army;
        this.happiness_index = happiness_index;*/
        Work();
    }

    private void Work()
    {
        System.out.println("Введите население");
        super.Inputpopulation();
        System.out.println("Введите армию");
        super.Inputarmy();
        System.out.println("Введите коэффициент счастья");
        super.Inputhappiness_index();
        System.out.println("Введите имя президента");
        Setpresident(Main.in.nextLine());
    }



    private void Setpresident(String president)
    {
        this.president = president;
    }

    @Override
    protected String getRuler() {
        return "Президент: " + president;
    }

    @Override
    protected String gettype_of_monarchy() {
        return "";
    }

}
