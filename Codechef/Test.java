import java.util.*;
class Test {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int T = kb.nextInt();
		while (T-- > 0) {
			int N = kb.nextInt();
			int []arr = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = kb.nextInt();
			}
			for (int i = 0; i < N; i++) {
				for (int j = i+1; j < N; j++) {
					if (arr[i] != arr[j]) {
						if (arr[arr[i]] == arr[arr[j]]) {
							System.out.println("Truly Happy");
							System.exit();
						}
					}
				}
			}
			System.out.println("Poor Chef");
		}
	}
}