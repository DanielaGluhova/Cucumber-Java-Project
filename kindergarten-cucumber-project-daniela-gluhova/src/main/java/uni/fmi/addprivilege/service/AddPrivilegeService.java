package uni.fmi.addprivilege.service;

import uni.fmi.models.User;

public class AddPrivilegeService {
	
	
	

	public static String addPrivilege(User user, String privilegeName, Integer privilegePoints) {
		final String message;
		boolean isAdmin = user.getRoles().stream().anyMatch(r->"admin".equals(r.getCode()));
		
		if(isAdmin) {
			if (null == privilegeName || privilegeName.isBlank()){
				 message = "Добавете име!";
			}else if (privilegePoints==0) {
				message = "Добавете точки!";
			}else {
				 message = "Привилегията е добавена!";
			}
		}else {
			 message = "Нямате права за създаване на привилегия!";
		}
		return message;
	}
}
