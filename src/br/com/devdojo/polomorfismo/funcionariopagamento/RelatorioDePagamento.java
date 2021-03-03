package br.com.devdojo.polomorfismo.funcionariopagamento;

public class RelatorioDePagamento {

    public void gerarRelatorioDePagamento(Funcionario funcionario) {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("    Relatorio de pagamento para funcionarios");
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Função: " + funcionario.getFuncao());
        System.out.println("Salario bruto deste mês: " + funcionario.getSalario());
        if (funcionario instanceof Gerente) {
            System.out.println("Pnl: " + ((Gerente) funcionario).getParticipacaoNosLucros());
            System.out.println("-----------------------------------------------------------------");
        } else if (funcionario instanceof Vendedor) {
            System.out.println("Total de vendas: " + ((Vendedor) funcionario).getTotalDeVendas());
            System.out.println("-----------------------------------------------------------------");
        }
    }
}
