package br.com.desafio.netshoes.automacaotestes.automation.bean;


import java.util.ArrayList;
import java.util.List;

import br.com.desafio.netshoes.automacaotestes.configuration.YamlFileLoader;

public class MassaDadosUtils {

	private static final String MASSA_PATH_YAML = "resource/massa_dados.yaml";
//
//	@SuppressWarnings("unchecked")
//	public static Compras getMassaDadosComprasZattini() throws Exception {
//
//		Compras bean = new Compras();
//		List<String> list = new ArrayList<String>();
//		list = (List<String>) YamlFileLoader.getAttribute(MASSA_PATH_YAML, "ComprasZattini", "produtos");
//		bean.setProdutos(list);
//		
//		return bean;
//	}
//	
//	public static void main(String[] args) throws Exception {
//		
//		Compras produtos = MassaDadosUtils.getMassaDadosComprasZattini();
//		
//		for(String c : produtos.getProdutos()){
//			System.out.println(c);
//		}
//		System.out.println(produtos.getProdutos().size());
//	}
}
