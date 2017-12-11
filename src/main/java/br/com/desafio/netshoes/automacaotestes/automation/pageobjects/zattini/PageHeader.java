package br.com.desafio.netshoes.automacaotestes.automation.pageobjects.zattini;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageHeader {
	@FindBy(id="search-input")
	private WebElement busca;
	
	@FindBy(xpath="//i[contains(@cart-title, 'Sacola')]")
	private WebElement carrinho;
	
	@FindBy(xpath="//button[text()='Buscar' and @type='submit']") 
	private WebElement pesquisar;
	
	public void clickButtonPesquisar() {
		pesquisar.click();
	}
	
	public void clickButtonCarrinho() {
		carrinho.click();
	}
	
	public void setInputBusca(CharSequence... keysToSend) {
		busca.sendKeys(keysToSend);
	}
}
