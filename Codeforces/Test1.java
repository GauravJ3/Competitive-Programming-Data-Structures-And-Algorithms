import java.util.*;
import java.io.*;
public final class Test1 {
    public static double calAns(int []dis, int []speed) {
        double left = 0;
        double right = 1000000000;
        // calculate to 7 digits precision
        while (left < right - 0.0000001) {
            double mid = (left+right)/2;
            if (canMeet(mid, dis, speed)) {
                right = mid;
            }else {
                left = mid;
            }
        }
        return right;
    }  
    public static boolean canMeet(double t, int []dis, int []speed) {
        // Let us first move all of the folks at nortmost point 
        // keep track of soutmost/leftmost person
        double meetPoint = dis[0] + t*speed[0];
        for (int i= 1; i< dis.length; i++) {
            meetPoint = Math.min(meetPoint, dis[i] + t*speed[i]);
        }
        // now let us see if everyone can reach at this soutmost position 
        // at this 
        for (int i = 0; i < dis.length; i++) {
            if (dis[i] - t*speed[i] > meetPoint) return false;
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        int []x = new int[n];
        String s[] = bf.readLine().split(" ");
        for (int i = 0; i< n; i++) {
            x[i] = Integer.parseInt(s[i]);
        }
        int []y = new int[n];
        String s1[] = bf.readLine().split(" ");
        for (int i = 0; i< n; i++) {
            y[i] = Integer.parseInt(s1[i]);
        }
        double a = calAns(x, y);
        System.out.printf("%.7f",a);
    }
}