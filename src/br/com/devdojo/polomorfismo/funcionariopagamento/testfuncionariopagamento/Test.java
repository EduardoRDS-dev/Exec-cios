package br.com.devdojo.polomorfismo.funcionariopagamento.testfuncionariopagamento;

import br.com.devdojo.polomorfismo.funcionariopagamento.Funcionario;
import br.com.devdojo.polomorfismo.funcionariopagamento.Gerente;
import br.com.devdojo.polomorfismo.funcionariopagamento.RelatorioDePagamento;
import br.com.devdojo.polomorfismo.funcionariopagamento.Vendedor;

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
