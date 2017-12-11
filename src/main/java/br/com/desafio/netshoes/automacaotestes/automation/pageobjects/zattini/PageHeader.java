package br.com.desafio.netshoes.automacaotestes.automation.pageobjects.zattini;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageHeader {
	@FindBy(id="search-input")
	WebElement busca;
	
	@FindBy(xpath="//i[@class='icons i-cart']/..")
	WebElement carrinho;
	
	@FindBy(xpath="//button[text()='Buscar' and @type='submit']") 
	WebElement pesquisar;
	
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
