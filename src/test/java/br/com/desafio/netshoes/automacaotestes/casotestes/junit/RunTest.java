package br.com.desafio.netshoes.automacaotestes.casotestes.junit;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, snippets = SnippetType.CAMELCASE, plugin = {
		"json:target/surefire-reports/cucumber.json" }, features = { ".\\src\\test\\resources\\" }, glue = {
				"br.com.desafio.netshoes.automacaotestes.automation.step",
				"br.com.desafio.netshoes.automacaotestes.configuration" })
public class RunTest {
}