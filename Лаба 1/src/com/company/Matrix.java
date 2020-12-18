package com.company;
import java.util.Scanner;
public class Matrix {
    private int rang;
    private int[][] mas = new int[11][11];
    public Matrix() {
        this.rang = 3;
        for (int i = 0; i < this.rang; i++) {
            for (int j = 0; j < this.rang; j++) {
                this.mas[i][j] = 0;
            }
        }
    }

    public Matrix(int rang, int[][] mas) {
        this.rang = rang;
        this.mas = mas;
    }

    public Matrix(Matrix A) {
        this.rang = A.rang;//.getrang();
        this.mas = A.mas;//getmas();
    }

    public int getrang() {
        return rang;
    }

    public void setRandRang() {
        this.rang = rand(0);
    }

    public void setHandRang(int rang) {
        this.rang = rang;
    }

    public int[][] getmas() {
        return mas;
    }

    public void setRandMas() {
        {
            for (int i = 0; i < this.rang; i++) {
                for (int j = 0; j < this.rang; j++) {
                    this.mas[i][j] = rand(1);
                }
            }
        }
    }

    public void setHandMas(int[][] mas) {
        this.mas = mas;
    }

    private int rand(int q) {
        int rand;
        if (q == 0) rand = (int) (Math.random() * (11 - (2)) + 2);
        else rand = (int) (Math.random() * (101 - (-100)) + (-100));
        return rand;
    }

    public void sign_out_mas() {
        for (int i = 0; i < this.rang; i++) {
            for (int j = 0; j < this.rang; j++) {
                System.out.print(this.mas[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public int min(int[][] A) {
        int min = A[0][0];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (A[i][j] < min) {
                    min = A[i][j];
                }
            }
        }
        return min;
    }


    private static int handRang() {
        Scanner in = new Scanner(System.in);
        int rang;
        System.out.println("Введите порядок матрицы");
        do rang = in.nextInt();
        while (rang > 10);
        return rang;
    }

    private static int[][] handcreate(int rang) {
        Scanner in = new Scanner(System.in);
        int[][] mas = new int[11][11];
        for (int i = 0; i < rang; i++) {
            for (int j = 0; j < rang; j++) {
                System.out.println("Введите элемент матрицы " + (i + 1) + "-й строки " + (j + 1) + "-го столбца");
                mas[i][j] = in.nextInt();
            }
        }
        return mas;
    }
}
