package br.com.desafio.netshoes.automacaotestes.configuration;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	@Before
	public void initialize(Scenario scenario) throws Throwable {
		System.out.println("Hooks -> initialize");
	}

	@After
	public void finalize(Scenario scenario) throws Throwable {
		System.out.println("Hooks -> finalize");
	}
}