package home_ass;

public class Valid_Perfect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public boolean isPerfectSquare(int num) {
        int start=1;
	       int last=num;
	    
	       for(int mid;start<=last;) {
	    	   mid=(start+last)/2;
	    	   if((long)mid*mid==num) {
	    		   return true;
	    	   }
	    	   else if((long)mid*mid<num) {
	    		   start=mid+1;
	    	   }
	    	   else {
	    		   last=mid-1;
	    		 
	    	   }
	    	  
	       }
	       return false;
    }

}
