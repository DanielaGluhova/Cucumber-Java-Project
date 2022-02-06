package uni.fmi.registerchild;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin = {"pretty", "html:target/registerchild-feature"},features = "src/test/resources/uni/fmi/registerchild", glue = {"uni.fmi.registerchild"})
public class RegisterChildStarter {
	
}
