package br.com.devdojo.nio_classes.posix_file_atributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.PosixFileAttributeView;
import java.nio.file.attribute.PosixFileAttributes;
import java.nio.file.attribute.PosixFilePermission;
import java.nio.file.attribute.PosixFilePermissions;
import java.util.Set;

public class PosixFileAttributesTest {
    public static void main(String[] args) {

        Path file = Paths.get("/home/zeus/CursoJava/home/zeus/projeto/arquivo1.txt");
        if(Files.exists(file)) {
            try {
                PosixFileAttributes posixAttributes = Files.readAttributes(file, PosixFileAttributes.class);
                System.out.println("Permissions: " + posixAttributes.permissions());
                System.out.println("User: " + posixAttributes.owner());
                System.out.println("---------------------");

                PosixFileAttributeView posixView = Files.getFileAttributeView(file,PosixFileAttributeView.class);
                Set<PosixFilePermission> permissions = PosixFilePermissions.fromString("rw-rw-rw-");
                Files.setPosixFilePermissions(file,permissions);

                System.out.println("alterando permissão");
                System.out.println("Permissions: " + posixAttributes.permissions());
                System.out.println("User: " + posixAttributes.owner());
                System.out.println("---------------------");
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
