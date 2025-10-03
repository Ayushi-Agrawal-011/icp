package home_ass;

public class Combinations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> comb = new ArrayList<>();
        generateCombinations(n, k, new ArrayList<>(), 1, comb);
        return comb;
    }

    public static void generateCombinations(int n, int k, List<Integer> current, int start, List<List<Integer>> comb) {
        if (current.size() == k) {
            comb.add(new ArrayList<>(current)); // Add a copy of the combination
            return;
        }

        for (int i = start; i <= n; i++) {
            current.add(i);
            generateCombinations(n, k, current, i + 1, comb);
            current.remove(current.size() - 1); // Backtrack
        }
    }

}
