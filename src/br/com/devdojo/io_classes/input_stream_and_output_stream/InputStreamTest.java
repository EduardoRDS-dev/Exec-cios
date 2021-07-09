package br.com.devdojo.io_classes.input_stream_and_output_stream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Path;

public class InputStreamTest {

    public void read(Path path) {

        try (BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(path.toFile()))) {
            int aux;
            while((aux = bufferedInputStream.read()) != -1 ){
                byte result = (byte) aux;
                System.out.print(result+" ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}