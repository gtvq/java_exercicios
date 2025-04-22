package biblioteca;

import java.time.LocalDate;

public class Notificacao {
    private Usuario usuario;
    private String mensagem;
    private LocalDate dataEnvio;

    public Notificacao(Usuario usuario, String mensagem) {
        this.usuario = usuario;
        this.mensagem = mensagem;
        this.dataEnvio = LocalDate.now();
    }

    public void enviar() {
        System.out.println("Notificação para " + usuario.getNome() + ": " + mensagem);
    }

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public String getMensagem() {
		return mensagem;
	}

	public void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public LocalDate getDataEnvio() {
		return dataEnvio;
	}

	public void setDataEnvio(LocalDate dataEnvio) {
		this.dataEnvio = dataEnvio;
	}

    
}