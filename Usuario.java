
public class Usuario {
    String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public void enviarSolicitacao(
            Solicitacao solicitacao,
            InteligenciaArtificial ia,
            Conversa conversa) {

        conversa.adicionar(
            new Mensagem(nome, solicitacao.conteudo)
        );

        String resposta = ia.responder(solicitacao);

        conversa.adicionar(new Mensagem("IA", resposta));

        System.out.println("\nResposta: " + resposta);
    }
}
