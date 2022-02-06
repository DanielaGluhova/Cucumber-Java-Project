package uni.fmi.addprivilege.model;

import uni.fmi.addprivilege.service.AddPrivilegeService;
import uni.fmi.models.User;

public class AddPrivilegeScreenModel {

	private String privilegeName;
	private int privilegePoints;
	private String message;
	private User adminUser;

	public void setPrivilegeName(String privilegeName) {
		this.privilegeName = privilegeName;
		
	}

	public void setPrivilegePoints(int privilegePoints) {
		this.privilegePoints = privilegePoints;
		
	}
	
	public void clickAddButton(){
		message = AddPrivilegeService.addPrivilege(adminUser, privilegeName, privilegePoints);
	}
	

	public String getMessage() {
		return message;
	}
	
}
