package uni.fmi.models;

import java.util.HashSet;
import java.util.Set;

public class User {
	/*https://www.baeldung.com/role-and-privilege-for-spring-security-registration*/

    private String username;
    private String password;
    private String email;
    private Set<Role> roles;

    /**
     * Default constructor
     */
    public User() {
  
    }
    
    public User(final String username, final String email, final String password) {
    	  this.username = username;
    	  this.email = email;
    	  this.password = password;
    }
    
    /**
     * 
     */

    public String getUsername() {
        return username;
    }

    /**
     * @param username 
     * @return
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password 
     * @return
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email 
     * @return
     */
    public void setEmail(String email) {
    	this.email = email;
    }
    
    public void setRoles(Set<Role> roles) {
    	if(roles != null) {
    		this.roles = roles;
    	}else {
			this.roles.clear();
		}
    	
    }
    
    /**
     * 
     * @return existing roles or empty Set
     */
    public Set<Role> getRoles() {
    	if (roles==null) {
    		roles = new HashSet<Role>();
		}
    	return roles;
    }

}