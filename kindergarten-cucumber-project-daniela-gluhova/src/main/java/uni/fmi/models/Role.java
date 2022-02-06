package uni.fmi.models;

import java.util.Objects;
import java.util.Set;

public class Role {
	private String code;
	private Set<User> users;
	
	public Role(final String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
	public Set<User> getUsers(){
		return users;
	}

	@Override
	public int hashCode() {
		return Objects.hash(code, users);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Role other = (Role) obj;
		return Objects.equals(code, other.code) && Objects.equals(users, other.users);
	}
	
	
}
