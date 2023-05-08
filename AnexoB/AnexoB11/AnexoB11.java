/*
11. Desenvolva, uma classe que modele um objeto paciente
em conformidade com o paradigma orientado a objeto. Posteriormente implemente esta classe. A
classe deverá ter as seguintes características: nome, peso, altura, calcular IMC e calcular a faixa
de peso. O cálculo do IMC = peso/(altura ao quadrado). 

A faixa de peso é calculada de acordo com a tabela abaixo:

IMC                   | Faixa de Risco
Abaixo de 20          | Abaixo do peso
A partir de 20 até 25 | Peso normal
Acima de 25 até 30    | Excesso de peso
Acima de 30 até 35    | Obesidade
Acima de 35 até 40    | Obesidade mórbida

*/

public class AnexoB11 {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Luke", 73.0, 1.73);
        System.out.println("IMC do paciente " + paciente.getNome() + ": " + String.format("%.2f",paciente.calcularIMC()));
        System.out.println("Faixa de peso do paciente " + paciente.getNome() + ": " + paciente.calcularFaixaPeso());
    }
}

class Paciente {
    private String nome;
    private double peso;
    private double altura;

    public Paciente(String nome, double peso, double altura) {
        this.nome = nome;
        this.peso = peso;
        this.altura = altura;
    }

    public String calcularFaixaPeso() {
        double imc = calcularIMC();
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc < 25) {
            return "Peso normal";
        } else if (imc < 30) {
            return "Sobrepeso";
        } else if (imc < 35) {
            return "Obesidade grau 1";
        } else if (imc < 40) {
            return "Obesidade grau 2";
        } else {
            return "Obesidade grau 3";
        }
    }

    public String getNome() {
        return nome;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double calcularIMC() {
        return peso / (altura * altura);
    }
}