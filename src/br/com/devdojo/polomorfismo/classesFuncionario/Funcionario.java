package br.com.devdojo.polomorfismo.classesFuncionario;

public abstract class Funcionario {
    protected String nome;
    protected double salario;
    protected double comicao;
    protected double salarioBruto;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public Funcionario() {

    }
    public abstract void calcComicao();
    public void calcularPagamento(){
        salarioBruto = salario + comicao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", salario=" + salario +
                '}';
    }
}
