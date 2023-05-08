/*
5) Escreva um programa em Java que filtre uma String, de forma que a partir de uma String lida
do teclado, o programa crie uma nova String contendo somente os valores numéricos da
String entrada. Por exemplo, se a String entrada for ”1a2b09cd”, a String resultante deve
ser ”1209”. Dica: você pode usar o método estático isDigit() da classe Character.
*/

import java.io.*;


public class AnexoA05 
{
    public static void main (String args[]) throws IOException 
    {
        BufferedReader input;
        input = new BufferedReader (new InputStreamReader (System.in));

        System.out.print("Digite uma string:");
        String text = input.readLine();

        String newText = text.replaceAll("[^0-9]", "");

        System.out.println(newText);
    }
} 