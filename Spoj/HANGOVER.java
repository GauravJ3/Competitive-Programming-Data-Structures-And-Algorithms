/*
  Link :- https://www.spoj.com/problems/HANGOVER/
  Tag :- Easy/observation
  PS: Pay close attention to "card(s)"
*/
import java.util.*;
class Test {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		float N;
		while ((N=kb.nextFloat())!=0.00) {
			int cards = 1;
			double f = 0.5;
			while (f < N) {
				f = f + Math.pow(((++cards)+1), -1);
			}
			System.out.println(cards + " card(s)");
		}
	}
}