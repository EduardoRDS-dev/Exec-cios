package br.com.devdojo.io_classes.class_file;

import java.io.*;

public class Teste {
    public static void main(String[] args) {

        File diretorio = new File("teste");
        boolean create = diretorio.mkdir();

        File file = new File(diretorio, "aquivo.txt");

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file,true));
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){

            bufferedWriter.newLine();
            bufferedWriter.write("teste de escrita");
            bufferedWriter.flush();

            String saida;
            while((saida = bufferedReader.readLine()) != null){
                System.out.println(saida);

            }
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
