package uni.fmi.registerchild.model;

import uni.fmi.models.User;
import uni.fmi.registerchild.service.ChildService;

public class RegisterChildModel {

	private String childName;
	private int childIdentity;
	private int childAge;
	private String message;
	private User parentUser;

	public void setChildName(String childName) {
		this.childName = childName;
		
	}

	public void setChildIdentity(int childIdentity) {
		this.childIdentity = childIdentity;
		
	}

	public void setChildAge(int childAge) {
		this.childAge = childAge;
		
	}

	public void clickRegisterChildButton() {
		message = ChildService.registerChild(parentUser, childName, childIdentity, childAge);	
	}

	public String getMessage() {
		
		return message;
	}

	
}
