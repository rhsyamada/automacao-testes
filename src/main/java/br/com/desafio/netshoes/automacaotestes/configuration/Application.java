package br.com.desafio.netshoes.automacaotestes.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Classe que fornece a configura��o para inicializar o Spring Boot
 * @author Thiago Sakurai Paschoal
 * @see
 * 
 */
@SpringBootApplication
@ComponentScan("br.com.desafio.netshoes.automacaotestes")
public class Application {
	
	/**
	 * Inicializa o container a partir do java main
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args).close();
	}
}