/*
1) Escreva um programa em Java que peça ao usuário que digite uma String, e só aceite Strings
cujo comprimento seja maior ou igual a 10 caracteres. 
*/

import java.io.*;

public class AnexoA01 
{
    public static void main (String args[]) throws IOException 
    {
        BufferedReader input;
        input = new BufferedReader (new InputStreamReader(System.in));

        System.out.print ("Digite uma string:");
        String text = input.readLine();

        if (text.length() >= 10)
        {
            System.out.println (text+ " foi aceita!");
        } else 
        {
            System.out.println (text+ " nao foi aceita!");
        }
    }
}