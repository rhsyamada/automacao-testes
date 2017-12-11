package br.com.desafio.netshoes.automacaotestes.automation.functionality.shoestock;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.desafio.netshoes.automacaotestes.automation.pageobjects.shoestock.PageCarrinhoShoestock;
import br.com.desafio.netshoes.automacaotestes.configuration.annotation.Functionality;
import br.com.desafio.netshoes.automacaotestes.configuration.bean.RepositoryTest;

@Functionality
public class FunctionalityCarrinhoShoestock {
	@Autowired
	RepositoryTest repo;

	@Autowired
	PageCarrinhoShoestock carrinho;

	public void validarProdutoCarrinho() throws Exception {
		carrinho.clickButtonCarrinho();
		String nomeProduto = repo.getCollection("Produto", String.class);

		if (!carrinho.getTextCor().equals("Cor: " + repo.getCollection(nomeProduto + ".TextCor", String.class)))
			throw new Exception("A cor do produto: " + nomeProduto + " é difirente de "
					+ repo.getCollection(nomeProduto + ".TextCor", String.class));

		if (!carrinho.getTextRef().equals("Ref: " + repo.getCollection(nomeProduto + ".TextRef", String.class)))
			throw new Exception("A Referencia do produto: " + nomeProduto + " é difirente de "
					+ repo.getCollection(nomeProduto + ".TextRef", String.class));

		if (!carrinho.getTextTamanho()
				.equals("Tamanho: " + repo.getCollection(nomeProduto + ".TextTamanho", String.class)))
			throw new Exception("O Tamanho do produto: " + nomeProduto + " é difirente de "
					+ repo.getCollection(nomeProduto + ".TextTamanho", String.class));

		if (!repo.getCollection(nomeProduto + ".TextNome", String.class).contains(carrinho.getTextNome()))
			throw new Exception("O nome do produto: " + nomeProduto + " é difirente de "
					+ repo.getCollection(nomeProduto + ".TextNome", String.class));

		if (!carrinho.getTextPreco().equals("R$ " + repo.getCollection(nomeProduto + ".TextPreco", String.class)))
			throw new Exception("O Preço do produto: " + nomeProduto + " é difirente de "
					+ repo.getCollection(nomeProduto + ".TextPreco", String.class));
	}
}
