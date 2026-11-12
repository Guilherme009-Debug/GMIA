public class GeradorImagen extends ProcessadorSolicitacao {

    @Override
    public String executar(String descricao) {
        return "Descrição recebida para criar uma imagem: "
                + descricao;
    }
}