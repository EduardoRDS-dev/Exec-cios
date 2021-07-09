package br.com.devdojo.io_classes.input_stream_and_output_stream;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) {

        writerBuffered();
        readerBuffered();
    }

    public static void writerBuffered() {
        byte[] b = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100, '\n'};
        Path stream = Paths.get("projeto/stream.txt");
        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(stream.toFile(), true))) {

            for (int aux = 1000; aux > 0; --aux) {
                outputStream.write(b);
            }
            outputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    static void readerBuffered() {

        Path stream = Paths.get("projeto/stream.txt");
        try (BufferedInputStream inputStream = new BufferedInputStream(new FileInputStream(stream.toFile()))) {
            int reader;
            while ((reader = inputStream.read()) != -1) {
                byte result =(byte) reader;
                System.out.print(result+" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}