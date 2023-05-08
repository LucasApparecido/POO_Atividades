/*
8) Escreva uma classe Dado que tenha um método estático arremesso() que ao ser chamado
imprima um valor entre 1 e 6.
*/

import java.util.Random;


public class AnexoA08 
{
    public static void main (String args[])
    { 
        System.out.println("Número sorteado:" + Dice.arremesso()); 
    }
}

class Dice 
{
    public static int arremesso()
    {
        Random generator = new Random();
        return generator.nextInt(6)+1;
    }
}