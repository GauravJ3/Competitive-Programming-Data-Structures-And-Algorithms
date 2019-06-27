import java.util.*;
class DivisorGame_DP_1025 {
    public boolean divisorGame(int N, boolean flag) {
        if (flag && N == 2) return true;
        if (!flag && N == 2) return false;
        
        for (int i = 1; i <= N/2; i++) {
            if (N%i == 0) {
                return divisorGame(N-i, !flag);
            }
        }
        return false;
    }
    public boolean divisorGame(int N) {
        boolean flag = true;
        return divisorGame(N, flag);
    }
    public static void main(String []args) {
        Scanner kb = new Scanner(System.in);
        int N = kb.nextInt();
        if (divisorGame(N)) {
            System.out.println("Yes Alice Won");
        }else {
            System.out.println("No Alice Didn't Won..");
        }
    }    
    
}