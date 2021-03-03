package br.com.devdojo.polomorfismo.funcionariopagamento;

public class Vendedor extends Funcionario {

    private double totalDeVendas;

    public Vendedor(String nome, String funcao, double salario, double totalDeVendas) {
        super(nome, funcao, salario);
        this.totalDeVendas = totalDeVendas;
    }

    public Vendedor() {
    }

    public void calcularPagamento(){
        salario = salario + (totalDeVendas * 0.10);
    }

    public double getTotalDeVendas() {
        return totalDeVendas;
    }

    public void setTotalDeVendas(double totalDeVendas) {
        this.totalDeVendas = totalDeVendas;
    }
}
