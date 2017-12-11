package br.com.desafio.netshoes.automacaotestes.automation.functionality.zattini;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.desafio.netshoes.automacaotestes.automation.pageobjects.zattini.PageProdutoZattini;
import br.com.desafio.netshoes.automacaotestes.automation.pageobjects.zattini.PageSelecaoProdutosZattini;
import br.com.desafio.netshoes.automacaotestes.configuration.annotation.Functionality;
import br.com.desafio.netshoes.automacaotestes.configuration.bean.RepositoryTest;

@Functionality
public class FunctionalityProdutoZattini {
	@Autowired
	PageSelecaoProdutosZattini selecaoProdutos;
	
	@Autowired
	PageProdutoZattini produto;
	
	@Autowired
	RepositoryTest repo;
	
	public void incluirProdutoCarrinho(String nomeProduto) {
		selecaoProdutos.setInputBusca(nomeProduto);
		selecaoProdutos.clickButtonPesquisar();
		selecaoProdutos.clickProduto(0);
		repo.setCollection("Produto", nomeProduto);
		repo.setCollection(nomeProduto + ".TextNome", produto.getTextNome());
		repo.setCollection(nomeProduto + ".TextRef", produto.getTextReferencia());
		repo.setCollection(nomeProduto + ".TextPreco", produto.getTextPreco());
		repo.setCollection(nomeProduto + ".TextReferencia", produto.getTextReferencia());
		produto.clickButtonCor();
		repo.setCollection(nomeProduto + ".TextCor", produto.getTextCor());
		produto.clickButtonTamanho();
		repo.setCollection(nomeProduto + ".TextTamanho", produto.getTextTamanho());
		produto.clickButtonComprar();
	}
}
