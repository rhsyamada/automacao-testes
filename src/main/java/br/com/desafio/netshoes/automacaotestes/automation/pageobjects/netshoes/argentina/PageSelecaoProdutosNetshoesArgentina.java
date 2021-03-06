package br.com.desafio.netshoes.automacaotestes.automation.pageobjects.netshoes.argentina;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.desafio.netshoes.automacaotestes.configuration.annotation.Page;

@Page
public class PageSelecaoProdutosNetshoesArgentina extends PageHeaderNetshoesArgentina {
	@Autowired
	WebDriver driver;

	@Autowired
	public PageSelecaoProdutosNetshoesArgentina(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickProduto(int index) {
		driver.findElement(By.xpath("//div[@itemprop='itemListElement'][" + index + "]/a[1]")).click();
	}
}
