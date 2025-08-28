package gerenciaBiblioteca;

import java.util.List;

public class Usuario {
	
	private String nome;
	private int id;
	private List<Livro> livrosEmprestados;
	
	public Usuario(String nome, int id, List<Livro> livrosEmprestados) {
		this.nome = nome;
		this.id = id;
		this.livrosEmprestados = livrosEmprestados;
	}
}
