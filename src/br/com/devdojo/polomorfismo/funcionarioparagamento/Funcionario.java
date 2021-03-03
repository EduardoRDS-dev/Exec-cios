package br.com.devdojo.polomorfismo.funcionarioparagamento;

public abstract class Funcionario {
    protected String nome;
    protected String funcao;
    protected double salario;
    protected String descricao;

    public Funcionario(String nome, String funcao, double salario) {
        this.nome = nome;
        this.funcao = funcao;
        this.salario = salario;


    }

    public Funcionario() {
    }

    public abstract void calcularPagamento();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

}
