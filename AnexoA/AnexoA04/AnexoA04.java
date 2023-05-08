/*
4) Escreva um programa em Java que leia uma String do teclado e troque todas as vogais não
acentuadas da String pelo caracter ’?’.
*/

import java.io.*;


public class AnexoA04 
{
    public static void main (String args[]) throws IOException
    {
        BufferedReader input;
        input = new BufferedReader (new InputStreamReader (System.in));

        System.out.print("Digite uma string:");
        String text = input.readLine();

        String newText = text.replaceAll("[aeiouAEIOU]", "?");

        System.out.println(newText);
    }
}