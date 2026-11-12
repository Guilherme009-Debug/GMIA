public class Pesquisa extends ProcessadorSolicitacao {

    private Conversa conversa;

    public Pesquisa(Conversa conversa) {
        this.conversa = conversa;
    }

    @Override
    public String executar(String termo) {
        return conversa.buscar(termo);
    }
}