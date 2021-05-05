package br.com.devdojo.wrapper.test;

public class WrapperTest {

        public static void main(String[] args) {


                //Tipos primitivos:

                byte bytePrimitivo = 1;
                short shortPrimitivo = 2;
                int intPrimitivo = 10;
                long longPrimitivo = 20;
                float floatPrimitivo = 30;
                double doublePrimitivo = 60;
                char charPrimitivo = 'A';
                boolean booleanPrimitivo = true;

                /*
                Class Wrapper dos tipos primitivos:
                são class utilitárias que contém muitos métodos pra facilitar procedimentos
                com converter Strings ou conferir o parâmetro entre muitas outras funções.
                */


                Byte byteWrapper = 1;
                Short shortWrapper = 2;
                Integer intWrapper = 10;
                Long longWrapper = 20L;
                Float floatWrapper = 30F;
                Double doubleWrapper = 60D;
                Character charWrapper = 'A';
                Boolean booleanWrapper = false;

                // método parse, converte um string em um valor de acordo com seu tipo.

                String teste = "10";
                Integer intTeste = Integer.parseInt(teste);
                System.out.println(intTeste);
        }
}
