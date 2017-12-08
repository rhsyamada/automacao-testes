package br.com.desafio.netshoes.automacaotestes.configuration;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.desafio.netshoes.automacaotestes.configuration.bean.ConfigWeb;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksDrivers {
	@Autowired
	ConfigWeb config;

	@Before
	public void initialize(Scenario scenario) throws Throwable {
		System.out.println("HooksDrivers -> initialize");
	}

	@After
	public void finalize(Scenario scenario) throws Throwable {
		config.destroyer();
		System.out.println("HooksDrivers -> finalize");
	}
}