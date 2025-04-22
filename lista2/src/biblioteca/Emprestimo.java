package biblioteca;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Emprestimo {
    private Usuario usuario;
    private Livro livro;
    private LocalDate dataInicio;
    private LocalDate dataPrevistaDevolucao;
    private LocalDate dataDevolucao;

    public Emprestimo(Usuario usuario, Livro livro) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataInicio = LocalDate.now();
        this.dataPrevistaDevolucao = dataInicio.plusDays(14);
    }

    public void setDataDevolucao() {
        this.dataDevolucao = LocalDate.now();
    }

    public double calcularMulta() {
        if (dataDevolucao != null && dataDevolucao.isAfter(dataPrevistaDevolucao)) {
            long diasAtraso = ChronoUnit.DAYS.between(dataPrevistaDevolucao, dataDevolucao);
            return diasAtraso * 2.0;
        }
        return 0.0;
    }

    public Livro getLivro() {
        return livro;
    }

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataPrevistaDevolucao() {
		return dataPrevistaDevolucao;
	}

	public void setDataPrevistaDevolucao(LocalDate dataPrevistaDevolucao) {
		this.dataPrevistaDevolucao = dataPrevistaDevolucao;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public void setDataDevolucao(LocalDate dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

    
}
