import java.util.*;
class Test {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int T = kb.nextInt();
		while (T-- > 0) {
			String s[] = kb.next().split(" ");
			int a = Integer.parseInt(s[0]);
			int b = Integer.parseInt(s[1]);
			int ans = lastDigit(a, b);
			System.out.println(ans);
		}
	}
}