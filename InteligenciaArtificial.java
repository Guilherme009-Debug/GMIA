
public class InteligenciaArtificial {

    Pesquisa pesquisa = new Pesquisa();
    GeradorImagen imagem = new GeradorImagen();
    GeradorCodigo codigo = new GeradorCodigo();

    public String responder(Solicitacao solicitacao) {

        if (solicitacao.conteudo.isBlank()) {
            return "Digite um pedido válido.";
        }

        switch (solicitacao.tipo) {
            case "1":
                return pesquisa.executar(solicitacao.conteudo);

            case "2":
                return imagem.executar(solicitacao.conteudo);

            case "3":
                return codigo.executar(solicitacao.conteudo);

            default:
                return "Opção inválida.";
        }
    }
}
