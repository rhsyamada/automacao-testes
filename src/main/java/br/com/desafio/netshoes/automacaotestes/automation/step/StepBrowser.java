package br.com.desafio.netshoes.automacaotestes.automation.step;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.desafio.netshoes.automacaotestes.configuration.annotation.InitializeConfig;
import br.com.desafio.netshoes.automacaotestes.configuration.bean.ConfigWeb;
import br.com.desafio.netshoes.core.selenium.enums.TypeWebDriver;
import cucumber.api.java.pt.Dado;

@InitializeConfig
public class StepBrowser {
	@Autowired
	ConfigWeb config;

	@Dado("^que abri o browser CRHOME$")
	public void queAbriOBrowserCRHOME() throws Throwable {
		config.newWebdriver(TypeWebDriver.CHROME);
	}
}
