package br.com.desafio.netshoes.automacaotestes.automation.step.zattini;

import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.desafio.netshoes.automacaotestes.automation.functionality.zattini.FunctionalityProduto;
import br.com.desafio.netshoes.automacaotestes.configuration.annotation.Step;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

@Step
public class StepZattini {
	@Autowired
	WebDriver driver;
	
	@Autowired
	FunctionalityProduto produto;
		
	@Dado("^que acessei o site da Zattini$")
	public void queAcesseiOSiteDaZattini() throws Throwable {
		driver.get("https://www.zattini.com.br/");
	}

	@Quando("^incluir os produtos ao carrinho no site da Zattini$")
	public void incluirOsProdutosAoCarrinhoNoSiteDaZattini(DataTable arg1) throws Throwable {
		for (Map<String, String> map : arg1.asMaps(String.class, String.class)) {
			String strProd = map.get("Produto");
			produto.incluirProdutoCarrinho(strProd);
		}
	}

	@Entao("^validar os produtos incluidos no carrinho esta na tela de pagamento no site da Zattini$")
	public void validarOsProdutosIncluidosNoCarrinhoEstaNaTelaDePagamentoNoSiteDaZattini() throws Throwable {
		System.out.println("validar os produtos incluidos no carrinho esta na tela de pagamento no site da Zattini");
	}
}
