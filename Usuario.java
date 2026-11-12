public class Usuario {

    private String nome;

    public Usuario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void enviarSolicitacao(
            Solicitacao solicitacao,
            InteligenciaArtificial ia,
            Conversa conversa) {

        conversa.adicionar(
            new Mensagem(nome, solicitacao.getConteudo())
        );

        String resposta = ia.responder(solicitacao);

        conversa.adicionar(new Mensagem("IA", resposta));

        System.out.println("\nResposta: " + resposta);
    }

    public void salvarArquivo(
            Projeto projeto,
            String nomeArquivo,
            String conteudo) {

        ArquivoProjeto arquivo =
                new ArquivoProjeto(nomeArquivo, conteudo, nome);

        projeto.adicionarArquivo(arquivo);
    }
}