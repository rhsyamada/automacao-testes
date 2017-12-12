package br.com.desafio.netshoes.automacaotestes.automation.pageobjects.zattini;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.desafio.netshoes.automacaotestes.configuration.annotation.Page;
import br.com.desafio.netshoes.geradorevidencia.evidence.pdf.images.exceptions.ImageExceptions;
import br.com.desafio.netshoes.geradorevidencia.structures.Evidencia;

@Page
public class PageHeaderZattini {
	@FindBy(id = "search-input")
	WebElement busca;

	@FindBy(xpath = "//a[@href='/cart']")
	WebElement carrinho;

	@FindBy(xpath = "//button[text()='Buscar' and @type='submit']")
	WebElement pesquisar;

	@Autowired
	private Evidencia evidencia;
	
	@Autowired
	private WebDriver driver;

	public void clickButtonPesquisar() {
		pesquisar.click();
	}

	public void clickButtonCarrinho() throws Exception {
		Thread.sleep(10000);
		carrinho.click();
	}

	public void setInputBusca(String keysToSend) throws ImageExceptions {
		busca.sendKeys(keysToSend);
		evidencia.tirarPrint(driver, "Preenchendo campo de busca com produto: " + keysToSend);
	}
}
