package biblioteca;

import java.time.LocalDate;

public class Reserva {
    private Usuario usuario;
    private Livro livro;
    private LocalDate dataReserva;
    private LocalDate prazoRetirada;

    public Reserva() {
	}
    
    public Reserva(Usuario usuario, Livro livro) {
        this.usuario = usuario;
        this.livro = livro;
        this.dataReserva = LocalDate.now();
        this.prazoRetirada = dataReserva.plusDays(3);
    }

    public boolean isValida() {
        return LocalDate.now().isBefore(prazoRetirada);
    }

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}

	public LocalDate getDataReserva() {
		return dataReserva;
	}

	public void setDataReserva(LocalDate dataReserva) {
		this.dataReserva = dataReserva;
	}

	public LocalDate getPrazoRetirada() {
		return prazoRetirada;
	}

	public void setPrazoRetirada(LocalDate prazoRetirada) {
		this.prazoRetirada = prazoRetirada;
	}

    
}
