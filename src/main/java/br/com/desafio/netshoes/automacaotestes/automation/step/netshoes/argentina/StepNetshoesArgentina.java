package br.com.desafio.netshoes.automacaotestes.automation.step.netshoes.argentina;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.desafio.netshoes.automacaotestes.automation.functionality.shoestock.FunctionalityCarrinhoNetshoesArgentina;
import br.com.desafio.netshoes.automacaotestes.automation.functionality.shoestock.FunctionalityHomeNetshoesArgentina;
import br.com.desafio.netshoes.automacaotestes.automation.functionality.shoestock.FunctionalityProdutoNetshoesArgentina;
import br.com.desafio.netshoes.automacaotestes.configuration.annotation.Step;
import br.com.desafio.netshoes.core.yaml.YamlFileLoader;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

@Step
public class StepNetshoesArgentina {
	@Autowired
	FunctionalityHomeNetshoesArgentina home;
	
	@Autowired
	FunctionalityProdutoNetshoesArgentina produto;
		
	@Autowired
	FunctionalityCarrinhoNetshoesArgentina carrinho;
	
	@Dado("^que acessei o site da Netshoes Argentina$")
	public void queAcesseiOSiteDaZattini() throws Throwable {
		home.acessarSiteNetshoesArgentina();
	}

	@SuppressWarnings("unchecked")
	@Quando("^incluir os produtos ao carrinho no site da Netshoes Argentina$")
	public void incluirOsProdutosAoCarrinhoNoSiteDaZattini(DataTable arg1) throws Throwable {
		for (Map<String, String> map : arg1.asMaps(String.class, String.class)) {
			String chave = map.get("Chave");
			String diretorioMassa = map.get("DiretorioMassa");
			List<String> list = (List<String>) YamlFileLoader.getAttribute(diretorioMassa, chave.split("_"));
			
			for (String str : list) {
				produto.incluirProdutoCarrinho(str);
			}
		}
	}

	@Entao("^validar os produtos incluidos no carrinho esta na tela de pagamento no site da Netshoes Argentina$")
	public void validarOsProdutosIncluidosNoCarrinhoEstaNaTelaDePagamentoNoSiteDaZattini() throws Throwable {
		carrinho.validarProdutoCarrinho();
	}
}
