package tarefa;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private ArrayList<Contato> listaDeContatos;
    private Scanner scanner;

    public Main() {
        listaDeContatos = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void adicionarContato() {
        System.out.print("Digite o nome do contato: ");
        String nome = scanner.nextLine();
        System.out.print("Digite o telefone do contato: ");
        String telefone = scanner.nextLine();
        System.out.print("Digite o email do contato: ");
        String email = scanner.nextLine();

        Contato novoContato = new Contato(nome, telefone, email);
        listaDeContatos.add(novoContato);
        System.out.println("Contato adicionado com sucesso!\n");
    }

    public void listarContatos() {
        if (listaDeContatos.isEmpty()) {
            System.out.println("Nenhum contato cadastrado.\n");
        } else {
            System.out.println("Lista de Contatos:");
            for (int i = 0; i < listaDeContatos.size(); i++) {
                System.out.println((i + 1) + ". " + listaDeContatos.get(i));
            }
            System.out.println();
        }
    }

    public void removerContato() {
        listarContatos();
        if (!listaDeContatos.isEmpty()) {
            System.out.print("Digite o número do contato que deseja remover: ");
            int indice = scanner.nextInt();
            scanner.nextLine(); 

            if (indice > 0 && indice <= listaDeContatos.size()) {
                listaDeContatos.remove(indice - 1);
                System.out.println("Contato removido com sucesso!\n");
            } else {
                System.out.println("Número inválido.\n");
            }
        }
    }

    public void exibirMenu() {
        int opcao;
        do {
            System.out.println("===== Gerenciador de Contatos =====");
            System.out.println("1. Adicionar Contato");
            System.out.println("2. Listar Contatos");
            System.out.println("3. Remover Contato");
            System.out.println("4. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    adicionarContato();
                    break;
                case 2:
                    listarContatos();
                    break;
                case 3:
                    removerContato();
                    break;
                case 4:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.\n");
            }
        } while (opcao != 4);
    }

    public static void main(String[] args) {
        Main sistema = new Main();
        sistema.exibirMenu();
    }
}

