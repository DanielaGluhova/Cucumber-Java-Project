package uni.fmi.ranking;

import static org.junit.Assert.assertEquals;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.RowFilter.Entry;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.models.Role;
import uni.fmi.models.User;
import uni.fmi.ranking.model.RankingModel;
import uni.fmi.ranking.service.RankingService;

public class RankingSteps {
	
	private User parentUser;
	private RankingModel rankingModel;
	private String message;
	private String name;
	private int points;
	
	@Given("^Трябва User-a има роля РОДИТЕЛ$")
	public void трябва_User_a_има_роля_РОДИТЕЛ() throws Throwable {
	    parentUser = new User("parent","par23@gmail.com","password");
	    final Set<Role> roles = parentUser.getRoles();
	    roles.add(new Role("parent"));
	}

	@Given("^отваря екрана за въвеждане на име и точки$")
	public void отваря_екрана_за_въвеждане_на_име_и_точки() throws Throwable {
	    rankingModel = new RankingModel();
	}

	@When("^Добави \"([^\"]*)\"$")
	public void добави(String name) throws Throwable {
		rankingModel.setName(name);
	}
	
	@When("^добави \"([^\"]*)\"$")
	public void добави(int points) throws Throwable {
		rankingModel.setPoints(points);
	}

	
	@When("^Натискане на бутон за извеждане на класация$")
	public Map<String, Integer> clickButton() throws Throwable {	
		//message = RankingService.addRankingChild(parentUser, name, points);
		
		Map<String, Integer> unsortedMap = new HashMap<String, Integer>();

		unsortedMap.put(name,points);
//		unsortedMap.put("Рени", 4);
//		unsortedMap.put("Петър", 3);
//		unsortedMap.put("Марая", 3);
//		unsortedMap.put("Георги", 2);
		
		return unsortedMap;
		 
	}

	@Then("^Извежда се класацията$")
	public LinkedHashMap<String, Integer> rankExecute(Map<String, Integer> unsortedMap) throws Throwable {
		
//		assertEquals(expectedMessage, message);
		
        LinkedHashMap<String, Integer> reverseSortedMap = new LinkedHashMap<>();
        unsortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                .forEachOrdered(x -> reverseSortedMap.put(x.getKey(), x.getValue()));

        return reverseSortedMap;
	}
}

