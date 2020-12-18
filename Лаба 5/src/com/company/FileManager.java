package com.company;
import java.lang.*;
import java.io.*;
public  class FileManager
{
    private static String StringFromFile = new String();


    public static void WriteFile(String StringToWrite)
    {
        try(FileOutputStream fos=new FileOutputStream("TestFile", true))
        {
            // перевод строки в байты
            byte[] buffer = StringToWrite.getBytes();
            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
    public static void WriteFile(String StringToWrite, String FileName)
    {
        try(FileOutputStream fos = new FileOutputStream(FileName))
        {
            // перевод строки в байты
            byte[] buffer = StringToWrite.getBytes();
            fos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public static String GetStringFromReadedFile(String FileName)
    {
        String ReadedString = "";
        try(FileInputStream fin = new FileInputStream(FileName))
        {
            //  System.out.printf("File size: %d bytes \n", fin.available());
            int i;
            while((i = fin.read()) != -1)
            {
                ReadedString = ReadedString+(char)i;
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        return ReadedString;
    }

    public static int[][] Decoding(String strmatrix)
    {
        int rang;
        //strmatrix = strmatrix.substring(7);
        rang = Integer.valueOf(strmatrix.substring(0, 1));
        strmatrix = strmatrix.substring(1);
        int[][] matrix = new int[rang][rang];
        for(int i = 0; i < rang; i++)
        {
            strmatrix = strmatrix.substring(1);
            for(int j = 0; j < rang; j++)
            {
                matrix[i][j] = Integer.valueOf(strmatrix.substring(0, strmatrix.indexOf(" ")));
                strmatrix = strmatrix.substring(strmatrix.indexOf(" ") + 1);
            }
            if(i != 3)
            {
                strmatrix = strmatrix.substring(1);
            }
        }

        for (int i = 0; i < rang; i++)
        {
            for (int j = 0; j < rang; j++)
            {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }


        return matrix;
    }
}
