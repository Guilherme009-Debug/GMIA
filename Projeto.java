import java.util.ArrayList;

public class Projeto {

    private ArrayList<ArquivoProjeto> arquivos = new ArrayList<>();

    public void adicionarArquivo(ArquivoProjeto arquivo) {
        arquivos.add(arquivo);

        System.out.println("Arquivo adicionado ao projeto!");
    }

    public void mostrarArquivos() {
        System.out.println("\n=== Arquivos do projeto ===");

        if (arquivos.isEmpty()) {
            System.out.println("Nenhum arquivo foi criado.");
        } else {
            for (ArquivoProjeto arquivo : arquivos) {
                arquivo.mostrar();
                System.out.println("--------------------");
            }
        }
    }
}