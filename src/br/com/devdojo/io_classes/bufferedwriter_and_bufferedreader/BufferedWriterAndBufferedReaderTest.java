package br.com.devdojo.io_classes.bufferedwriter_and_bufferedreader;

import java.io.*;

public class BufferedWriterAndBufferedReaderTest {
    public static void main(String[] args) {

        File file = new File("arquivo.txt");
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
             BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {

            bufferedWriter.write("Escrevendo no arquivo");
            bufferedWriter.newLine();
            bufferedWriter.flush();

            String output;
            while ((output = bufferedReader.readLine()) != null) {
                System.out.println(output);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
