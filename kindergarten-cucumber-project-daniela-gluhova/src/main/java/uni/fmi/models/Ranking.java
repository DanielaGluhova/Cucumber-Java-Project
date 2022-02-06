package uni.fmi.models;
import java.util.*;

/**
 * 
 */
public class Ranking {

    private int arrangement;
    private Set<Child> kids;

    /**
     * Default constructor
     */
    public Ranking() {
    }
    
    /**
     * @return
     */
    public int getArrangement() {
        return arrangement;
    }

    /**
     * @param arrangement 
     * @return
     */
    public void setArrangement(int arrangement) {
        this.arrangement = arrangement;

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
    public List<Ranking> checkRanking() {
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

}