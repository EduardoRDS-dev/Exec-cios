package br.com.devdojo.polomorfismo.polimorfismo_interface;

public class SalvarEmArquivoDeTesto implements InterfaceDAO{

    @Override
    public void salvarDados() {

        System.out.println("_________________________________ ");
        System.out.println("| Salvando em um arquivo txt... |");
        System.out.println("|_______________________________|");

    }
}
