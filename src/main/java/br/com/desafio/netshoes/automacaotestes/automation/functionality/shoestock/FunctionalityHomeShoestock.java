package br.com.desafio.netshoes.automacaotestes.automation.functionality.shoestock;

import org.openqa.selenium.WebDriver;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.desafio.netshoes.automacaotestes.configuration.annotation.Functionality;

@Functionality
public class FunctionalityHomeShoestock {
	@Autowired
	WebDriver driver;
	
	public void acessarSiteShoestock() {
		driver.get("https://www.shoestock.com.br/");
	}
}
