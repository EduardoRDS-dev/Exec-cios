package br.com.devdojo.assertivas.test;


public class CalculaSalarioTest {
    public static void main(String[] args) {

        System.out.println(calculaSalario(3000));
        System.out.println(calcSalario(5000));
        System.out.println(diasDaSemana(1));
    }
    //Uso de assertiva apenas em class privadas onde o dev tem o controle total sobre o que será inserido,
    //sendo um medida para encontrar erro no método. Exemplo de uso:
    private static double calculaSalario(double salario){
        double total;
        assert(salario > 0):"Salário não pode ser menor que zero!";
        return total = (salario * 0.5) + salario;
    }
    //Em casos de métodos públicos o melhor a se usar pra prevenir ou testar é um if para testar o que
    // foi inserido e lançar uma exception caso o não corresponda ao esperado.  Exemplo de uso:
     public static double calcSalario(double salario){
        double total;
        if(salario < 0 ){
            throw new IllegalArgumentException("Salário não pode ser menor que zero!");
        }
        return total = (salario * 0.5)+salario;
    }

    //Caso onde pode-se usar assertiva em uma class pública,

    public static String diasDaSemana(int dia){
        String day = null;
        switch(dia){
            case 1: return day = "segunda";
            case 2: return day = "terça";
            case 3: return day = "quarta";
            case 4: return day = "quinta";
            case 5: return day = "sexta";
            case 6: return day = "sábado";
            case 7: return day = "domingo";
            default: assert false;
        }
        return day;
    }
}
