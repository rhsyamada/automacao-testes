package br.com.desafio.netshoes.automacaotestes.configuration;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.desafio.netshoes.automacaotestes.configuration.bean.ConfigWeb;
import br.com.desafio.netshoes.geradorevidencia.GeradorEvidencia;
import br.com.desafio.netshoes.geradorevidencia.structures.Cabecalho;
import br.com.desafio.netshoes.geradorevidencia.structures.Evidencia;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	@Autowired
	ConfigWeb config;
	
//	@Autowired
//	GeradorEvidencia geradorEvidencia;
//	
//	@Autowired
//	Evidencia evidencia;

	@Before
	public void initialize(Scenario scenario) throws Throwable {
//		Cabecalho cabecalho = new Cabecalho();
//		cabecalho.setAmbiente("Produção");
//		cabecalho.setIdCt(scenario.getId());
//		cabecalho.setNomeCt(scenario.getName());
//		cabecalho.setNomeProjeto("Desafio Netshoes");
//		geradorEvidencia.setCover(cabecalho);
//		
//		System.out.println("HooksDrivers -> initialize");
	}

	@After
	public void finalize(Scenario scenario) throws Throwable {
//		geradorEvidencia.setContent(evidencia);
//		geradorEvidencia.save(scenario.getId());
		config.destroyer();
//		System.out.println("HooksDrivers -> finalize");
	}
}