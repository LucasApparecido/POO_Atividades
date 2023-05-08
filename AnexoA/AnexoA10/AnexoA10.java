/*
10) Escreva um programa em Java que sorteie 50 números entre 0 e 99 para jogar na Lotomania.
O programa não deverá sortear duas vezes o mesmo número. Dica: use um array para
armazenar os números sorteados.
*/

import java.util.Random;

public class AnexoA10
{
    public static void main (String args[])
    {
        int[] numbers = new int[50];
        int index = 0;
        Random random = new Random();

        while (index < 50)
        {
            int number = random.nextInt(100);
            if (!contemNumero(numbers, number)) {
                numbers[index] = number;
                index++;
            }
        }

        System.out.println("Números sorteados: ");
        for(int i = 0; i < 50; i++)
        {
            System.out.println(numbers[i]);
        }
    }

    private static boolean contemNumero(int[] numeros, int numero) 
    {
        for (int n : numeros) {
            if (n == numero) {
                return true;
            }
        }
        return false;
    }
}