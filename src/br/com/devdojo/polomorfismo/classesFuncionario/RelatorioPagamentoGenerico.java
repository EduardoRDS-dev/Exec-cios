package br.com.devdojo.polomorfismo.classesFuncionario;

public class RelatorioPagamentoGenerico {

   public RelatorioPagamentoGenerico(){
   }

    public void relatorioDePagamento(Funcionario funcionario){
        System.out.println("------------------------------------------------");
        System.out.println("Relatório de pagamento para funcionario");
        System.out.println("Funcionario: "+funcionario.getNome());
        System.out.println("salário: "+ funcionario.getSalario());
        System.out.println("comição: "+ funcionario.comicao);
        System.out.println("salario total dest mês: "+ funcionario.salarioBruto);
        System.out.println("------------------------------------------------");
    }
}
