/*
2) Escreva um programa em Java que leia uma String do teclado e imprima seus caracteres, um
por um.
*/

import java.io.*;


public class AnexoA02 
{
    public static void main (String args[]) throws IOException 
    {
        BufferedReader input;
        input = new BufferedReader (new InputStreamReader(System.in));

        System.out.print ("Digite uma string:");
        String text = input.readLine();

        for (int i=0; i < text.length(); i++)
        {
            System.out.println(text.charAt(i));
        }
    }
}