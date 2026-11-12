public class GeradorCodigo extends ProcessadorSolicitacao {

    @Override
    public String executar(String pedido) {
        return "Pedido de código recebido: " + pedido;
    }
}