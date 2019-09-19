import java.io.*;
import java.util.*;
public final class Solution {
    public static void main(String[] args) throws IOException{
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        String s[] = bf.readLine().split(" ");
        // length of the queue of children
        int len = Integer.parseInt(s[0]);
        // number of time we need to swap/change BG
        int t = Integer.parseInt(s[1]);
        // the queue of children
        String que = bf.readLine();
        while (t-- > 0) {
            char []ch = que.toCharArray(); 
            int j = 1;
            for (int i = 0; i < ch.length-1; i++, j++){
                if (ch[i] == 'B' && ch[j] == 'G') {
                    // swap
                    char c = ch[i];
                    ch[i] = ch[j];
                    ch[j] = c; 
                    i++;
                    j++;
                }
            }
            String str = new String(ch);
            que = str;
        }
        System.out.println(que);
    }
} 