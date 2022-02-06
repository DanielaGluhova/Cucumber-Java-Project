package uni.fmi.ranking;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(monochrome = true, plugin = {"pretty", "html:target/ranking-feature"},features = "src/test/resources/uni/fmi/ranking", glue = {"uni.fmi.ranking"})
public class RankingStarter {
	
}
