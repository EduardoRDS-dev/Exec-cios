package br.com.devdojo.assertivas;


public class CalculaSalarioTest {
    public static void main(String[] args) {

        System.out.println(calculaSalario(3000));
        System.out.println(calcSalario(5000));
        diasDaSemana(7);
    }

    //Uso de assertiva apenas em class privadas onde o dev tem o controle total sobre o que será inserido,
    //sendo um medida para encontrar erro no método. Exemplo de uso:
    private static double calculaSalario(double salario) {
        double total;
        assert (salario > 0) : "Salário não pode ser menor que zero!";
        return total = (salario * 0.5) + salario;
    }

    //Em casos de métodos públicos o melhor a se usar pra prevenir ou testar é um if para testar o que
    // foi inserido e lançar uma exception caso o não corresponda ao esperado.  Exemplo de uso:
    public static double calcSalario(double salario) {
        double total;
        if (salario < 0) {
            throw new IllegalArgumentException("Salário não pode ser menor que zero!");
        }
        return total = (salario * 0.5) + salario;
    }

    //Caso onde pode-se usar assertiva em uma class pública,

    public static void diasDaSemana(int dia) {
        String day = null;
        switch (dia) {
            case 1:
                System.out.println("domingo");
                break;
            case 2:
                System.out.println("segunda");
                break;
            case 3:
                System.out.println("terça");
                break;
            case 4:
                System.out.println("quarta");
                break;
            case 5:
                System.out.println("quinta");
                break;
            case 6:
                System.out.println("sexta");
                break;
            case 7:
                System.out.println("sábado");
                break;
            default:
                assert false;
        }
    }
}
