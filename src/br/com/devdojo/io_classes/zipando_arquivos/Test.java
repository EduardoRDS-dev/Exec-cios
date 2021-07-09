package br.com.devdojo.io_classes.zipando_arquivos;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Test {

    public static void main(String[] args) {

        // Objetivo: zipar os arquivos de mods do RavenField
        // Diretório dos mods: /home/zeus/Downloads/Ravenfield/ravenfield_Data/Mods
        Path directoryTarget = Paths.get("/home/zeus/Downloads/Ravenfield/ravenfield_Data/Mods");
        Path directoryDestiny = Paths.get("/home/zeus/Área de Trabalho");
        Path fileZip = directoryDestiny.resolve("Mods_Ravenfield.zip");

        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(fileZip.toFile()))) {
            Files.walkFileTree(directoryTarget, new FindAllMods(zipOutputStream));
            System.out.println("concluído!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static class FindAllMods extends SimpleFileVisitor<Path> {

        ZipOutputStream search;

        public FindAllMods(ZipOutputStream zipOutputStream) {
            search = zipOutputStream;
        }

        @Override
        public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {

            PathMatcher pathMatcher = FileSystems.getDefault().getPathMatcher("glob:**/*.{rfl,rfc,rfld}");
            if (pathMatcher.matches(file)) {

                search.putNextEntry(new ZipEntry(file.getFileName().toString()));
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file.toFile()));
                int readSize = bufferedInputStream.read();
                byte[] buff = new byte[readSize];

                while ((bufferedInputStream.read(buff)) > 0) {
                    search.write(buff);
                }

                search.flush();
                search.closeEntry();
                bufferedInputStream.close();
            }
            return FileVisitResult.CONTINUE;

        }
    }
}

