package ecommerce.model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {

	 private List<Livros> itens = new ArrayList<>();

	    public void adicionarLivro(Livros livro) {
	        itens.add(livro);
	    }

	    public void removerLivro(Livros livro) {
	        itens.remove(livro);
	    }

	    public double calcularTotal() {
	        return itens.stream().mapToDouble(Livros::getPreco).sum();
	    }

	    public List<Livros> getItens() {
	        return itens;
	    }
}
