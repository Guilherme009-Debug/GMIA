
public class Mensagem {
	 	private String autor;
	    private String conteudo;

	    public Mensagem(String autor, String conteudo) {
	        this.autor = autor;
	        this.conteudo = conteudo;
	    }

	    public void mostrar() {
	        System.out.println(autor + ": " + conteudo);
	    }

}
