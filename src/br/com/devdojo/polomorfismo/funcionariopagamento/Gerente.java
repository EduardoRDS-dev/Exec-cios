package br.com.devdojo.polomorfismo.funcionariopagamento;

public class Gerente extends Funcionario {

    private double participacaoNosLucros;

    public Gerente(String nome, String funcao, double salario, double participacaoNosLucros) {
        super(nome, funcao, salario);
        this.participacaoNosLucros = participacaoNosLucros;
    }

    public Gerente() {
        super( );
    }

    public void calcularPagamento(){
        salario = salario + participacaoNosLucros;
    }
    public double getParticipacaoNosLucros() {
        return participacaoNosLucros;
    }
    public void setParticipacaoNosLucros(double participacaoNosLucros) {
        this.participacaoNosLucros = participacaoNosLucros;
    }
}
