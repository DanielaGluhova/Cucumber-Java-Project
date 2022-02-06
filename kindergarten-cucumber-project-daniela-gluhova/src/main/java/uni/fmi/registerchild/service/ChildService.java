package uni.fmi.registerchild.service;


import uni.fmi.models.User;

public class ChildService {

	public static String registerChild(User user, String childName, Integer childIdentity, Integer childAge) {
		final String message;
		boolean isParent = user.getRoles().stream().anyMatch(r->"parent".equals(r.getCode()));
		
		if(isParent) {
			if (null == childName || childName.isBlank()){
				message = "Добавете име!";
			}else if (childIdentity==0) {
				message = "Добавете ЕГН!";
			}else if (childAge==0) {
				message = "Добавете години!";
			}else { 
				message = "Детето е регистрирано!";
			}	
		}else {
			message = "Нямате права за регистриране на дете!";
		}
		return message;
	}
}
