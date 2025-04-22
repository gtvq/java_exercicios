package biblioteca;
import java.util.ArrayList;
import java.util.List;

public class Usuario {
	
	private String nome;
	private int id;
	private String email;
	private List<Reserva> reservas;
	private List<Emprestimo> emprestimos;
	
	public Usuario() {
	}
	
	public Usuario(String nome, int id, String email) {
		this.nome = nome;
		this.id = id;
		this.email = email;
		this.reservas = new ArrayList<>();
		this.emprestimos = new ArrayList<>();
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
    public void reservarLivro(Livro livro) {
		if (!livro.isDisponivel()) {
            Reserva reserva = new Reserva(this, livro);
            reservas.add(reserva);
            System.out.println("Livro reservado com sucesso.");
        } else {
            System.out.println("Livro está disponível, não pode ser reservado.");
        }
    }

    public void realizarEmprestimo(Livro livro) {
        if (livro.isDisponivel()) {
            livro.emprestar();
            Emprestimo emprestimo = new Emprestimo(this, livro);
            emprestimos.add(emprestimo);
            System.out.println("Empréstimo realizado.");
        } else {
            System.out.println("Livro não está disponível.");
        }
    }

    public void devolverLivro(Livro livro) {
        for (Emprestimo e : emprestimos) {
            if (e.getLivro().equals(livro) && e.getDataDevolucao() == null) {
                e.setDataDevolucao();
                livro.devolver();
                double multa = e.calcularMulta();
                if (multa > 0) {
                    receberNotificacao("Você recebeu uma multa de R$ " + multa);
                }
                return;
            }
        }
    }

    public void receberNotificacao(String mensagem) {
        Notificacao notificacao = new Notificacao(this, mensagem);
        notificacao.enviar();
    }

	public List<Reserva> getReservas() {
		return reservas;
	}

	public void setReservas(List<Reserva> reservas) {
		this.reservas = reservas;
	}

	public List<Emprestimo> getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(List<Emprestimo> emprestimos) {
		this.emprestimos = emprestimos;
	}
    
    

}
