/*
1. Criar uma classe Pessoa com os seguintes itens:
    - nome;
    - idade;
    - peso;
    - altura;
    - calcula o IMC (peso/altura ao quadrado)
*/

public class AnexoB01 
{
    public static void main(String[] args) 
    {
        Pessoa p1 = new Pessoa("João", 20, 80f, 1.80f);
        p1.imprimeIMC();
    }
}

class Pessoa 
{
    private String nome;
    private int idade;
    private float peso;
    private float altura;

    public Pessoa(String nome, int idade, float peso, float altura) 
    {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public float calculaIMC() 
    {
        return this.peso / (this.altura * this.altura);
    }

    public void imprimeIMC() {
        String imc = String.format("%.2f", calculaIMC());
        System.out.println("O IMC de " + nome + " é " + imc);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}