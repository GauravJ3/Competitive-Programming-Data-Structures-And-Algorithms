import java.util.*;
public final class Test {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int T = kb.nextInt();
		int a = kb.nextInt();
		int b = kb.nextInt();
		int c = kb.nextInt();
		if (a == 3 && b == 2 || a == 2 && b == 3 || b == 2 && c == 3 ||c == 2 && b == 3) {
			System.out.println("Infinite");
		}else {
			System.out.println("Finite");
		}
	}
}