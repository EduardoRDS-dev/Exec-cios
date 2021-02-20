package br.com.devdojo.polomorfismo.classesFuncionario.test_funcionario;

import br.com.devdojo.polomorfismo.classesFuncionario.Funcionario;
import br.com.devdojo.polomorfismo.classesFuncionario.Gerente;
import br.com.devdojo.polomorfismo.classesFuncionario.RelatorioPagamentoGenerico;
import br.com.devdojo.polomorfismo.classesFuncionario.Vendedor;

public class FuncionarioTest {

    public static void main(String[] args) {

        Funcionario G = new Gerente("Eduardo Rodrigues Dos Santos",10000);
        G.calcComicao();
        G.calcularPagamento();

        Funcionario V = new Vendedor("Bruno Silva",8000,20000);
        V.calcComicao();
        V.calcularPagamento();

        RelatorioPagamentoGenerico R = new RelatorioPagamentoGenerico();
        R.relatorioDePagamento(G);
        R.relatorioDePagamento(V);

    }
}
