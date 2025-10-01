package home_ass;
import java.util.*;
public class Queen_reconstruction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> {
          if (a[0] == b[0]) 
              return a[1] - b[1]; // same height → k ascending
          return b[0] - a[0];     // height descending
      });

      List<int[]> res = new ArrayList<>();
      for (int[] p : people) {
          res.add(p[1], p); // insert at index k
      }

      return res.toArray(new int[people.length][]);
  }
}
