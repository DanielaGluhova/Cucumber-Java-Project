package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Child {

    private String childName;
    private int childIdentity;
    private int childAge;
    private Set<User> parent;
    private Set<Ranking> ranking;
    private Set<Privilege> privileges;

    /**
     * Default constructor
     */
    public Child() {
    }
    
    public Child(final User user,final String childName, final int childIdentity,final int childAge) {
    	this.childName=childName;
    	this.childIdentity=childIdentity;
    	this.childAge=childAge;
    }
    
    /**
     * @return
     */
    public String getChildName() {
        return childName;
    }

    /**
     * @param child_Name 
     * @return
     */
    public void setChildName(String childName) {
        this.childName = childName;
    }

    /**
     * @return
     */
    public int getChildIdentity() {
        return childIdentity;
    }

    /**
     * @param child_Identity 
     * @return
     */
    public void setChildIdentity(int childIdentity) {
        this.childIdentity = childIdentity;

    }

    /**
     * @return
     */
    public int getChildAge() {
        // TODO implement here
        return childAge;
    }

    /**
     * @param child_Age 
     * @return
     */
    public void setChildAge(int childAge) {
        this.childAge = childAge;
 
    }

    /**
     * @return
     */
    public String registerChild() {
        // TODO implement here
        return "";
    }

    /**
     * @return
     */
    public int calcTotalPoints() {
        // TODO implement here
        return 0;
    }

    /**
     * @return
     */
    public Set<Privilege> getPrivileges() {
        // TODO implement here
        return privileges;
    }

    /**
     * @param privileges 
     * @return
     */
    public void setPrivileges(Set<Privilege> privileges) {
        this.privileges = privileges;

    }

    /**
     * @return
     */
    public Set<Ranking> getRanking() {
        if (null == ranking) {
			ranking = new HashSet<>();
		}
        return ranking;
    }

    /**
     * @param ranking 
     * @return
     */
    public void setRanking(Set<Ranking> ranking) {
        this.ranking = ranking;

    }

    /**
     * @return
     */
    public Set<User> getParent() {
        if (null == parent) {
			parent = new HashSet<>();
		}
        return parent;
    }

    /**
     * @param parent 
     * @return
     */
    public void setParent(Set<User> parent) {
        this.parent = parent;

    }

}