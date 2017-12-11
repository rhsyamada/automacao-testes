package br.com.desafio.netshoes.automacaotestes.automation.functionality.zattini;

import org.junit.Assert;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.desafio.netshoes.automacaotestes.automation.pageobjects.zattini.PageCarrinho;
import br.com.desafio.netshoes.automacaotestes.configuration.annotation.Functionality;
import br.com.desafio.netshoes.automacaotestes.configuration.bean.RepositoryTest;

@Functionality
public class FunctionalityCarrinho {
	@Autowired
	RepositoryTest repo;

	@Autowired
	PageCarrinho carrinho;

	public void validarProdutoCarrinho() {
//		carrinho.clickButtonCarrinho();
		String nomeProduto =  repo.getCollection("Produto", String.class);
		Assert.assertEquals(carrinho.getTextCor(), "Cor: " + repo.getCollection(nomeProduto + ".TextCor", String.class));
	}
}
