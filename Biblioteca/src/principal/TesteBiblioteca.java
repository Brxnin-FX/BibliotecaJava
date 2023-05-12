package principal;

import java.util.Scanner;

import entidades.Biblioteca;
import entidades.Livro;
import entidades.Usuario;

public class TesteBiblioteca {

	public static void main(String[] args) {
		
		Biblioteca biblioteca = new Biblioteca();
        Scanner scanner = new Scanner(System.in);

        int opcao = -1;
        while (opcao != 0) {
            System.out.println("\nBiblioteca - Menu");
            System.out.println("1 - Adicionar livro");
            System.out.println("2 - Adicionar usuário");
            System.out.println("3 - Buscar livro");
            System.out.println("4 - Buscar usuário");
            System.out.println("5 - Listar livros");
            System.out.println("6 - Listar usuários");
            System.out.println("0 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // limpa o buffer do teclado

            switch (opcao) {
                case 1:
                    // adicionar livro
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("Ano de publicação: ");
                    int ano = scanner.nextInt();
                    scanner.nextLine(); // limpa o buffer do teclado
                    System.out.print("Editora: ");
                    String editora = scanner.nextLine();
                    System.out.print("Quantidade: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine(); // limpa o buffer do teclado
                    biblioteca.adicionarLivro(new Livro(titulo, autor, ano, editora, quantidade));
                    break;

                case 2:
                    // adicionar usuário
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();
                    scanner.nextLine(); // limpa o buffer do teclado
                    biblioteca.adicionarUsuario(new Usuario(nome, idade));
                    break;

                case 3:
                    // buscar livro
                    System.out.print("Título ou autor: ");
                    String termo = scanner.nextLine();
                    biblioteca.buscarLivro(termo);
                    break;

                case 4:
                    // buscar usuário
                    System.out.print("Nome: ");
                    String nomeUsuario = scanner.nextLine();
                    biblioteca.buscarUsuario(nomeUsuario);
                    break;

                case 5:
                    // listar livros
                    biblioteca.listarLivros();
                    break;

                case 6:
                    // listar usuários
                    biblioteca.listarUsuarios();
                    break;

                case 0:
                    // sair
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        }

        scanner.close();
	}

}
