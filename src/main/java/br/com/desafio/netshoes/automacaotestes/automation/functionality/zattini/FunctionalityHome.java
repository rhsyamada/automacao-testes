package br.com.desafio.netshoes.automacaotestes.automation.functionality.zattini;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.desafio.netshoes.automacaotestes.configuration.annotation.Functionality;

@Functionality
public class FunctionalityHome {
	@Autowired
	WebDriver driver;
	
	public void acessarSiteZattini() {
		driver.get("https://www.zattini.com.br/");
	}
}
