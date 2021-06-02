package br.com.devdojo.io_classes.filewriter_and_filereader;


import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterAndFileReaderTest {
    public static void main(String[] args) {

        File file = new File("teste.txt");

        try (FileWriter fileWriter = new FileWriter(file, true);
             FileReader fileReader = new FileReader(file)) {

            fileWriter.write("escrevendo uma segunda mensagem\npulando linha\n");
            fileWriter.flush();

            char[] input = new char[300];
            int size = fileReader.read(input);
            System.out.println("caractere lidos:" + size);

            for (char aux : input) {
                System.out.print(aux);
            }
        } catch (IOException exception) {
            exception.printStackTrace();
        }
    }

}
