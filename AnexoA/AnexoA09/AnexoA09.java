/*
9) Escreva uma classe Triangulo que encapsule três valores de ponto flutuante correspondentes
aos lados do triângulo. Os valores devem ser passados para o construtor da classe. Nesta
classe, escreva os métodos calculaPerímetro() e calculaÁrea() que calculam o perímetro e
área do triângulo. Escreva também o método tipo() que retorna 1 se o triângulo for escaleno, 2
se o triângulo for isósceles e 3 se for equilátero.
*/

import java.lang.Math;
import java.io.*;

public class AnexoA09
{
    public static void main (String args[]) throws IOException
    {
        BufferedReader input;
        input = new BufferedReader (new InputStreamReader (System.in));

        System.out.println("Digite o primeiro lado: ");
        float side1 = Float.parseFloat(input.readLine());

        System.out.println("Digite o segundo lado: ");
        float side2 = Float.parseFloat(input.readLine());

        System.out.println("Digite o terceiro lado: ");
        float side3 = Float.parseFloat(input.readLine());

        Triangulo triangle = new Triangulo(side1, side2, side3);

        System.out.println("Perímetro: " + triangle.calculaPerimetro());

        System.out.println("Área: " + triangle.calculaArea());

        System.out.print("Tipo: " + triangle.tipo());

        if(triangle.tipo() == 1)
        {
            System.out.println(" (Escaleno)");
        }
        else if(triangle.tipo() == 2)
        {
            System.out.println(" (Isósceles)");
        }
        else
        {
            System.out.println(" (Equilátero)");
        }
    }
}

class Triangulo
{
    private float side1;
    private float side2;
    private float side3;

    public Triangulo(float side1, float side2, float side3)
    {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public float calculaPerimetro()
    {
        return this.side1 + this.side2 + this.side3;
    }

    public float calculaArea()
    {
        float perimeter = this.calculaPerimetro() / 2;
        return (float) Math.sqrt(perimeter * (perimeter - this.side1) * (perimeter - this.side2) * (perimeter - this.side3));
    }

    public int tipo()
    {
        if (this.side1 == this.side2 && this.side2 == this.side3)
        {
            return 3;
        }
        else if (this.side1 == this.side2 || this.side2 == this.side3 || this.side1 == this.side3)
        {
            return 2;
        }
        else
        {
            return 1;
        }
    }

    public float getSide1()
    {
        return side1;
    }

    public void setSide1(float side1)
    {
        this.side1 = side1;
    }

    public float getSide2()
    {
        return side2;
    }

    public void setSide2(float side2)
    {
        this.side2 = side2;
    }

    public float getSide3()
    {
        return side3;
    }

    public void setSide3(float side3)
    {
        this.side3 = side3;
    }
}