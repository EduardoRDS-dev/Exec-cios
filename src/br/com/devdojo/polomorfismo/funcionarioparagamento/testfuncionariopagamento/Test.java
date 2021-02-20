package br.com.devdojo.polomorfismo.funcionarioparagamento.testfuncionariopagamento;

import br.com.devdojo.polomorfismo.funcionarioparagamento.Funcionario;
import br.com.devdojo.polomorfismo.funcionarioparagamento.Gerente;
import br.com.devdojo.polomorfismo.funcionarioparagamento.RelatorioDePagamento;
import br.com.devdojo.polomorfismo.funcionarioparagamento.Vendedor;

public class Test {

    public static void main(String[] args) {

        Funcionario gerente = new Gerente("Marcio Alves", "Gerente", 10000, 2000);
        gerente.calcularPagamento();

        Funcionario vendedor = new Vendedor("Lucas Silva", "Vendedor", 8000, 30000);
        vendedor.calcularPagamento();

        RelatorioDePagamento relatorioDePagamento = new RelatorioDePagamento();
        relatorioDePagamento.gerarRelatorioDePagamento(gerente);
        relatorioDePagamento.gerarRelatorioDePagamento(vendedor);

    }
}
