package gerenciaBiblioteca;

public class Livro {
	private String titulo;
	private String autor;
	private String isbn;
	private boolean disponivel;
	
	public Livro(String titulo, String autor, String isbn, boolean disponivel){
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.disponivel = disponivel;
	}
}
