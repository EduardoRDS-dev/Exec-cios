package br.com.devdojo.io_classes.zipando_arquivos;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipFIleTest {
    public static void main(String[] args) {

        // **Linha de raciocínio:
        // Onde vai ser salvo o arquivo '.zip'
        // Qual o path dos arquivos que serão zipados
        // Arquivo zip
        Path directoryZip = Paths.get("pastaTeste");
        Path directoryFiles = Paths.get("pastaTeste/subsubpasta");
        Path zip = directoryZip.resolve("fileZip.zip");

        try (ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(zip.toFile()));
             DirectoryStream<Path> directoryStream = Files.newDirectoryStream(directoryFiles)) {

            for (Path path : directoryStream) {

                ZipEntry zipEntry = new ZipEntry(path.getFileName().toString());
                zipOutputStream.putNextEntry(zipEntry);

                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(path.toFile()));
                int sizeByteFile = bufferedInputStream.read();
                byte[] buffStream = new byte[sizeByteFile];
                int aux;
                while ((aux = bufferedInputStream.read(buffStream)) > 0) {
                    zipOutputStream.write(buffStream);
                }

                zipOutputStream.flush();
                zipOutputStream.closeEntry();
                bufferedInputStream.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
