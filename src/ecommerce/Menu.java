package ecommerce;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import ecommerce.model.Livros;
import ecommerce.util.Cores;

public class Menu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        // Criando alguns livros para adicionar à biblioteca
        Livros livro1 = new Livros("O Senhor dos Anéis", 25.50, "Fantasia");
        Livros livro2 = new Livros("1984", 51.5, "Romance");
        Livros livro3 = new Livros("A Revolução dos Bichos", 42.55, "Fábula");
        Livros livro4 = new Livros("Coraline", 30.50, "Horror Gótico");

        ArrayList<Livros> biblioteca = new ArrayList<>();
        ArrayList<Livros> carrinho = new ArrayList<>();

        biblioteca.add(livro1);
        biblioteca.add(livro2);
        biblioteca.add(livro3);
        biblioteca.add(livro4);

        while (true) {
            try {
                System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_RED_BACKGROUND);
                System.out.println("*****************************************************");
                System.out.println("                                                     ");
                System.out.println("            ECOMMERCE BIBLIOTECA VIRTUAL             ");
                System.out.println("   Um livro é um sonho que você segura com as mãos.  ");
                System.out.println("                   - Neil Gaiman                     ");
                System.out.println("*****************************************************");
                System.out.println("                                                     ");
                System.out.println("            1 - Listar Livros Disponíveis            ");
                System.out.println("            2 - Buscar Livro por ID                  ");
                System.out.println("            3 - Adicionar Livro ao Carrinho          ");
                System.out.println("            4 - Ver Carrinho                         ");
                System.out.println("            5 - Apagar do Carrinho                   ");
                System.out.println("            6 - Finalizar Compra                     ");
                System.out.println("            7 - Adicionar Novo Livro à Biblioteca    ");
                System.out.println("            8 - Sair                                 ");
                System.out.println("*****************************************************");
                System.out.print("Entre com a opção desejada:                          ");

                opcao = sc.nextInt();
                sc.nextLine(); 

                if (opcao == 8) {
                    System.out.println("\nLer para ser!");
                    sobre();
                    sc.close();
                    System.exit(0);
                }

                switch (opcao) {
                    case 1:
                        System.out.println("Listar Livros Disponíveis\n");
                        if (biblioteca.isEmpty()) {
                            System.out.println("Nenhum livro disponível.");
                        } else {
                            for (Livros livro : biblioteca) {
                                livro.exibirDetalhes();
                                System.out.println("----------------------------");
                            }
                        }
                        break;
                    case 2:
                        try {
                            System.out.println("Buscar Livro por ID\n");
                            System.out.print("Digite o ID do livro: ");
                            int id = sc.nextInt();
                            if (id >= 0 && id < biblioteca.size()) {
                                biblioteca.get(id).exibirDetalhes();
                            } else {
                                System.out.println("ID inválido!");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Entrada inválida! Por favor, insira um número.");
                            sc.nextLine(); 
                        }
                        break;
                    case 3:
                        try {
                            System.out.println("Adicionar ao Carrinho\n");
                            System.out.print("Digite o ID do livro que deseja adicionar ao carrinho: ");
                            int livroId = sc.nextInt();
                            if (livroId >= 0 && livroId < biblioteca.size()) {
                                carrinho.add(biblioteca.get(livroId));
                                System.out.println("Livro adicionado ao carrinho!");
                            } else {
                                System.out.println("ID inválido!");
                            }
                        } catch (InputMismatchException e) {
                            System.out.println("Entrada inválida! Por favor, insira um número.");
                            sc.nextLine();
                        }
                        break;
                    case 4:
                        System.out.println("Ver Carrinho\n");
                        if (carrinho.isEmpty()) {
                            System.out.println("Carrinho vazio!");
                        } else {
                            for (Livros livro : carrinho) {
                                livro.exibirDetalhes();
                                System.out.println("----------------------------");
                            }
                        }
                        break;
                    case 5:
                        System.out.println("Apagar do Carrinho\n");
                        if (carrinho.isEmpty()) {
                            System.out.println("Carrinho vazio!");
                        } else {
                            try {
                                System.out.println("Livros no Carrinho:");
                                for (int i = 0; i < carrinho.size(); i++) {
                                    System.out.println(i + " - " + carrinho.get(i).getNome());
                                }
                                System.out.print("Digite o índice do livro que deseja remover: ");
                                int indexRemover = sc.nextInt();
                                if (indexRemover >= 0 && indexRemover < carrinho.size()) {
                                    carrinho.remove(indexRemover);
                                    System.out.println("Livro removido do carrinho.");
                                } else {
                                    System.out.println("Índice inválido!");
                                }
                            } catch (InputMismatchException e) {
                                System.out.println("Entrada inválida! Por favor, insira um número.");
                                sc.nextLine(); 
                            }
                        }
                        break;
                    case 6:
                        System.out.println("Finalizar Compra\n");
                        if (carrinho.isEmpty()) {
                            System.out.println("Carrinho vazio! Não é possível finalizar a compra.");
                        } else {
                            double total = 0;
                            for (Livros livro : carrinho) {
                                total += livro.getPreco();
                            }
                            System.out.println("Total da compra: R$ " + total);
                            System.out.println("Compra finalizada com sucesso!");
                            carrinho.clear();
                        }
                        break;
                    case 7:
                        System.out.println("Adicionar Novo Livro à Biblioteca\n");
                        try {
                            System.out.print("Digite o nome do livro: ");
                            String nome = sc.nextLine();

                            System.out.print("Digite o preço do livro: ");
                            double preco = sc.nextDouble();
                            sc.nextLine();

                            System.out.print("Digite a descrição do livro: ");
                            String descricao = sc.nextLine();

                            Livros novoLivro = new Livros(nome, preco, descricao);
                            biblioteca.add(novoLivro);

                            System.out.println("Novo livro adicionado à biblioteca.");
                        } catch (InputMismatchException e) {
                            System.out.println("Entrada inválida! Por favor, verifique as entradas.");
                            sc.nextLine(); 
                        }
                        break;
                    default:
                        System.out.println("\nOpção Inválida!\n");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida! Por favor, escolha um número.");
                sc.nextLine(); 
            }
        }
    }

    public static void sobre() {
        System.out.println("\n*********************************************************");
        System.out.println("Projeto Desenvolvido por:");
        System.out.println("Daffne Vieira Rodrigues");
        System.out.println("https://github.com/daffnevieira/projeto_final_bloco_01/");
        System.out.println("*********************************************************");
    }
}
