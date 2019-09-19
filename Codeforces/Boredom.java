/**
 * Boredom - Codeforces Problem 
 * Problem link - http://codeforces.com/problemset/problem/455/A 
 * Tags - dp
 */ 
import java.util.*;
import java.io.*;
public final class Boredom {
    public static ArrayList<Integer> removeAll(ArrayList<Integer> arr, int ele) {
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < arr.size(); i++) {
            ans.add(arr.get(i));
        }
        for (int i = 0; i < ans.size(); i++) {
            if ((ans.get(i) == ele+1) || (ans.get(i) == ele-1)) {
                ans.remove(i);
            }
        }
        for (int i = 0; i < ans.size(); i++) {
            if (ans.get(i) == ele) ans.remove(i);
        }
        return ans;
    }
    public static int calAns(ArrayList<Integer> arr,int st, int en) {
        if (arr.size() == 0) return 0;
        
        if (st > en) return 0;
        if (st == en) return arr.get(st);
        // taking arr[st]
        ArrayList<Integer> arr1 = removeAll(arr, arr.get(st));
        ArrayList<Integer> arr2 = removeAll(arr, arr.get(en));
        return Math.max(arr.get(st) + calAns(arr1, st+1, en) , arr.get(en) + calAns(arr2, st, en-1));
    }
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());
        String s[] = bf.readLine().split(" ");
        ArrayList<Integer>arr = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            arr.add(Integer.parseInt(s[i]));
        }
        int ans = calAns(arr, 0, N-1);
        System.out.println(ans);
    }
}