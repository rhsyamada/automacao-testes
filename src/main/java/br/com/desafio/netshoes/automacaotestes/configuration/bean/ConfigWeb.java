package br.com.desafio.netshoes.automacaotestes.configuration.bean;

import org.openqa.selenium.WebDriver;
import org.springframework.context.annotation.Configuration;

import br.com.desafio.netshoes.core.selenium.WebDriverFactory;
import br.com.desafio.netshoes.core.selenium.enums.TypeWebDriver;

@Configuration
public class ConfigWeb {
	private WebDriver driver;

	public WebDriver getWebdriver() {
		if (driver == null)
			newWebdriver();
		return driver;
	}

	public void newWebdriver(TypeWebDriver type) {
		driver = WebDriverFactory.getInstance().createWebDriver(type);
	}

	public void newWebdriver() {
		driver = WebDriverFactory.getInstance().createWebDriver();
	}
	
	public void destroyer() {
		driver.quit();
	}
	
	public boolean isFilledWebDriver() {
		return driver != null;
	}
}
