package br.com.desafio.netshoes.automacaotestes.automation.massa;


import java.util.ArrayList;
import java.util.List;

import br.com.desafio.netshoes.automacaotestes.configuration.YamlFileLoader;

public class MassaDadosUtils {

	private static final String MASSA_PATH_YAML = "resource/massa_dados.yaml";

	@SuppressWarnings("unchecked")
	public static ComprasZattini getMassaDadosComprasZattini() throws Exception {

		ComprasZattini bean = new ComprasZattini();
		List<String> list = new ArrayList<String>();
		list = (List<String>) YamlFileLoader.getAttribute(MASSA_PATH_YAML, "ComprasZattini", "produtos");
		bean.setProdutos(list);
		
		return bean;
	}
	
	public static void main(String[] args) throws Exception {
		
		ComprasZattini produtos = MassaDadosUtils.getMassaDadosComprasZattini();
		
		for(String c : produtos.getProdutos()){
			System.out.println(c);
		}
		System.out.println(produtos.getProdutos().size());
	}
}
