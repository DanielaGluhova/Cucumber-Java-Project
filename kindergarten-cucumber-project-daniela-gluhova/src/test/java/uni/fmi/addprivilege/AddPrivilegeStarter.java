package uni.fmi.addprivilege;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin = {"pretty", "html:target/addprivilege-feature"},features = "src/test/resources/uni/fmi/addprivilege", glue = {"uni.fmi.addprivilege"})
public class AddPrivilegeStarter {
	
}
