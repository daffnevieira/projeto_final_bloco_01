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
        try {
            carrinho.add(livro);
            System.out.println("Livro adicionado ao carrinho: " + livro.getNome());
        } catch (Exception e) {
            System.out.println("Erro ao adicionar livro ao carrinho: " + e.getMessage());
        }
    }

    @Override
    public void atualizar(Livros livro) {
        try {
            for (int i = 0; i < carrinho.size(); i++) {
                if (carrinho.get(i).getNome().equals(livro.getNome())) {
                    carrinho.set(i, livro);
                    System.out.println("Livro atualizado: " + livro.getNome());
                    return;
                }
            }
            System.out.println("Livro não encontrado no carrinho para atualização.");
        } catch (Exception e) {
            System.out.println("Erro ao atualizar livro no carrinho: " + e.getMessage());
        }
    }

    @Override
    public void deletar(int id) {
        try {
            if (id >= 0 && id < carrinho.size()) {
                Livros livroRemovido = carrinho.remove(id);
                System.out.println("Livro removido do carrinho: " + livroRemovido.getNome());
            } else {
                System.out.println("ID inválido. Livro não encontrado no carrinho.");
            }
        } catch (Exception e) {
            System.out.println("Erro ao remover livro do carrinho: " + e.getMessage());
        }
    }

    @Override
    public Livros buscarPorId(int id) {
        try {
            if (id >= 0 && id < carrinho.size()) {
                return carrinho.get(id);
            } else {
                System.out.println("ID inválido. Livro não encontrado.");
                return null;
            }
        } catch (Exception e) {
            System.out.println("Erro ao buscar livro no carrinho: " + e.getMessage());
            return null;
        }
    }

    public List<Livros> listarTodos() {
        return new ArrayList<>(carrinho);
    }

	@Override
	public List<Livros> buscarTodos() {
		return new ArrayList<>(carrinho);
	}
}
