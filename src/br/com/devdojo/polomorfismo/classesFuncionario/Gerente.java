package br.com.devdojo.polomorfismo.classesFuncionario;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public Gerente() {
    }

    public void calcComicao(){
        comicao =  salario * 0.10;
    }

    @Override
    public String toString() {
        return "Gerente{" +super.toString()+
                ", comicao=" + comicao +
                ", salarioBruto=" + salarioBruto +
                '}';
    }
}