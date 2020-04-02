package multicart.cuck.test.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.SnippetType;


@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources/" }, 
				 glue={"multicard.steps.defination", "multicard.steps.support"},
				 plugin = { "pretty", "html:out" },
				 tags = {"@WIP "},
				 snippets = SnippetType.CAMELCASE
				 )
public class multicart_Test_Runner {
}
 