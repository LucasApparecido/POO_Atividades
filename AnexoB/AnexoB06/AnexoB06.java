/*
6.Desenvolva, uma classe que modele um objeto cilindro em
conformidade com o paradigma orientado a objeto. Posteriormente implemente esta classe. A
classe deverá ter as seguintes características: raio, altura e cálculo da área lateral, área total e
volume. Obs.: os valores do raio e da altura não podem ser negativos. O cálculo da área lateral é
(2 * 3.1415 * raio * altura), área total (2 * 3.1415 * raio(altura + raio)) e volume (3.1415 * raio * raio * altura).
*/

public class AnexoB06 {
    public static void main(String[] args) {
        Cilindro cilindro = new Cilindro(7, 3);
        System.out.println("Area Lateral: " + String.format("%.2f", cilindro.calcularAreaLateral()));
        System.out.println("Area Total: " + String.format("%.2f", cilindro.calcularAreaTotal()));
        System.out.println("Volume: " + String.format("%.2f", cilindro.calcularVolume()));
    }
}

class Cilindro {
    private float altura;
    private float raio;

    public Cilindro(float raio, float altura) {
        if (altura < 0 || raio < 0) {
            throw new IllegalArgumentException("As dimensões do cilindro não podem ser negativas");
        }
        this.altura = altura;
        this.raio = raio;
    }

    public float calcularAreaLateral() {
        return (float) (2 * Math.PI * raio * altura);
    }

    public float calcularAreaTotal() {
        return (float) (2 * Math.PI * raio * (altura + raio));
    }

    public float calcularVolume() {
        return (float) (Math.PI * raio * raio * altura);
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if (altura < 0) {
            throw new IllegalArgumentException("A altura do cilindro não pode ser negativa");
        }
        this.altura = altura;
    }

    public float getRaio() {
        return raio;
    }

    public void setRaio(float raio) {
        if (raio < 0) {
            throw new IllegalArgumentException("O raio do cilindro não pode ser negativo");
        }
        this.raio = raio;
    }
}