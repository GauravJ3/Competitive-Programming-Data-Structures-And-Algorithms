import java.util.*;
import java.io.*;
public final class Kefka {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String s[] = bf.readLine().split(" ");
        int []arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(s[i]);
        }
        int []lis = new int[N];
        lis[0] = 1;
        int ans = 1;
        for (int i = 1; i< N; i++) {
            if (arr[i] >= arr[i-1]) {
                lis[i] = lis[i-1] + 1;
            }else {
                lis[i] = 1;
            }
            ans = Math.max(ans, lis[i]);
        } 
        System.out.println(ans);
    }
}