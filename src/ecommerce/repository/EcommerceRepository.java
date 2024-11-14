package ecommerce.repository;



public interface EcommerceRepository {
	
	 public void criarConta();
		public void listarTodas();
		public void procurarPorNumero(int numero);
		public void adicionarCarrinho();
		public void fnalizar();
		public void deletar(int numero);
}
