import java.io.*;
class Test {
	public static void main(String[] args) throws IOExeption{
		BufferedReader bf = new BufferedReader(new INputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		HashMap<String, Integer> hash = new HashMap<>();
		HashMap<String, String> h = new HashMap<>();
		String []arr = new String[N];
		while (T-->0) {
			int N = Integer.parseInt(bf.readLine());
			int a =N;
			while(a>0){
				String s[] = bf.readLine().split(" ");
				if (hash.containsKey(s[0]))
				{
					hash.put(s[0], hash.get(s[0])++);
				}	
				arr[N-a] = s[0]+ " " + s[1];
				a--;
				hash.put(s[0], 1);
			}
			int i = 0;
			for (String name : hash.keySet()) {
				if (hash.get(name) >= 2) {
					System.out.println( arr[i]);
				}else {
					System.out.println(name);
				}
				i++;
			}
		}

	}
}