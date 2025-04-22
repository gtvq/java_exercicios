package clinica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static List<Cliente> clientes = new ArrayList<>();
    static List<Consulta> consultas = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        cadastrarClientes();
        cadastrarAnimais();
        listarClientes();

        Veterinario vet = new Veterinario(1, "Dra. Ana");
        Cliente cliente = clientes.get(0);
        consultar(vet, cliente.getAnimal());

        verHistorico(cliente.getAnimal());
    }

    public static void cadastrarClientes() {
        System.out.println("=== Cadastro de Cliente ===");
        System.out.print("Nome: ");
        String nome = sc.nextLine();
        System.out.print("ID: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Telefone: ");
        String numero = sc.nextLine();

        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setEmail(email);
        cliente.setId(id);
        cliente.setNumero(numero);
        clientes.add(cliente);

        System.out.println("Cliente cadastrado com sucesso!\n");
    }

    public static void cadastrarAnimais() {
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado.\n");
            return;
        }

        System.out.println("=== Cadastro de Animal ===");
        Cliente cliente = clientes.get(0);

        System.out.print("Nome do Animal: ");
        String nome = sc.nextLine();
        System.out.print("Espécie: ");
        String especie = sc.nextLine();
        System.out.print("Raça: ");
        String raca = sc.nextLine();
        System.out.print("Idade: ");
        int idade = Integer.parseInt(sc.nextLine());
        System.out.print("ID do Animal: ");
        int id = Integer.parseInt(sc.nextLine());

        Animal animal = new Animal(nome, especie, raca, idade, id);
        cliente.setAnimal(animal);

        System.out.println("Animal cadastrado com sucesso e associado ao cliente " + cliente.getNome() + "!\n");
    }

    public static void listarClientes() {
        System.out.println("=== Lista de Clientes ===");
        for (Cliente c : clientes) {
            System.out.println("Nome: " + c.getNome() + ", ID: " + c.getId() + ", Email: " + c.getEmail());
            if (c.getAnimal() != null) {
                Animal a = c.getAnimal();
                System.out.println("  Animal: " + a.getNome() + " (" + a.getEspecie() + " - " + a.getRaca() + ")");
            }
        }
        System.out.println();
    }

    public static void consultar(Veterinario v, Animal a) {
        System.out.println("=== Registrar Consulta ===");
        System.out.print("Data (ex: 2025-04-22): ");
        String data = sc.nextLine();
        System.out.print("Observações: ");
        String observacao = sc.nextLine();
        System.out.print("Tratamento: ");
        String tratamento = sc.nextLine();
        System.out.print("Recomendação: ");
        String recomendacao = sc.nextLine();

        Consulta consulta = new Consulta(data, observacao, tratamento, recomendacao, v, a);
        consultas.add(consulta);

        System.out.println("Consulta registrada com sucesso!\n");
    }

    public static void verHistorico(Animal a) {
        System.out.println("=== Histórico de Consultas do Animal " + a.getNome() + " ===");
        for (Consulta c : consultas) {
            if (c.getAnimal().getId() == a.getId()) {
                System.out.println("Data: " + c.getData());
                System.out.println("Veterinário: " + c.getVeterinario().getNome());
                System.out.println("Observações: " + c.getObservacao());
                System.out.println("Tratamento: " + c.getTratamento());
                System.out.println("Recomendação: " + c.getRecomendacao());
                System.out.println("-----------------------------");
            }
        }
    }
}
