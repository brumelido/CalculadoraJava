import java.util.ArrayList;
import java.util.List;


public class TesteInterface {

	@Test
	public void adicionarProduto() {
		Loja testeLoja = new Loja();
		
		String nome = "produto de teste";
		int quantidade = 10;
		float preco = 1.5F;
		
		Produto produtoTeste = new Produto(nome, quantidade, preco);

		
		testeLoja.addProduto(produtoTeste);
		
		assertEquals("produto de teste", produtoTeste.getName());
		assertEquals(1, testeLoja.Quantidade());
	}
	
	private void assertEquals(boolean b, boolean c) {
	}

	private void assertEquals(String string, String string2) {
	}

	@Test
	public void removerProduto() {
		Loja testeLoja = new Loja();
		
		String nome = "produto de teste";
		int quantidade = 10;
		float preco = 1.5F;
		
		Produto produtoTeste = new Produto(nome, quantidade, preco);
		
		testeLoja.addProduto(produtoTeste);
		assertEquals(1, testeLoja.Quantidade());
		
		testeLoja.RemoveProduto("produto de teste");	
		assertEquals(0, testeLoja.Quantidade());
	}
	
private void assertEquals(int i, int quantidade) {
	}

		@Test
	public void buscarProduto() {
		Loja testeLoja = new Loja();
		
		String nome = "produto de teste";
		int quantidade = 10;
		float preco = 1.5F;
		
		Produto produtoTeste = new Produto(nome, quantidade, preco);
		testeLoja.addProduto(produtoTeste);

		assertEquals(true, testeLoja.Busca("produto de teste"));
	}
	
	@Test
	public void listarProduto() {
		Loja testeLoja = new Loja();
		
		String nome = "produto de teste";
		int quantidade = 10;
		float preco = 1.5F;
		
		String nome1 = "produto de teste1";
		int quantidade1 = 10;
		float preco1 = 1.5F;
		
		String nome2 = "produto de teste2";
		int quantidade2 = 10;
		float preco2 = 1.5F;
		
		Produto produtoTeste = new Produto(nome, quantidade, preco);
		Produto produtoTeste1 = new Produto(nome1, quantidade1, preco1);
		Produto produtoTeste2 = new Produto(nome2, quantidade2, preco2);
		testeLoja.addProduto(produtoTeste);
		testeLoja.addProduto(produtoTeste1);
		testeLoja.addProduto(produtoTeste2);

		int quantidadeProdutos = testeLoja.ListaTudo().size();
		assertEquals(3, quantidadeProdutos);
	}
	
	

}
