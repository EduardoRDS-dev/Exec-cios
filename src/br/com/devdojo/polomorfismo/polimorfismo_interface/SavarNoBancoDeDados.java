package br.com.devdojo.polomorfismo.polimorfismo_interface;

public class SavarNoBancoDeDados implements InterfaceDAO{

    public void salvarDados(){

        System.out.println("_________________________________ ");
        System.out.println("| Salvando no banco de dados... |");
        System.out.println("|_______________________________|");
    }
}
