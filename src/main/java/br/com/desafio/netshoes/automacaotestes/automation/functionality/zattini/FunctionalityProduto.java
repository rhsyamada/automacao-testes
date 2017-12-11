package br.com.desafio.netshoes.automacaotestes.automation.functionality.zattini;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.desafio.netshoes.automacaotestes.automation.pageobjects.zattini.PageProduto;
import br.com.desafio.netshoes.automacaotestes.automation.pageobjects.zattini.PageSelecaoProdutos;
import br.com.desafio.netshoes.automacaotestes.configuration.annotation.Functionality;
import br.com.desafio.netshoes.automacaotestes.configuration.bean.RepositoryTest;

@Functionality
public class FunctionalityProduto {
	@Autowired
	PageSelecaoProdutos selecaoProdutos;
	
	@Autowired
	PageProduto produto;
	
	@Autowired
	RepositoryTest repo;
	
	public void incluirProdutoCarrinho(String nomeProduto) {
		selecaoProdutos.setInputBusca(nomeProduto);
		selecaoProdutos.clickButtonPesquisar();
		selecaoProdutos.clickProduto(0);
		repo.setCollection(nomeProduto + ".TextDescricao", produto.getTextDescricao());
		repo.setCollection(nomeProduto + ".TextNome", produto.getTextNome());
		repo.setCollection(nomeProduto + ".TextPreco", produto.getTextPreco());
		repo.setCollection(nomeProduto + ".TextReferencia", produto.getTextReferencia());
		produto.clickButtonCor();
		produto.clickButtonTamanho();
		produto.clickButtonComprar();
	}
}
