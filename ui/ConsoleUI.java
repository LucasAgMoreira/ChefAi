package ui;

import models.Ingrediente;
import models.Usuario;
import models.Receita;
import suggester.SugestorRapido;

import java.util.Scanner;
import java.util.List;

public class ConsoleUI {

    private Scanner scanner;
    private Usuario usuario;

    public ConsoleUI() {
        scanner = new Scanner(System.in);
        usuario = new Usuario();
    }

    public void iniciar() {

        System.out.println("=== ChefAI (versão simples) ===");

        boolean rodando = true;

        while (rodando) {

            System.out.println("\n1. Cadastrar ingrediente");
            System.out.println("2. Ver ingredientes cadastrados");
            System.out.println("3. Sugerir receitas");
            System.out.println("4. Sair");
            System.out.print("Escolha: ");

            int op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1 -> cadastrarIngrediente();
                case 2 -> verIngredientes();
                case 3 -> sugerirReceitas();
                case 4 -> rodando = false;
                default -> System.out.println("Opção inválida.");
            }
        }

        System.out.println("Até mais!");
    }

    private void cadastrarIngrediente() {
        System.out.print("Nome do ingrediente: ");
        String nome = scanner.nextLine();

        System.out.print("Quantidade aproximada: ");
        double qtd = scanner.nextDouble();
        scanner.nextLine();

        usuario.addIngrediente(new Ingrediente(nome, qtd));
        System.out.println("Ingrediente adicionado!");
    }

    private void verIngredientes() {
        System.out.println("\n=== Ingredientes ===");
        for (Ingrediente ing : usuario.getIngredientes()) {
            System.out.println("- " + ing);
        }
    }

    private void sugerirReceitas() {
        SugestorRapido sugestor = new SugestorRapido();
        List<Receita> lista = sugestor.sugerir(usuario.getIngredientes());

        System.out.println("\n=== Receitas Sugeridas ===");

        for (Receita r : lista) {
            System.out.println("\n>> " + r.getNome());
            System.out.println("Ingredientes: " + r.getIngredientes());
            System.out.println("Modo de preparo: " + r.getModoPreparo());
            System.out.println("Tempo: " + r.getTempo() + " min");
        }
    }
}

