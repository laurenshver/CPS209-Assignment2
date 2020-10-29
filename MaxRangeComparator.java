import java.util.*;

/**@author Lauren Shver 500776374
 * 
*/

public class MaxRangeComparator implements Comparator<Car>{

    /**
     * sorts cars based on maxrange
     * sorts in acending order
     */
    public int compare(Car a, Car b){
        if( a.maxRange < b.maxRange) return -1;
        if( a.maxRange > b.maxRange) return 1;
        return 0;
    }
    
}