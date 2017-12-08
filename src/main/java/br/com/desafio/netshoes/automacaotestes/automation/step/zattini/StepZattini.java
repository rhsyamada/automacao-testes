package br.com.desafio.netshoes.automacaotestes.automation.step.zattini;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.desafio.netshoes.automacaotestes.configuration.annotation.InitializeConfig;
import br.com.desafio.netshoes.automacaotestes.configuration.bean.ConfigWeb;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

@InitializeConfig
public class StepZattini {
	@Autowired
	ConfigWeb config;

	@Dado("^que acessei o site da Zattini$")
	public void queAcesseiOSiteDaZattini() throws Throwable {
		config.getWebdriver().get("https://www.zattini.com.br/");
	}

	@Quando("^incluir os produtos ao carrinho no site da Zattini$")
	public void incluirOsProdutosAoCarrinhoNoSiteDaZattini(DataTable arg1) throws Throwable {
		System.out.println("incluir os produtos ao carrinho no site da Zattini");
	}

	@Entao("^validar os produtos incluidos no carrinho esta na tela de pagamento no site da Zattini$")
	public void validarOsProdutosIncluidosNoCarrinhoEstaNaTelaDePagamentoNoSiteDaZattini() throws Throwable {
		System.out.println("validar os produtos incluidos no carrinho esta na tela de pagamento no site da Zattini");
	}

}
