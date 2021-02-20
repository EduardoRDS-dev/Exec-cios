package br.com.devdojo.tratamentoexecoes.trywithresources;

public class TryWithResources {
    public static void main(String[] args) {
        try {
            lerArquivo();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void lerArquivo() throws Exception {

        try (Leitor1 leitor1 = new Leitor1();
             Leitor2 leitor2 = new Leitor2()) {
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
