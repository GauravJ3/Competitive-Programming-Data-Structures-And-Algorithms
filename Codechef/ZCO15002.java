/*
Problem Link :- 
https://www.codechef.com/ZCOPRAC/problems/ZCO15002
{{ Easy Problem }}
*/
class ZCO15002 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int N = kb.nextInt();
		int K = kb.nextInt();
		int []arr = new int[N];
		for (int i = 0; i < N; i++) {
			arr[i] = kb.nextInt();
		}
		// sort the array
		Arrays.sort(arr);
		int ans = 0;
		for (int i = 0; i < N-1; i++) {
			for (int j = i+1; j < N; j++) {
				if (arr[j]-arr[i] >= K) {
					ans += (N-j);
					break;
				}
			}
		}
		System.out.println(ans);
	}
}