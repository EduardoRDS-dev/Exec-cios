package br.com.devdojo.polomorfismo.polimorfismo_interface.teste_Interface_dao;


import br.com.devdojo.polomorfismo.polimorfismo_interface.InterfaceDAO;
import br.com.devdojo.polomorfismo.polimorfismo_interface.SalvarEmArquivoDeTesto;
import br.com.devdojo.polomorfismo.polimorfismo_interface.SavarNoBancoDeDados;

public class InterfaceDaoTest {

    public static void main(String[] args) {

        InterfaceDAO salvarNoBancoDeDados = new SavarNoBancoDeDados();
        salvarNoBancoDeDados.salvarDados();

        InterfaceDAO salvarNoArquivoTxt = new SalvarEmArquivoDeTesto();
        salvarNoArquivoTxt.salvarDados();
  }
}
