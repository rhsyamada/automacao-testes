package br.com.desafio.netshoes.automacaotestes.automation.pageobjects.shoestock;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.desafio.netshoes.automacaotestes.configuration.annotation.Page;

@Page
public class PageSelecaoProdutosShoestock extends PageHeaderShoestock {
	@Autowired
	WebDriver driver;

	@Autowired
	public PageSelecaoProdutosShoestock(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickProduto(int index) {
		driver.findElement(By.xpath("//div[@itemprop='itemListElement'][" + index + "]/a[1]")).click();
	}
}
