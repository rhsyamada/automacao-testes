package br.com.desafio.netshoes.automacaotestes.automation.pageobjects.netshoes.argentina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.desafio.netshoes.automacaotestes.configuration.annotation.Page;
import br.com.desafio.netshoes.core.selenium.command.WebCommand;

@Page
public class PageProdutoNetshoesArgentina extends PageHeaderNetshoesArgentina {
	@Autowired
	WebDriver driver;

	@Autowired
	public PageProdutoNetshoesArgentina(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h1[@itemprop='name']")
	WebElement textNome;

	@FindBy(xpath = "//p[@class='reference']/span")
	WebElement textReferencia;

	@FindBy(xpath = "//p[@itemprop='description']")
	WebElement textDescricao;

	@FindBy(xpath = "//div[contains(@class, 'price')]/span[@itemprop='price']")
	WebElement textPreco;
	//
	// @FindBy(xpath=)
	// WebElement buttonTamanho;

	@FindBy(id = "buy-button-now")
	WebElement buttonComprar;

	public String getTextNome() {
		return textNome.getText();
	}

	public String getTextReferencia() {
		return textReferencia.getText();
	}

	public String getTextPreco() {
		return textPreco.getText();
	}

	public String getTextCor() {
		String xpath = "//ul[@data-type='colors']/parent::*/span[@class='label']";
		if (new WebCommand(driver).exists(xpath, 10))
			return driver.findElement(By.xpath(xpath)).getText();
		else
			return null;
	}

	public String getTextTamanho() {
		String xpath = "//ul[@data-type='sizes']/li[@class='active']";
		if (new WebCommand(driver).exists(xpath, 10))
			return driver.findElement(By.xpath(xpath)).getText();
		else
			return null;
	}
	
	public void clickButtonTamanho() {
		String xpath = "//ul[@data-type='sizes']/li[not(contains(normalize-space(@class), 'unavailable'))][1]/a";
		if (new WebCommand(driver).exists(xpath, 10))
			driver.findElement(By.xpath(xpath)).click();
	}

	public void clickButtonCor() throws Exception {
		String xpath = "//ul[@data-type='colors']/li[not(contains(normalize-space(@class), 'unavailable'))][1]/a";
		if (new WebCommand(driver).exists(xpath, 10)) {
			driver.findElement(By.xpath(xpath)).click();
			Thread.sleep(5000);
		}
	}

	public void clickButtonComprar() {
		buttonComprar.click();
	}
}
