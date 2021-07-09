package br.com.devdojo.io_classes.input_stream_and_output_stream;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Scanner;

public class OutputStreamTest {

    public void write(Path file) {

        try (BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file.toFile(), true))) {

            Scanner scanner = new Scanner(System.in);
            bufferedOutputStream.write(scanner.nextLine().getBytes(StandardCharsets.UTF_8));
            bufferedOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
