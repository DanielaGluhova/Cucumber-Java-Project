package uni.fmi.addprivilege;

import static org.junit.Assert.assertEquals;


import java.util.Set;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import uni.fmi.addprivilege.model.AddPrivilegeScreenModel;
import uni.fmi.addprivilege.service.AddPrivilegeService;
import uni.fmi.models.Role;
import uni.fmi.models.User;


public class AddPrivilegeSteps {
	
	private User adminUser;
	private AddPrivilegeScreenModel addPrivilegeModel;
	private Object message;

	private int privilegePoints;
	private String privilegeName;


	
	@Given("^Трябва да бъде АДМИН$")
	public void userIsAdmin() throws Throwable {
		adminUser = new User("admin","admin23@gmail.com","password");
	    final Set<Role> roles = adminUser.getRoles();
	    roles.add(new Role("admin"));
	}
	
	
	@Given("^Влиза като РОДИТЕЛ$")
	public void влиза_като_РОДИТЕЛ() throws Throwable {
		adminUser = new User("parent","parent23@gmail.com","password");
	    final Set<Role> roles = adminUser.getRoles();
	    roles.add(new Role("parent"));
	}

	@Given("^отваря прозорец за добавяне на приоритет$")
	public void отваря_прозорец_за_добавяне_на_приоритет() throws Throwable {
	    addPrivilegeModel = new AddPrivilegeScreenModel();
	}

	@When("^Попълва се \"([^\"]*)\"$")
	public void попълва_се(final String privilegeName) throws Throwable {
	    this.privilegeName=privilegeName;
	}

	@When("^Въвежда съответните (\\d+) на приоритета$")
	public void въвежда_съответните_на_приоритета(int privilegePoints) throws Throwable {
		this.privilegePoints=privilegePoints;
	}

	@When("^натиска бутон за добавяне на приоритет$")
	public void clickAddButton() throws Throwable {
		message = AddPrivilegeService.addPrivilege(adminUser,privilegeName,privilegePoints);
	}

	@Then("^Показва се \"([^\"]*)\"$")
	public void показва_се(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, message);
	}
}
