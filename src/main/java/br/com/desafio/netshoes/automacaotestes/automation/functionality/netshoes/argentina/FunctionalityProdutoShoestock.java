package br.com.desafio.netshoes.automacaotestes.automation.functionality.netshoes.argentina;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.desafio.netshoes.automacaotestes.automation.pageobjects.shoestock.PageProdutoShoestock;
import br.com.desafio.netshoes.automacaotestes.automation.pageobjects.shoestock.PageSelecaoProdutosShoestock;
import br.com.desafio.netshoes.automacaotestes.configuration.annotation.Functionality;
import br.com.desafio.netshoes.automacaotestes.configuration.bean.RepositoryTest;

@Functionality
public class FunctionalityProdutoShoestock {
	@Autowired
	PageSelecaoProdutosShoestock selecaoProdutos;
	
	@Autowired
	PageProdutoShoestock produto;
	
	@Autowired
	RepositoryTest repo;
	
	public void incluirProdutoCarrinho(String nomeProduto) throws Exception {
		selecaoProdutos.setInputBusca(nomeProduto);
		selecaoProdutos.clickButtonPesquisar();
		selecaoProdutos.clickProduto(1);
		produto.clickButtonCor();
		produto.clickButtonTamanho();
		
		repo.setCollection(nomeProduto + ".TextTamanho", produto.getTextTamanho());
		repo.setCollection(nomeProduto + ".TextCor", produto.getTextCor());
		repo.setCollection("Produto", nomeProduto);
		repo.setCollection(nomeProduto + ".TextNome", produto.getTextNome());
		repo.setCollection(nomeProduto + ".TextRef", produto.getTextReferencia());
		repo.setCollection(nomeProduto + ".TextPreco", produto.getTextPreco());
		repo.setCollection(nomeProduto + ".TextReferencia", produto.getTextReferencia());
		
		produto.clickButtonComprar();
	}
}
