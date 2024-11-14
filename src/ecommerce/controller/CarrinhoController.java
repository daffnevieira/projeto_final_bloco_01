package ecommerce.controller;

import java.util.ArrayList;
import java.util.List;

import ecommerce.model.Livros;
import ecommerce.repository.LivrosRepository;

public class CarrinhoController implements LivrosRepository {

    private List<Livros> carrinho;

    public CarrinhoController() {
        this.carrinho = new ArrayList<>();
    }

    @Override
    public void salvar(Livros livro) {
        carrinho.add(livro);
        System.out.println("Livro adicionado ao carrinho: " + livro.getNome());
    }

    @Override
    public void atualizar(Livros livro) {
        for (int i = 0; i < carrinho.size(); i++) {
            if (carrinho.get(i).getNome().equals(livro.getNome())) {
                carrinho.set(i, livro);
                System.out.println("Livro atualizado: " + livro.getNome());
                return;
            }
        }
        System.out.println("Livro não encontrado no carrinho para atualização.");
    }

    @Override
    public void deletar(int id) {
        if (id >= 0 && id < carrinho.size()) {
            Livros livroRemovido = carrinho.remove(id);
            System.out.println("Livro removido do carrinho: " + livroRemovido.getNome());
        } else {
            System.out.println("ID inválido. Livro não encontrado no carrinho.");
        }
    }

    @Override
    public Livros buscarPorId(int id) {
        if (id >= 0 && id < carrinho.size()) {
            return carrinho.get(id);
        }
        System.out.println("Livro não encontrado com o ID fornecido.");
        return null;
    }

    @Override
    public List<Livros> buscarTodos() {
        return carrinho;
    }

    // Métodos adicionais
    public void listarCarrinho() {
        if (carrinho.isEmpty()) {
            System.out.println("Carrinho vazio!");
        } else {
            System.out.println("Livros no Carrinho:");
            for (Livros livro : carrinho) {
                livro.exibirDetalhes();
            }
        }
    }

    public void limparCarrinho() {
        carrinho.clear();
        System.out.println("Carrinho limpo.");
    }
}
