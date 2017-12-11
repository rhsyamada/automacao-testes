package br.com.desafio.netshoes.automacaotestes.automation.functionality.shoestock;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.desafio.netshoes.automacaotestes.automation.pageobjects.netshoes.argentina.PageProdutoNetshoesArgentina;
import br.com.desafio.netshoes.automacaotestes.automation.pageobjects.netshoes.argentina.PageSelecaoProdutosNetshoesArgentina;
import br.com.desafio.netshoes.automacaotestes.configuration.annotation.Functionality;
import br.com.desafio.netshoes.automacaotestes.configuration.bean.RepositoryTest;

@Functionality
public class FunctionalityProdutoNetshoesArgentina {
	@Autowired
	PageSelecaoProdutosNetshoesArgentina selecaoProdutos;
	
	@Autowired
	PageProdutoNetshoesArgentina produto;
	
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
