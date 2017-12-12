package br.com.desafio.netshoes.automacaotestes.configuration.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import br.com.desafio.netshoes.geradorevidencia.GeradorEvidencia;
import br.com.desafio.netshoes.geradorevidencia.structures.Evidencia;

@Configuration
@Order(value=1)
public class ConfigEvidence {
	@Bean
	public GeradorEvidencia geradorEvidencia() {
		return new GeradorEvidencia();
	}
	
	@Bean
	public Evidencia evidencia() {
		return new Evidencia();
	}
}
