/*
3. Desenvolva, uma classe que modele um objeto esfera em
conformidade com o paradigma orientado a objeto. Posteriormente implemente esta classe. A
classe deverá conter as seguintes características: raio e cálculo da área e do volume da esfera.
Obs.: o valor do raio não pode ser negativo. À área total = (4*3.1415*raio ao quadrado) e volume
=((4/3)*3.1415*raio ao cubo).
*/

public class AnexoB03 {
    public static void main(String[] args) 
    {
        Esfera esfera = new Esfera(4);
        System.out.println("Area: " + String.format("%.2f", esfera.calcularArea()));
        System.out.println("Volume: " + String.format("%.2f", esfera.calcularVolume()));
    }
}

class Esfera {
    private float raio;

    public Esfera(float raio) 
    {
        if (raio < 0) 
        {
            throw new IllegalArgumentException("O raio da esfera não pode ser negativo");
        }
        this.raio = raio;
    }

    public float calcularArea() 
    {
        return (float) (4 * Math.PI * Math.pow(raio, 2));
    }

    public float calcularVolume() 
    {
        return (float) ((4.0/3.0) * Math.PI * Math.pow(raio, 3));
    }
    
    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        if (raio < 0) 
        {
            throw new IllegalArgumentException("O raio da esfera não pode ser negativo");
        }
        this.raio = raio;
    }
}