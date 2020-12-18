package com.company;

abstract public class State {
    protected String name;
    protected String form_of_government;
    protected int population;
    protected int army;
    protected float happiness_index;


    public static void Definition(String name, String form_of_government)
    {
        if (form_of_government == "Республика")
        {
            Republic republic = new Republic(name, form_of_government);
            Work_with_States.AddState(republic);
        }
        else
        {
            Monarchy.Work(name, form_of_government);
        }
    }

    private void Setname(String name)
    {
        this.name = name;
    }
    private void Inputname()
    {
        Setname(Main.in.nextLine());
    }
    public String getname()
    {
        return name;
    }

    private void Setform_of_government(String form_of_government)
    {
        this.form_of_government = form_of_government;
    }
    private void Inputform_of_government()
    {
        Setform_of_government(Main.in.nextLine());
    }
    public String getform_of_government()
    {
        return form_of_government;
    }

    private void Setpopulation(int population)
    {
        this.population = population;
    }
    protected void Inputpopulation()
    {
        Setpopulation(Main.StrtoInt());
    }
    protected int getpopulation()
    {
        return population;
    }

    private void Setarmy(int army)
    {
        this.army = army;
    }
    protected void Inputarmy()
    {
        Setarmy(Main.StrtoInt());
    }
    protected int getarmy()
    {
        return army;
    }

    private void Sethappiness_index(float happiness_index)
    {
        this.happiness_index = happiness_index;
    }
    protected void Inputhappiness_index()
    {
        Sethappiness_index(Main.StrtoFloat());
    }
    protected float gethappiness_index()
    {
        return happiness_index;
    }

    protected abstract String getRuler();
    protected abstract String gettype_of_monarchy();
}
