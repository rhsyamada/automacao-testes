package br.com.desafio.netshoes.automacaotestes.configuration.bean;

import org.openqa.selenium.WebDriver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import br.com.desafio.netshoes.core.selenium.WebDriverFactory;
import br.com.desafio.netshoes.core.selenium.drivers.WebDriverProxy;
import br.com.desafio.netshoes.core.selenium.enums.TypeWebDriver;

@Configuration
@Order(value=1)
public class ConfigWeb {
	private WebDriverProxy driver;

	public void createWebdriver(TypeWebDriver type) {
		driver.setDriver(WebDriverFactory.getInstance().createWebDriver(type));
	}

	public void createWebdriver() {
		driver.setDriver(WebDriverFactory.getInstance().createWebDriver());
	}

	public void destroyer() {
		driver.close();
		driver.quit();
	}

	public boolean isFilledWebDriver() {
		return driver != null;
	}

	@Bean
	public WebDriver webDriver() {
		if (driver == null) {
			driver = new WebDriverProxy();
		}
		return driver;
	}
}
