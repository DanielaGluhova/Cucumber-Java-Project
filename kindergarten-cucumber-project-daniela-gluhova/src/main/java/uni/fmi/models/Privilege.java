package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Privilege {

    private String privilegeName;
    private int privilegePoints;
    private Set<User> admin;
    private Set<Child> kids;

    
    /**
     * Default constructor
     */
    public Privilege() {
    }
    
    public Privilege(User user, String privilegeName, int privilegePoints) {
    	this.privilegeName = privilegeName;
    	this.privilegePoints = privilegePoints;
    }
    
    /**
     * @return
     */
    public String getPrivilegeName() {
        // TODO implement here
        return privilegeName;
    }

    /**
     * @param privilege_Name 
     * @return
     */
    public void setPrivilegeName(String privilege_Name) {
        this.privilegeName = privilege_Name;

    }

    /**
     * @return
     */
    public int getPrivilegePoints() {
        // TODO implement here
        return privilegePoints;
    }

    /**
     * @param privilege_Points 
     * @return
     */
    public void setPrivilegePoints(int privilege_Points) {
        this.privilegePoints = privilege_Points;

    }

    /**
     * @return
     */
    public String addPrivilege() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String editPrivilege() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public String deletePrivilege() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public List<Privilege> checkPrivilege() {
        // TODO implement here
        return null;
    }

    /**
     * @return
     */
    public Set<Child> getKids() {
        if (null == kids) {
			kids = new HashSet<>();
		}
        return kids;
    }

    /**
     * @param kids 
     * @return
     */
    public void setKids(Set<Child> kids) {
        this.kids = kids;

    }

    /**
     * @return
     */
    public Set<User> getAdmin() {
        if (null == admin) {
			admin = new HashSet<>();
		}
        return admin;
    }

    /**
     * @param admin 
     * @return
     */
    public void setAdmin(Set<User> admin) {
        this.admin = admin;

    }


}