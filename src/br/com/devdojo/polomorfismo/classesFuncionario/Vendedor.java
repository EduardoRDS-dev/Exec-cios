package br.com.devdojo.polomorfismo.classesFuncionario;

public class Vendedor extends Funcionario {

    private double totalVendas;

    public Vendedor(String nome, double salario, double totalVendas) {
        super(nome, salario);
        this.totalVendas = totalVendas;
    }

    public Vendedor() {
    }

    public void calcComicao(){
        comicao = totalVendas * 0.10;
    }

    public double getTotalVendas() {
        return totalVendas;
    }

    public void setTotalVendas(double totalVendas) {
        this.totalVendas = totalVendas;
    }

    @Override
    public String toString() {
        return "Vendedor{" +super.toString()+
                ", totalVendas=" + totalVendas +
                ", comicao=" + comicao +
                ", salarioBruto=" + salarioBruto +
                '}';
    }
}
