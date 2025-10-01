package home_ass;
import java.util.*;
public class Boat_Save_People {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public int numRescueBoats(int[] p, int limit) {
	        Arrays.sort(p);
	        int boat=0;
	        int i=0,j=p.length-1;
	        while(i<=j){
	            if(p[i]+p[j]<=limit){
	            
	             i++;
	          
	            }
	          j--;
	          boat++;
	        }
	        return boat;
	    }
}
