package br.com.devdojo.io_classes.input_stream_and_output_stream;

import java.nio.file.Path;
import java.nio.file.Paths;

public class TestClasses {

    public static void main(String[] args) {
        Path file = Paths.get("pastaTeste/subsubpasta/arquivoSpeedStream.txt");
        InputStreamTest inputStreamTest = new InputStreamTest();
        OutputStreamTest outputStreamTest = new OutputStreamTest();
        outputStreamTest.write(file);
        inputStreamTest.read(file);



    }
}
