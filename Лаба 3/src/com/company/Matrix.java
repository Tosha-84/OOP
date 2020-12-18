package com.company;
public class Matrix
{
    private int rang;
    private int[][] mas = new int[11][11];
    public Matrix() {
        this.rang = 3;
        for(int i = 0; i < this.rang; i++)
        {
            for(int j = 0; j < this.rang; j++)
            {
                this.mas[i][j] = 0;
            }
        }
    }

    public Matrix(int rang, int[][] mas) {
        this.rang = rang;
        this.mas = mas;
    }

    public Matrix(Matrix A) {
        this(A.getrang(), A.getmas());
    }

    public int getrang()
    {
        return rang;
    }

    public void setRandRang()
    {
        rang = rand(0);
    }

    public void setHandRang(int rang)
    {
        this.rang = rang;
    }

    public int[][] getmas()
    {
        return mas;
    }

    public void setRandMas()
    {
        {
            for (int i = 0; i < rang; i++)
            {
                for (int j = 0; j < rang; j++)
                {
                    mas[i][j] = rand(1);
                }
            }
        }
    }

    public void setHandMas(int[][] mas)
    {
        this.mas = mas;
    }

    private int rand(int q)
    {
        int rand;
        if (q == 0) rand = (int) (Math.random() * (11 - (2)) + 2);
        else rand = (int) (Math.random() * (101 - (-100)) + (-100));
        return rand;
    }

    public void sign_out_mas()
    {
        for (int i = 0; i < rang; i++)
        {
            for (int j = 0; j < rang; j++)
            {
                System.out.print(mas[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public int min(int[][] A)
    {
        int min = A[0][0];
        for (int i = 0; i < A.length; i ++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i][j] < min)
                {
                    min = A[i][j];
                }
            }
        }
        return min;
    }

    public int getmasElement(int i, int j)
    {
        return this.mas[i][j];
    }
}