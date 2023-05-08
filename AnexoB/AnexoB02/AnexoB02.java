/*
2. Desenvolva, uma classe que modele um objeto pirâmide
em conformidade com o paradigma orientado a objeto. Posteriormente implemente esta classe. A
classe deverá ter as seguintes características: base, altura e calcular volume. Volume = (1/3 *
base * altura)
*/

public class AnexoB02 
{
    public static void main(String[] args) 
    {
        Piramide piramide = new Piramide(10, 5);
        System.out.println("Volume: " + String.format("%.2f", piramide.calcularVolume()));
    }
}

class Piramide 
{
    private float base;
    private float altura;

    public Piramide(float base, float altura) 
    {
        this.base = base;
        this.altura = altura;
    }

    public float calcularVolume() 
    {
        return (1.0f/3.0f) * base * altura;
    }

    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}