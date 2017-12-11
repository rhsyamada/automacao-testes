package br.com.desafio.netshoes.automacaotestes.automation.pageobjects.shoestock;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.desafio.netshoes.automacaotestes.configuration.annotation.Page;

@Page
public class PageCarrinhoShoestock extends PageHeaderShoestock {
	@Autowired
	public PageCarrinhoShoestock(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='product-info']//div[@class='description']//li[contains(text(), 'Cor')]")
	WebElement textCor;

	@FindBy(xpath = "//div[@class='product-info']//div[@class='description']//li[contains(text(), 'Tamanho')]")
	WebElement textTamanho;

	@FindBy(xpath = "//div[@class='product-info']//div[@class='description']//li[contains(text(), 'Ref')]")
	WebElement textRef;

	@FindBy(xpath = "//div[@class='product-info']/strong")
	WebElement textNome;

	@FindBy(className = "new-price")
	WebElement textPreco;

	public String getTextCor() {
		return textCor.getText();
	}

	public String getTextTamanho() {
		return textTamanho.getText();
	}

	public String getTextRef() {
		return textRef.getText();
	}

	public String getTextNome() {
		return textNome.getText();
	}

	public String getTextPreco() {
		return textPreco.getText();
	}
}
