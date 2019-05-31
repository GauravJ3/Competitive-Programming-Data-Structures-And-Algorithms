/*
SPOJ Problem -> https://www.spoj.com/problems/FASHION
Hint : You need to make pair first and then maximize the sum of products

*/
import java.util.*;
class Test {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int T = kb.nextInt();
		while (T-- > 0) {
			int n = kb.nextInt();
			// for men
			int []menHotness = new int[n];
			// for women
			int []womenHotness = new int[n];
			for (int i = 0; i < n; i++){
				menHotness[i] = kb.nextInt(); // taking menHotness as input first
			}
			for (int i = 0; i < n; i++){
				womenHotness[i] = kb.nextInt(); // taking womenHotness as input first
			}
			// The task is to take one elements from both the array at a time and multiply them and add these pairs
			Arrays.sort(menHotness);
			Arrays.sort(womenHotness);
			
			int ans = 0;
			for (int i = 0; i < n; i++) {
				ans += (menHotness[i]*womenHotness[i]);
			}
			System.out.println(ans);
		}
	}
}
