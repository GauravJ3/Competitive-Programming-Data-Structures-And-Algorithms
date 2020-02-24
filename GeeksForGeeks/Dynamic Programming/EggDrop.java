/*
	Link :- https://practice.geeksforgeeks.org/problems/egg-dropping-puzzle/0
	Time Complexity :- O(N*K*K)
	Space Complexity :- O(N*K)
*/
import java.util.*;
class EggDrop {
	public static int eggDrop(int N, int K, int [][]DP) {
		// if there is only one egg
		// then we can in worst case have to check for 
		// all 'k' floors.. so 
		// min number of try in worst case for 1
		// egg will be = k
		if (N == 1) return K;
		// if we have only 1 floor to test the eggs 
		// we in worst case have only one option
		// either an egg breaks or not.. so 1 try
		if (K == 1) return 1;
		// now for rest of the cases we have to 
		// consider 	   i<=k	
		// eggDrop(N, K) = min(max(eggDrop(N-1, k-1), eggDrop(N, k-i))+1)  
		//                 i=1
		// here we make use of DP -> 
		if (DP[N][K] >= 0) return DP[N][K];
		int ans = Integer.MAX_VALUE;
		int res = 0;
		for (int i = 1; i <= K; i++) {
			res = Math.max(eggDrop(N-1, K-1), eggDrop(N, K-i));
			if (res < ans) {
				ans = res;
			}
		}
		DP[N][K] = ans + 1;
		return ans;
	}
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int T = kb.nextInt();
		while (T-- > 0) {
			int N = kb.nextInt(); // num of eggs
			int K = kb.nextInt(); // num of floors
			int [][]DP = new int[N+1][K+1];
			for (int i = 0; i <= N; i++) {
				for (int j = 0; j <= K; j++) {
					DP[i][j] = -1;
				}
			}
			int ans = eggDrop(N, K, DP);
			System.out.println(ans);
		}
	}
}	