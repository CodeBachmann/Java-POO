package gerenciaBiblioteca;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Emprestimo {
	
	private Livro livro;
	private Usuario usuario;
	private LocalDate dataDoEmprestimo;
	private LocalDate dataPrevistaDevolucao;
	private LocalDate dataDevolucao;
	
	public Emprestimo(Livro livro, Usuario usuario, LocalDate dataDoEmprestimo, LocalDate dataPrevistaDevolucao, LocalDate dataDevolucao) {
		this.livro = livro;
		this.usuario = usuario;
		this.dataDoEmprestimo = dataDoEmprestimo;
		this.dataPrevistaDevolucao = dataPrevistaDevolucao;
		this.dataDevolucao = dataDevolucao;
	}
	
	public void calculaMulta() {
		
		long diffDias = ChronoUnit.DAYS.between(this.dataPrevistaDevolucao, this.dataDevolucao);
		
		
	}
	
}
