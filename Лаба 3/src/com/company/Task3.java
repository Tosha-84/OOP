package com.company;

public class Task3
{
    private String str;

    public Task3() {
        this.str = "I love you, Hachiko!";
    }
    public Task3(String str) {
        this.str = str;
    }
    public Task3(Task3 A) {
        this(A.getstr());
    }

    public String getstr() { return str; }
    public void setstr(String str) {
        this.str = str;
    }
    public void answer()
    {
        String[] arr = str.split(" ");
        StringBuilder newStr = new StringBuilder();
        for(int i=0; i<arr.length; ++i)
        {
            if((i+1) % 3 != 0)
            {
                newStr.append(arr[i]);
                newStr.append(" ");
            }
        }
        System.out.println("Это предложение после удаления каждого 3-го слова");
        System.out.println(newStr.toString());
    }
}