package br.com.desafio.netshoes.automacaotestes.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("br.com.desafio.netshoes")
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args).close();
	}
}