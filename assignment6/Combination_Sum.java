package home_ass;
import java.util.*;
public class Combination_Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	 public List<List<Integer>> combinationSum2(int[] coin, int target) {

			// TODO Auto-generated method stub
		Arrays.sort(coin);
			List<List<Integer>> ans = new ArrayList<>();
			List <Integer> ll = new ArrayList<>();
			Combination(coin, target, ll, 0, ans);
			return ans;
		}

		public static void Combination(int[] coin, int amount, List<Integer> ll, int idx, List<List<Integer>> ans) {
			if (amount == 0) {
				// System.out.println(ll);
				ans.add(new ArrayList<>(ll));
				return;
			}
			for (int i = idx; i < coin.length; i++) {
	            if (i > idx && coin[i] == coin[i - 1]) continue;
				if (amount >= coin[i]) {
					ll.add(coin[i]);
					Combination(coin, amount - coin[i], ll, i+1, ans);
					ll.remove(ll.size() - 1);
				}
			}
		}
}
