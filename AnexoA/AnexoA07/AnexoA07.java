/*
7) Escreva um programa que calcule a área de um círculo, usando o valor constante de pi e o
valor do raio lido do teclado.
*/

import java.io.*;

public class AnexoA07 
{

    public static void main (String args[]) throws IOException
    {
        try
        { 
            BufferedReader input;
            input = new BufferedReader (new InputStreamReader (System.in));

            System.out.print("Digite raio:");
            float radius = Float.parseFloat(input.readLine());
            
            double areaCircle = Math.PI*radius*radius;

            System.out.println("Area do circulo é "+ String.format("%.2f", areaCircle));
        } catch (NumberFormatException error)
        {
            System.out.println("Houve erro na conversao, digite apenas caracteres numericos");
        }
    }
}