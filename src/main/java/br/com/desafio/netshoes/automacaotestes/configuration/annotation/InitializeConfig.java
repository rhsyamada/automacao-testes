package br.com.desafio.netshoes.automacaotestes.configuration.annotation;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.desafio.netshoes.automacaotestes.configuration.Application;

@Retention(RUNTIME)
@ContextConfiguration(classes = Application.class)
@RunWith(SpringRunner.class)
@SpringBootTest
public @interface InitializeConfig {

}
