package com.company;

public class task3
{
    private String str;

    public task3() {
        this.str = "I love you, Hachiko!";
    }
    public task3(String str) {
        this.str = str;
    }
    public task3(task3 A) {
        this.str = A.str;
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
