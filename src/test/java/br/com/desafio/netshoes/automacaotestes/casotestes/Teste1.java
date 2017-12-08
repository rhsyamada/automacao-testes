package br.com.desafio.netshoes.automacaotestes.casotestes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import br.com.desafio.netshoes.automacaotestes.automation.pageobjects.Page1;
import br.com.desafio.netshoes.automacaotestes.automation.pageobjects.Page2;
import br.com.desafio.netshoes.automacaotestes.configuration.annotation.InitializeConfig;

@RunWith(SpringJUnit4ClassRunner.class)
@InitializeConfig
public class Teste1 {
	@Autowired
	Page1 page1;
	
	@Autowired
	Page2 page2;
	
	@Test
	public void Teste() {
		page1.imprimir();
		page2.imprimir();
	}
}
