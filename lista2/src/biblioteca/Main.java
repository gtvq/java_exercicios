package biblioteca;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static String nome = "Sistema de Biblioteca";
    static List<Usuario> usuarios = new ArrayList<>();
    static List<Livro> livros = new ArrayList<>();

    public static void main(String[] args) {

        Livro livro1 = new Livro("O Hobbit", "J.R.R. Tolkien", "123456", LocalDate.of(1937, 9, 21), "Fantasia");
        Livro livro2 = new Livro("1984", "George Orwell", "654321", LocalDate.of(1949, 6, 8), "Distopia");
        livros.add(livro1);
        livros.add(livro2);

        Usuario usuario1 = new Usuario("Alice", 1, "alice@email.com");
        Usuario usuario2 = new Usuario("Bob", 2, "bob@email.com");
        usuarios.add(usuario1);
        usuarios.add(usuario2);


        consultaUsuarios();
        consultaLivros();

        reserva(livro1, usuario1);
        empresta(livro1, usuario1, LocalDate.now(), LocalDate.now().plusDays(14));
        notificaEmprestimo(usuario1, livro1);
        
        reserva(livro1, usuario2);

        livro1.devolver();
        notificaReserva();
    }

    public static void consultaUsuarios() {
        System.out.println("\nUsuários cadastrados:");
        for (Usuario u : usuarios) {
            System.out.println("- " + u.getNome() + " (ID: " + u.getId() + ")");
        }
    }

    public static void consultaLivros() {
        System.out.println("\nLivros disponíveis:");
        for (Livro l : livros) {
            System.out.println("- " + l.getTitulo() + " [" + l.getStatus() + "]");
        }
    }

    public static void reserva(Livro livro, Usuario usuario) {
        usuario.reservarLivro(livro);
    }

    public static void empresta(Livro livro, Usuario usuario, LocalDate dataInicio, LocalDate dataFim) {
        usuario.realizarEmprestimo(livro);
    }

    public static void notificaReserva() {
        for (Usuario u : usuarios) {
            for (Reserva r : u.getReservas()) {
                if (r.isValida()) {
                    u.receberNotificacao("O livro '" + r.getLivro().getTitulo() + "' está disponível para retirada.");
                }
            }
        }
    }

    public static void notificaEmprestimo(Usuario usuario, Livro livro) {
        usuario.receberNotificacao("Você realizou o empréstimo do livro '" + livro.getTitulo() + "'.");
    }
}
