package br.com.desafio.netshoes.automacaotestes.automation.functionality.zattini;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.desafio.netshoes.automacaotestes.configuration.annotation.Functionality;
import br.com.desafio.netshoes.geradorevidencia.structures.Evidencia;

@Functionality
public class FunctionalityHomeZattini {
	@Autowired
	private WebDriver driver;
	
	@Autowired
	private Evidencia evidencia;
	
	public void acessarSiteZattini() {
		driver.get("https://www.zattini.com.br/");
		evidencia.addTexto("Acessando o site - \"https://www.zattini.com.br/\"");
	}
}
