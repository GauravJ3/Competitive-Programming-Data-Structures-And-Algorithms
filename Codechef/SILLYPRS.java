/*
    Problem Code :- "SILLYPRS"
    Time Complexity - O(N)
    Problem Link :- 
    Editorial Link :- https://discuss.codechef.com/t/sillyprs-editorial/29291

*/

import java.util.*;
class SILLYPRS {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int T = kb.nextInt();
        while (T-- > 0) {
            int N = kb.nextInt();
            int Ae = 0, Ao = 0, Be = 0, Bo = 0;
            int []A = new int[N];
            int []B = new int[N];
            int sum = 0;
            for (int i = 0; i < N; i++) {
                A[i] = kb.nextInt();
                if (A[i]%2 == 0) Ae++;
                else
                    Ao++;
            }
            for (int i = 0; i < N; i++) {
                B[i] = kb.nextInt();
                if (B[i]%2 == 0) Be++;
                else
                    Bo++;
            }
            
            for (int i = 0; i < N; i++) {
                sum += (A[i] + B[i])/2;
            }
            int evenPairs = Math.min(Ae, Be);   // number of even pairs
            int oddPairs = Math.min(Bo, Ao);   // number of odd pairs
            int p = N - (evenPairs+ oddPairs);
            sum = sum - p/2;
            System.out.println(sum);
        }
    }
}