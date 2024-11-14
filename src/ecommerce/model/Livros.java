package ecommerce.model;

public class Livros extends Produtos {

	public Livros(String nome, double preco, String descricao) {
		super(nome, preco, descricao);
	}


	@Override
	public void exibirDetalhes() {
		System.out.println("Livro: " + getNome());
		System.out.println("Preço: R$ " + getPreco());
		System.out.println("Descrição: " + getDescricao());
	}
}