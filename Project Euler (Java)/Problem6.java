import java.util.*;
class Problem6 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		// 1 to 100 -> Sum of squares
		int n = kb.nextInt();
		int sum = 0;
		int sq = 0;
		for (int i = 1; i <= n; i++) {
			sum += (i*i);
		}
		// 1 to 100 -> square of sum
		for (int i = 1; i <= n; i++) {
			sq += (i);
		}
		sq = sq * sq;
		// difference
		int diff = sum - sq;
		System.out.println(diff);
	}
}