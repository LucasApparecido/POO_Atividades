/*
10.Desenvolva, uma classe que modele um objeto
funcionário em conformidade com o paradigma orientado a objeto. Posteriormente implemente
esta classe. A classe deverá ter as seguintes características: nome, salário, número de filhos,
calcular aumento de salário ( a porcentagem é fornecida por parâmetro), calcular desconto no
imposto de renda (R$1250,25 por filho) e calcular INSS ( 6% para salário <= R$2545,00 e 10%
para o restante).
*/

public class AnexoB10 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Luke", 7300.0f, 2);
        System.out.println("Salário do funcionário " + funcionario.getNome() + ": R$" + funcionario.getSalario());
        double aumento = funcionario.calcularAumentoSalario(10);
        System.out.println("Novo salário do funcionário " + funcionario.getNome() + ": R$" + funcionario.getSalario());
        System.out.println("Aumento de salário: R$" + aumento);
        double descontoIR = funcionario.calcularDescontoIR();
        System.out.println("Desconto de IR: R$" + descontoIR);
        double inss = funcionario.calcularINSS();
        System.out.println("INSS: R$" + inss);
    }
}

class Funcionario {
    private String nome;
    private float salario;
    private int quantFilhos;

    public Funcionario(String nome, float salario, int quantFilhos) {
        this.nome = nome;
        this.salario = salario;
        this.quantFilhos = quantFilhos;
    }

    public float calcularAumentoSalario(float porcentagem) {
        float aumento = salario * (porcentagem / 100.0f);
        salario += aumento;
        return aumento;
    }

    public float calcularDescontoIR() {
        float descontoIR = quantFilhos * 1250.25f;
        if (salario <= 1903.98) {
            return 0.0f;
        } else if (salario <= 2826.65) {
            return (salario * 0.075f) - descontoIR;
        } else if (salario <= 3751.05) {
            return (salario * 0.15f) - descontoIR;
        } else if (salario <= 4664.68) {
            return (salario * 0.225f) - descontoIR;
        } else {
            return (salario * 0.275f) - descontoIR;
        }
    }

    public float calcularINSS() {
        if (salario <= 2545.00) {
            return salario * 0.06f;
        } else {
            return salario * 0.1f;
        }
    }

    public String getNome() {
        return nome;
    }

    public float getSalario() {
        return salario;
    }

    public int getQuantFilhos() {
        return quantFilhos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setQuantFilhos(int quantFilhos) {
        this.quantFilhos = quantFilhos;
    }
}