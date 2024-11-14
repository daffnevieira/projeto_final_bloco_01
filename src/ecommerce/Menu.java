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
			System.out.println("            1 - Listar Livros Disponíveis            ");
			System.out.println("            2 - Buscar Livro por ID                  ");
			System.out.println("            3 - Adicionar Livro ao Carrinho          ");
			System.out.println("            4 - Ver Carrinho                         ");
			System.out.println("            5 - Apagar do carrinho                     ");
			System.out.println("            6 - Finalizar Compra                     ");
			System.out.println("            7 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("*****************************************************");
			System.out.println("Entre com a opção desejada:                          ");
			System.out.println("                                                     ");

			opcao = sc.nextInt();

			if (opcao == 7) {
				System.out.println("\nBanco do Brazil com Z - O seu Futuro começa aqui!");
				sobre();
				sc.close();
				System.exit(0);
			}
			switch (opcao) {

				case 1:
					System.out.println("Listar Livros Disponíveis\n\n");
	
					break;
				case 2:
					System.out.println("Buscar Livro por ID\n\n");
	
					break;
				case 3:
					System.out.println("Adicionar ao Carrinho\n\n");
	
					break;
				case 4:
					System.out.println("Ver Carrinho\n\n");
	
					break;
				case 5:
					System.out.println("Apagar do Carrinho\n\n");
	
					break;
				case 6:
					System.out.println("Finalizar Compra\n\n");
	
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
