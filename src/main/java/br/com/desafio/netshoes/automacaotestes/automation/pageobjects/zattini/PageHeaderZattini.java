package br.com.desafio.netshoes.automacaotestes.automation.pageobjects.zattini;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import br.com.desafio.netshoes.automacaotestes.configuration.annotation.Page;

@Page
public class PageHeaderZattini {
	@FindBy(id = "search-input")
	WebElement busca;

	@FindBy(xpath = "//a[@href='/cart']")
	WebElement carrinho;

	@FindBy(xpath = "//button[text()='Buscar' and @type='submit']")
	WebElement pesquisar;


	public void clickButtonPesquisar() {
		pesquisar.click();
	}

	public void clickButtonCarrinho() throws Exception {
		Thread.sleep(10000);
		carrinho.click();
	}

	public void setInputBusca(CharSequence... keysToSend) {
		busca.sendKeys(keysToSend);
	}
}
