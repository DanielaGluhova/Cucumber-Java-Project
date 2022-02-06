package uni.fmi.registerchild;

import static org.junit.Assert.assertEquals;

import java.util.Set;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.models.Role;
import uni.fmi.models.User;
import uni.fmi.registerchild.model.RegisterChildModel;
import uni.fmi.registerchild.service.ChildService;

public class RegisterChildSteps {
	
	private User parentUser;
	private String message;
	private RegisterChildModel registerChildScreen;
	private String childName;
	private int childIdentity;
	private int childAge;
	
	@Given("^User-а трябва да бъде родител$")
	public void user_а_трябва_да_бъде_родител() throws Throwable {
		parentUser = new User("parent","par23@gmail.com","password");
	    final Set<Role> roles = parentUser.getRoles();
	    roles.add(new Role("parent"));
	}
	
	@Given("^Влиза като АДМИН$")
	public void влиза_като_АДМИН() throws Throwable {
		parentUser = new User("parent","par23@gmail.com","password");
	    final Set<Role> roles = parentUser.getRoles();
	    roles.add(new Role("admin"));
	}

	@Given("^отваря екрана за регистриране на дете$")
	public void отваря_екрана_за_регистриране_на_дете() throws Throwable {
	    registerChildScreen = new RegisterChildModel();
	}


	@When("^Въвежда \"([^\"]*)\"$")
	public void въвежда(String childName) throws Throwable {
		this.childName=childName;
	}

	
	@When("^въвежда ЕГН (\\d+)$")
	public void въвежда_ЕГН(int childIdentity) throws Throwable {
	    this.childIdentity=childIdentity;
	}

	@When("^въвежда години (\\d+)$")
	public void въвежда_години(int childAge) throws Throwable {
	    this.childAge=childAge;
	}

	@When("^Натиска бутон за регистриране на дете$")
	public void clickRegisterChildButton() throws Throwable {
		message = ChildService.registerChild(parentUser, childName, childIdentity, childAge);
	}

	
	@Then("^Показва съобщение \"([^\"]*)\"$")
	public void показва_съобщение(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, message);
	}
}