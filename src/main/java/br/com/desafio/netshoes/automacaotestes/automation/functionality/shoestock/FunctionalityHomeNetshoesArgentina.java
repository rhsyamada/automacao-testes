package br.com.desafio.netshoes.automacaotestes.automation.functionality.shoestock;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.desafio.netshoes.automacaotestes.configuration.annotation.Functionality;
import br.com.desafio.netshoes.geradorevidencia.structures.Evidencia;

@Functionality
public class FunctionalityHomeNetshoesArgentina {
	@Autowired
	WebDriver driver;
	
	@Autowired
	Evidencia evidencia;

	public void acessarSiteNetshoesArgentina() {
		driver.get("https://www.netshoes.com.ar/");
		evidencia.addTexto("Acessando o site");
	}
}
