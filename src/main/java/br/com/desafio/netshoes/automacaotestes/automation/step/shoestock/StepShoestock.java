package br.com.desafio.netshoes.automacaotestes.automation.step.shoestock;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.desafio.netshoes.automacaotestes.automation.functionality.shoestock.FunctionalityCarrinhoShoestock;
import br.com.desafio.netshoes.automacaotestes.automation.functionality.shoestock.FunctionalityHomeShoestock;
import br.com.desafio.netshoes.automacaotestes.automation.functionality.shoestock.FunctionalityProdutoShoestock;
import br.com.desafio.netshoes.automacaotestes.configuration.annotation.Step;
import br.com.desafio.netshoes.core.yaml.YamlFileLoader;
import cucumber.api.DataTable;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

@Step
public class StepShoestock {
	@Autowired
	FunctionalityHomeShoestock home;
	
	@Autowired
	FunctionalityProdutoShoestock produto;
		
	@Autowired
	FunctionalityCarrinhoShoestock carrinho;
	
	@Dado("^que acessei o site da Shoestock$")
	public void queAcesseiOSiteDaZattini() throws Throwable {
		home.acessarSiteShoestock();
	}

	@SuppressWarnings("unchecked")
	@Quando("^incluir os produtos ao carrinho no site da Shoestock$")
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

	@Entao("^validar os produtos incluidos no carrinho esta na tela de pagamento no site da Shoestock$")
	public void validarOsProdutosIncluidosNoCarrinhoEstaNaTelaDePagamentoNoSiteDaZattini() throws Throwable {
		carrinho.validarProdutoCarrinho();
	}
}
