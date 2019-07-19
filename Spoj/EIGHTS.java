/*
Link :- https://www.spoj.com/problems/EIGHTS/
Tag :- Easy
*/
class EIGHTS {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int N = kb.nextInt();
		while (N-->0) {
			long K = kb.nextLong();
			long ans = 192 + (K-1)*250;
			System.out.println(ans);
		}
	}
}