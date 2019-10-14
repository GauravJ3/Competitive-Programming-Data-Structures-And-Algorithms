import java.util.*;
class Question1 {
	public static int comb(int f, int r, int[]fact) {
		return fact[f]/(fact[r]*fact[r-f]);
	}
	public static void main(String[] args) {
		Scanner kb=new Scanner(System.in);
		int T = kb.nextInt();
		int fact[] = new int[51];
		fact[0] = 1;
		fact[1] = 1;
		for (int i = 2; i <= 50; i++) {
			fact[i] = i*fact[i-1];
		}
		while (T-- > 0) {
			int N = kb.nextInt();	
			int K = kb.nextInt();
			int []arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = kb.nextInt();
			}
			Arrays.sort(arr); // we'll sort the values
			int []freq = new int[51];
			for (int i : arr) {
				freq[i]++;
			}
			int i = 0;
			int res = 1;
			// take first k elements
			while (K > freq[arr[i]]) {
				K = K - freq[arr[i]];
				i++;
			}
			res = res*comb(freq[arr[i]], K, fact);
			System.out.println(res);
		}
	}
}