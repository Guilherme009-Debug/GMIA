public class ArquivoProjeto {

    private String nome;
    private String conteudo;
    private String criador;

    public ArquivoProjeto(String nome, String conteudo, String criador) {
        this.nome = nome;
        this.conteudo = conteudo;
        this.criador = criador;
    }

	public void mostrar() {
        System.out.println("Arquivo: " + nome);
        System.out.println("Criado por: " + criador);
        System.out.println("Conteúdo: " + conteudo);
    }
}
