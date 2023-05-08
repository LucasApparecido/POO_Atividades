/*
12) Escreva um programa em Java que crie um array de Strings e o popule (através da leitura dos
seus elementos pelo teclado). Após isto, faça com que o programa calcule e imprima quantas
Strings tem menos do que dez caracteres.
*/

import java.io.*;

public class AnexoA12 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Quantos elementos? ");
        int tamanho = Integer.parseInt(input.readLine());
        String[] vetor = new String[tamanho];

        for (int i = 0; i < tamanho; i++) 
        {
            System.out.print("vetor[" + i + "] = ");
            vetor[i] = input.readLine();
        }

        int cont = 0;

        for (String string : vetor) 
        {
            if (string.length() < 10) 
            {
                cont++;
            }
        }

        System.out.println("Existem " + cont + " strings com menos de dez caracteres.");
    }
}