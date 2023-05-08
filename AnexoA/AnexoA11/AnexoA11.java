/*
11) Escreva um programa em Java que declare e inicialize um vetor de booleanos (lendo-os do
teclado), e calcule quantos elementos são iguais a true.
*/

import java.io.*;

public class AnexoA11 {
    public static void main(String[] args) throws IOException 
    {
        try 
        {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            int tamanho = 0;
            boolean[] vetor;

            System.out.print("Quantos elementos? ");
            tamanho = Integer.parseInt(input.readLine());
            vetor = new boolean[tamanho];

            for (int i = 0; i < tamanho; i++) 
            {
                System.out.print("vetor[" + i + "] = ");
                vetor[i] = Boolean.parseBoolean(input.readLine());
            }

            int contTrue = 0;

            for (int i = 0; i < tamanho; i++) 
            {
                if (vetor[i]) {
                    contTrue++;
                }
            }

            System.out.println("Existem " + contTrue + " elementos iguais a true.");
        } catch (NumberFormatException erro) 
        {
            System.out.println("Houve erro na conversao, digite apenas caracteres numericos");
        }
    }
}
