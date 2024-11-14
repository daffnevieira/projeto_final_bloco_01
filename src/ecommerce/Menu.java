package ecommerce;

import java.util.Scanner;

import ecommerce.util.Cores;

public class Menu {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int opcao;
		
		while (true) {
			System.out.println(Cores.TEXT_WHITE_BOLD + Cores.ANSI_RED_BACKGROUND);
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            ECOMMERCE BIBLIOTECA VIRTUAL             ");
			System.out.println("   Um livro é um sonho que você segura com as mãos.  ");
			System.out.println("                   - Neil Gaiman                     ");
			System.out.println("*****************************************************");
			System.out.println("                                                     ");
			System.out.println("            1 - Criar Conta                          ");
			System.out.println("            2 - Listar Livros Disponíveis            ");
			System.out.println("            3 - Buscar Livro por ID                  ");
			System.out.println("            4 - Adicionar Livro ao Carrinho          ");
			System.out.println("            5 - Ver Carrinho                         ");
			System.out.println("            6 - Finalizar Compra                     ");
			System.out.println("            7 - Listar Pedidos                       ");
			System.out.println("            8 - Atualizar Informações da Conta       ");
			System.out.println("            9 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");


			opcao = sc.nextInt();

			if (opcao == 9) {
				System.out.println("\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				sobre();
                sc.close();
				System.exit(0);
			}
			switch (opcao) {
		    case 1:
		        System.out.println("Criar Conta\n\n");
		        // Código para criar conta de usuário
		        break;
		    case 2:
		        System.out.println("Listar Livros Disponíveis\n\n");
		        // Código para listar todos os livros disponíveis para compra
		        break;
		    case 3:
		        System.out.println("Consultar Livro por ID\n\n");
		        // Código para consultar os detalhes de um livro específico pelo ID
		        break;
		    case 4:
		        System.out.println("Adicionar Livro ao Carrinho\n\n");
		        // Código para adicionar um livro ao carrinho de compras
		        break;
		    case 5:
		        System.out.println("Ver Carrinho\n\n");
		        // Código para exibir os livros no carrinho de compras do usuário
		        break;
		    case 6:
		        System.out.println("Finalizar Compra\n\n");
		        // Código para finalizar a compra e processar o pedido
		        break;
		    case 7:
		        System.out.println("Listar Pedidos\n\n");
		        // Código para listar todos os pedidos do usuário
		        break;
		    case 8:
		        System.out.println("Atualizar Informações da Conta\n\n");
		        // Código para atualizar as informações da conta do usuário
		        break;
		    case 9:
		        System.out.println("Saindo do Sistema\n\n");
		        // Código para encerrar o sistema
		        break;
		    default:
		        System.out.println("\nOpção Inválida!\n");
		        break;
		}

		}

	}
	public static void sobre() {
		System.out.println("\n*********************************************************");
		System.out.println("Projeto Desenvolvido por: ");
		System.out.println("Daffne Vieira Rodrigues");
		System.out.println("github.com/conteudoGeneration");
		System.out.println("*********************************************************");
	}

}
