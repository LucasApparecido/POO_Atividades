/*
4. Desenvolva, uma classe que modele um objeto retângulo
em conformidade com o paradigma orientado a objeto. Posteriormente implemente esta classe. A
classe deverá ter as seguintes características: comprimento, largura e cálculo do perímetro e da
área do retângulo. Obs.: os valores da largura e do comprimento não podem ser negativos. O
cálculo da área (largura * comprimento) e do perímetro (soma dos quatro lados).
*/

public class AnexoB04 
{
    public static void main(String[] args) 
    {
        Retangulo retangulo = new Retangulo(5, 7);
        System.out.println("Area: " + String.format("%.2f", retangulo.calcularArea()));
        System.out.println("Perimetro: " + String.format("%.2f", retangulo.calcularPerimetro()));
    }
}

class Retangulo 
{
    private float comprimento;
    private float largura;

    public Retangulo(float comprimento, float largura) 
    {
        if (comprimento < 0 || largura < 0) 
        {
            throw new IllegalArgumentException("O comprimeto e a largura não podem ser negativo");
        }
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public float calcularArea() 
    {
        return largura * comprimento;
    }

    public float calcularPerimetro() 
    {
        return 2 * (largura * comprimento);
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        if (comprimento < 0) 
        {
            throw new IllegalArgumentException("O comprimento não pode ser negativo");
        }
        this.comprimento = comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        if (largura < 0) 
        {
            throw new IllegalArgumentException("A largura não pode ser negativa");
        }
        this.largura = largura;
    }
}