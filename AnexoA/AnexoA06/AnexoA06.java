/*
6) Escreva um programa em Java que tenha um método chamado é URL que recebe uma String
como argumento e verdadeiro se esta String começa com ”http:” ou ”ftp:” ou falso caso
contrário.
*/

import java.io.*;

public class AnexoA06 
{
    public static void main (String args[]) throws IOException
    {
        BufferedReader input;
        input = new BufferedReader (new InputStreamReader (System.in));

        System.out.print("Digite uma string:");
        String text = input.readLine();


        if(URL(text))
        {
            System.out.println("E uma URL");
        } else 
        {
            System.out.println("Nao e uma URL");
        }
    }

    public static boolean URL(String text){
        boolean beginHttp = text.startsWith("http:");
        boolean beginFtp = text.startsWith("ftp:");
        return beginFtp || beginHttp;
    }
}