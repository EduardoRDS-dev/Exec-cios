package br.com.devdojo.io_classes.zipando_arquivos;

import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class TestZip {
    public static void main(String[] args) {

        Path directoryFiles = Paths.get("pastaTeste/subsubpasta");
        Path safeFileZip = Paths.get("/home/zeus/Área de Trabalho");
        Path zipFile = safeFileZip.resolve("fileZip.zip");

        try(ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream(zipFile.toString()));
            DirectoryStream<Path> directoryStream = Files.newDirectoryStream(directoryFiles)){

            for(Path path: directoryStream){
                ZipEntry zipEntry = new ZipEntry(path.getFileName().toString());
                zipOutputStream.putNextEntry(zipEntry);

                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(path.toFile()));
                int size = bufferedInputStream.read();
                byte [] buff = new byte[size];
                int readSize;
                while((readSize = bufferedInputStream.read(buff)) > 0){
                    zipOutputStream.write(buff);
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
