/*
Link :- https://www.spoj.com/problems/EIGHTS/
Tag :- Easy
*/
class EIGHTS {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		float N;
		while ((N=kb.nextFloat())!=0.00) {
			int cards = 1;
			float f = 0.5;
			while (f < N) {
				f = f + (1/(++cards)+1);
			}
			System.out.println(ans);
		}
	}
}