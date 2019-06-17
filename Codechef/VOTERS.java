/*
	Link:- https://www.codechef.com/problems/VOTERS
	Codechef Q-> VOTERS
	Tag -> Easy
*/
/*
Example
Sample input:
5 6 5
23
30
42
57
90
21 
23 
35 
57 
90 
92 
21 
23 
30 
57 
90 
Sample output:
5
21 
23 
30 
57 
90
*/
import java.util.*;
class VOTERS {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int n1 = kb.nextInt();
		int n2 = kb.nextInt();
		int n3 = kb.nextInt();
		int []a = new int[n1];
		int []b = new int[n2];
		int []c = new int[n3];
		for (int i = 0; i < n1; i++)
			a[i] = kb.nextInt();
		for (int i = 0; i < n2; i++)
			b[i] = kb.nextInt();
		for (int i = 0; i < n3; i++)
			c[i] = kb.nextInt();	
		// considering the first elements of ever array
		int i = 0; 	
		int j = 0;
		int k = 0;
		// take the min among the three arrays.. 
		// as the array is sorted , check if that min appears in any of the 3 array..
		// increment the counter as well as the index of that array where this min element appears...
		ArrayList<Integer> ans = new ArrayList<>();
		while (i < n1 || j < n2 || k < n3) {
			int count = 0;
			int cur_a = (i < n1) ? a[i] : Integer.MAX_VALUE;
			int cur_b = (j < n2) ? b[j] : Integer.MAX_VALUE;
			int cur_c = (k < n3) ? c[k] : Integer.MAX_VALUE;
			int min_val = Math.min(cur_a, Math.min(cur_b, cur_c));
			if (min_val == cur_a) {
				i++; 
				count++;
			}	
			if (min_val == cur_c) {
				k++;
				count++;
			}
			if (min_val == cur_b) {
				j++;
				count++;
			}
			if (count >= 2) {
				ans.add(min_val); // this way the array we obtain will be sorted in descending order
			}
		}
		//print the len of array list as well the contents of array list in new Line
		System.out.println(ans.size());
		for (int x : ans) {
			System.out.println(x);
		}
	}
}