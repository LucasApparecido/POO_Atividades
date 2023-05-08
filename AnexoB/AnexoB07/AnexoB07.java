/*
7. Desenvolva, uma classe que modele um objeto cone em
conformidade com o paradigma orientado a objeto. Posteriormente implemente esta classe. A
classe deverá ter as seguintes características: raio, altura e cálculo da geratriz, área lateral, área
total e o volume. Obs.: os valores do raio e da altura não podem ser negativos. O cálculo da
geratriz é (Raiz Quadrada((altura ao quadrado) + (raio ao quadrado))), da área lateral é (3.1415 * raio 8 geratriz), da área total
é (3.1415 * raio * (geratriz + raio)) e do volume é (1.0/3.0 * 3.1415 * raio ao quadrado * altura).
*/

public class AnexoB07 {
    public static void main(String[] args) {
        Cone cone = new Cone(7, 3);
        System.out.println("Area Lateral: " + String.format("%.2f", cone.calcularAreaLateral()));
        System.out.println("Area Total: " + String.format("%.2f", cone.calcularAreaTotal()));
        System.out.println("Volume: " + String.format("%.2f", cone.calcularVolume()));
    }
}

class Cone {
    private float altura;
    private float raio;

    public Cone(float raio, float altura) {
        if (altura < 0 || raio < 0) {
            throw new IllegalArgumentException("As dimensões do Cone não podem ser negativas");
        }
        this.altura = altura;
        this.raio = raio;
    }

    public float calcularGeratriz() {
        return (float) Math.sqrt(Math.pow(altura, 2) + Math.pow(raio, 2));
    }

    public float calcularAreaLateral() {
        return (float) (Math.PI * raio * calcularGeratriz());
    }

    public float calcularAreaTotal() {
        return (float) (Math.PI * raio * (calcularGeratriz() + raio));
    }

    public float calcularVolume() {
        return (float) ((1.0/3.0) * Math.PI * Math.pow(raio, 2) * altura);
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        if (raio < 0) {
            throw new IllegalArgumentException("O raio do cone deve ser positivo.");
        }
        this.raio = raio;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if (altura < 0) {
            throw new IllegalArgumentException("A altura do cone deve ser positiva.");
        }
        this.altura = altura;
    }
}