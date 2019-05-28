/*
	Spoj "Candy"
	link :- https://www.spoj.com/problems/CANDY/

*/
import java.util.*;
class Candy {
	public static void main(String[] args) {
		Scanner kb = new Scanner (System.in);
		int n = 0;
		while ((n = kb.nextInt()) != -1) {
			int []arr = new int[n];
			for (int i = 0; i < n; i++) arr[i] = kb.nextInt();
			int sum = 0;	
			for (int i = 0; i < n; i++) sum += arr[i];
			int res = sum/n; // 10/5 => 2
			// i.e i need 2 chocolates in every slot to make it equal
			// so, i need to figure out how many chocolates i need to take i.e chocolate in -ve
			int ans = 0;
			for (int i = 0; i < n; i++) {
				ans += arr[i] - res;
			}
			if (ans == 0)
			{
				int t = 0;
				for (int i = 0; i < n; i++) {
					if (arr[i] >= res)
						t += (arr[i] - res);
				}
				System.out.println(t);
			}else {
				System.out.println(-1);
			}
		}
	}
}