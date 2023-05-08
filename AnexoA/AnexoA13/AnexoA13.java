/*
13) Escreva um programa em Java que peça ao usuário uma frase e verifique se nela há as
palavras ”-help” ou ”-h”.
*/

import java.io.*;

public class AnexoA13 {
    public static void main(String[] args) throws IOException 
    {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Digite uma frase: ");
        String frase = input.readLine();

        if (frase.contains("-help") || frase.contains("-h")) 
        {
            System.out.println("A frase contém '-help' ou '-h'.");
        } else 
        {
            System.out.println("A frase não contém '-help' nem '-h'.");
        }
    }
}