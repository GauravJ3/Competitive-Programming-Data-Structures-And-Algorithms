// number of substring -> n*(n+1)/2


import java.util.*;
class HUNGALGO {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int T = kb.nextInt();
		while (T-- > 0) {
			int n = kb.nextInt();
			int [][]mat = new int[n][n];
			
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					mat[i][j] = kb.nextInt();
 				}
			}
			int tmp =0;
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					if (mat[i][j] == 0) {
						for (int k = 0; k < n; k++)
							if (mat[k][i] == 0)
								tmp++;
					}
 				}
			}
			if (tmp == 0) {
				System.out.println("NO");
			}else {
				System.out.println("YES");
			}

		}
		kb.close();
	}
}