import java.util.ArrayList;

public class Conversa {
    ArrayList<Mensagem> mensagens = new ArrayList<>();

    public void adicionar(Mensagem mensagem) {
        mensagens.add(mensagem);
    }

    public void mostrarHistorico() {
        System.out.println("\n=== Histórico ===");

        for (Mensagem mensagem : mensagens) {
            mensagem.mostrar();
        }
    }
}