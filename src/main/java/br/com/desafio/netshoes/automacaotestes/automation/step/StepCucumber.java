package br.com.desafio.netshoes.automacaotestes.automation.step;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.desafio.netshoes.automacaotestes.automation.pageobjects.Page1;
import br.com.desafio.netshoes.automacaotestes.automation.pageobjects.Page2;
import br.com.desafio.netshoes.automacaotestes.configuration.annotation.InitializeConfig;
import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Entao;
import cucumber.api.java.pt.Quando;

@InitializeConfig
public class StepCucumber {
	@Autowired
	Page1 page1;
	
	@Autowired
	Page2 page2;

	@Dado("^que estou logado$")
	public void que_estou_logado() throws Throwable {
		System.out.println("StepCucumber -> que estou logado");
	}

	@Quando("^acessar o site$")
	public void acessar_o_site() throws Throwable {
		System.out.println("StepCucumber -> acessar o site");
		page1.imprimir();
	}

	@Entao("^o site sera carregado$")
	public void o_site_sera_carregado() throws Throwable {
		page2.imprimir();
		System.out.println("StepCucumber -> o site sera carregado");
	}

}
