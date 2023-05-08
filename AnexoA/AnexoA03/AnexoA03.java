/*
3) Escreva um programa em Java que receba uma String e um valor numérico N do teclado, e
imprima somente os primeiros N caracteres da String. O programa deve verificar se N é um
valor válido (menor que o comprimento da String).
*/

import java.io.*;


public class AnexoA03 
{
    public static void main (String args[]) throws IOException
    {
        BufferedReader input;
        input = new BufferedReader (new InputStreamReader(System.in));

        System.out.print("Digite uma string:");
        String text = input.readLine();

        System.out.print("Quantidade de caracteres:");
        int number = Integer.parseInt(input.readLine());

        if (number <= text.length()){   
                String aux = text.substring(0, number);         
                System.out.println(aux);
        } else {
            System.out.println("Numero de caracteres invalido!");
        }
    }
}