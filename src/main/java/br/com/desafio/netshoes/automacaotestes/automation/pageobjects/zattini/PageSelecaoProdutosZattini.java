package br.com.desafio.netshoes.automacaotestes.automation.pageobjects.zattini;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;

import br.com.desafio.netshoes.automacaotestes.configuration.annotation.Page;

@Page
public class PageSelecaoProdutosZattini extends PageHeaderZattini {
	@Autowired
	WebDriver driver;

	@Autowired
	public PageSelecaoProdutosZattini(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void clickProduto(int index) {
		driver.findElement(By.xpath("//div[@itemprop='itemListElement' and @data-position='" + 1 + "']/a[1]")).click();
	}
}
