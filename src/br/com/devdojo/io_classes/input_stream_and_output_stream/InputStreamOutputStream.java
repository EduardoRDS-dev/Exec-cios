package br.com.devdojo.io_classes.input_stream_and_output_stream;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class InputStreamOutputStream {
    public static void main(String[] args) {

        writeFileStream();
        readFileStream();
        writeBufferedStream();
        readBufferedStream();
    }

    //Escrever fluxo de dados 'Stream' em um arquivo.
    //Class: FileOutputStream
    public static void writeFileStream(){

        Path file = Paths.get("pastaTeste/subsubpasta/arquivoStream.txt");
        byte [] aux = {10,20,30,40,50,60,70,80,90};

        try(FileOutputStream fileOutputStream = new FileOutputStream(file.toFile(),true)){
            fileOutputStream.write(aux);
            fileOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //Escrever fluxo de dados 'Stream' em um arquivo, de forma performática.
    //Class: BufferedOutputStream
    public static void writeBufferedStream(){

        Path file = Paths.get("pastaTeste/subsubpasta/arquivoSpeedStream.txt");
        byte [] aux = {97,98,99,100,101,102,103,104,105};

        try(BufferedOutputStream bufferedStream = new BufferedOutputStream(new FileOutputStream(file.toFile(),true))){
            bufferedStream.write(aux);
            bufferedStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Ler fluxo de dados 'Stream', vindos de um arquivo
    // Class: FileInputStream.
    public static void readFileStream(){

        Path file = Paths.get("pastaTeste/subsubpasta/arquivoStream.txt");

        try(FileInputStream fileStream = new FileInputStream(file.toFile())){
            int aux;
            while((aux = fileStream.read()) != -1){
                byte result = (byte) aux;
                System.out.print(result+" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Ler fluxo de dados 'Stream' vindos de um arquivo, de forma performática.
    //Class BufferedInputStream.
    public static void readBufferedStream(){

        Path file = Paths.get("pastaTeste/subsubpasta/arquivoSpeedStream.txt");

        try(BufferedInputStream readBufferedStream = new BufferedInputStream(new FileInputStream(file.toFile()))){
            int aux;
            while((aux = readBufferedStream.read()) != -1){
                byte result = (byte) aux;
                System.out.print(result+" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
