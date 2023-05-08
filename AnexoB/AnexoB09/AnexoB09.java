/*
9. Desenvolva, uma classe que modele um objeto
funcionário em conformidade com o paradigma orientado a objeto. Posteriormente implemente
esta classe. A classe deverá ter as seguintes características: nome do funcionário, CPF, número
de horas trabalhadas, valor da hora de trabalho, calcular salário(número de horas trabalhadas *
valor da hora de trabalho).
*/

public class AnexoB09 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Luke", "123.456.789-00", 20f, 7.3f);;
        System.out.println("Novo salário do funcionário " + funcionario.getNome() + ": R$" + funcionario.calcularSalario());
    }
}

class Funcionario {
    private String nome;
    private String cpf;
    private float horasTrabalhadas;
    private float valorHora;

    public Funcionario(String nome, String cpf, float horasTrabalhadas, float valorHora) {
        this.nome = nome;
        this.cpf = cpf;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    public float calcularSalario() {
        return horasTrabalhadas * valorHora;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public float getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public float getValorHora() {
        return valorHora;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setHorasTrabalhadas(float horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void setValorHora(float valorHora) {
        this.valorHora = valorHora;
    }
}