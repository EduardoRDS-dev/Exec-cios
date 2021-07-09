package br.com.devdojo.io_classes.class_console;

import java.io.Console;

public class ConsoleTest {
    public static void main(String[] args) {
        Console console = System.console();
        char[] pass = console.readPassword("%s", "senha:");

        for (char aux : pass) {
            console.format("%c", aux);
        }
    }
}
