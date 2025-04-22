package biblioteca;

import java.time.LocalDate;

public class Livro {

	private String titulo;
	private String autor;
	private String isbn;
	private LocalDate dataPublicacao;
	private String categoria;
	private StatusLivro status;
	
	public Livro() {
	}
	
	public Livro(String titulo, String autor, String isbn, LocalDate dataPublicacao, String categoria) {
		this.titulo = titulo;
		this.autor = autor;
		this.isbn = isbn;
		this.dataPublicacao = dataPublicacao;
		this.categoria = categoria;
		this.status = StatusLivro.DISPONIVEL;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public LocalDate getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicacao(LocalDate dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public boolean isDisponivel() {
		return status == StatusLivro.DISPONIVEL;
    }

    public void emprestar() {
        status = StatusLivro.EMPRESTADO;
    }

    public void devolver() {
        status = StatusLivro.DISPONIVEL;
    }

	public StatusLivro getStatus() {
		return status;
	}

	public void setStatus(StatusLivro status) {
		this.status = status;
	}
	
}
