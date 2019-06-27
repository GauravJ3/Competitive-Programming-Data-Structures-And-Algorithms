	/* we need to find 2 things:-
	1.) The maximum nesting depth of the brackets, and the position where it occurs
	2.) The maximum number of nesting brackets, position of first opening bracket where it occurs
	ex:- ()(())()(()())(()())
		        ^	
		                    i		count[1]   len[0]  max_len <- 4

	max_symbl = 0
	max_sybl_pos = 0;
	max_depth = 0;
	pos_max_depth = 0;
	for (i <- 0 to len) {
		if (opening bracket) :
		{	count++;
			
		}
		if (count > max_depth):
		{	max_depth = count;
			pos_max_depth = i+1	
		}
		if (closing bracket):
		{	count--;
			
		}
		len++;
		if (count == 0) {
			max_symbl <- len
			len <- 0
			max_sybl_pos = i+1-max_symbl;
		}	
	}
	*/
	/*
		ZCO Practice contest
		problem Link :- https://www.codechef.com/ZCOPRAC/problems/ZCO12001
		Hint :- Read Problem very slowley and try to dry run / pseudo code with patience, slowly.

	*/	

	import java.util.*;
	class ZCO12001 {
		public static void main(String[] args) {
			Scanner kb = new Scanner(System.in);
			int N = kb.nextInt();
			int []arr = new int[N];
			for (int i = 0; i< N; i++) arr[i] = kb.nextInt();
			int max_symbl = 0;
			int max_symbl_pos = 0;
			int max_depth = 0;
			int max_depth_pos = 0;
			int count = 0;
			int len = 0;
			for (int i = 0; i < N; i++) {
				if (arr[i] == 1) {
					// opening bracket
					count++;
				
				}else count--;
				len++;
				if (count > max_depth)
				{
					max_depth = count;
					max_depth_pos = i+1;		
				}
				if (count == 0) {
					if (max_symbl < len)
					{
						max_symbl = len;
						max_symbl_pos = i+2-max_symbl;
					}
					len = 0;
					
					//System.out.println("Max Symbol at pos " + (i+1) + " is " + max_symbl);
				}
			}
			System.out.println(max_depth +" " +max_depth_pos+" " + max_symbl+" "+max_symbl_pos);	
		}
	}
