/*
5. Desenvolva, uma classe que modele um objeto
paralelepípedo em conformidade com o paradigma orientado a objeto. Posteriormente
implemente esta classe. A classe deverá ter as seguintes características: altura, largura,
comprimento, calcular volume e calcular área. O cálculo do volume (altura * comprimento *
largura) e o cálculo da área ( 2 * (altura * largura + altura * comprimento + largura *
comprimento).
*/

public class AnexoB05 {
    public static void main(String[] args) {
        Paralelepipedo paralelepipedo = new Paralelepipedo(5, 7, 3);
        System.out.println("Area: " + String.format("%.2f", paralelepipedo.calcularArea()));
        System.out.println("Volume: " + String.format("%.2f", paralelepipedo.calcularVolume()));
    }
}

class Paralelepipedo {
    private float altura;
    private float comprimento;
    private float largura;

    public Paralelepipedo(float comprimento, float largura, float altura) {
        if (altura < 0 || largura < 0 || comprimento < 0) {
            throw new IllegalArgumentException("As dimensões do paralelepípedo não podem ser negativas");
        }
        this.altura = altura;
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public float calcularVolume() {
        return largura * comprimento * altura;
    }

    public float calcularArea() {
        return 2 * ((altura * largura) + (altura * comprimento) + (largura * comprimento));
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        if (altura < 0) {
            throw new IllegalArgumentException("A altura do paralelepípedo não pode ser negativa");
        }
        this.altura = altura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        if (comprimento < 0) {
            throw new IllegalArgumentException("O comprimento do paralelepípedo não pode ser negativo");
        }
        this.comprimento = comprimento;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        if (largura < 0) {
            throw new IllegalArgumentException("A largura do paralelepípedo não pode ser negativa");
        }
        this.largura = largura;
    }
}