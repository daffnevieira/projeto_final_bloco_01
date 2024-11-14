package ecommerce.repository;

import java.util.List;
import ecommerce.model.Livros;

public interface LivrosRepository {

	void salvar(Livros livro);

	void atualizar(Livros livro);

	void deletar(int id);

	Livros buscarPorId(int id);

	List<Livros> buscarTodos();

}