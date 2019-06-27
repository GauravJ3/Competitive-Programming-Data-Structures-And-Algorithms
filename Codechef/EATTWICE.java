import java.util.*;
import java.io.*;
class EATTWICE {
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(bf.readLine());
		while(T-- >0) {
			String s[] = bf.readLine().split(" ");
			int N = Integer.parseInt(s[0]);
			int M = Integer.parseInt(s[1]);
			int []D = new int[N];
			int []V = new int[N];
			/*			 
			 => 3 6
				
				5 7
				1 9
				2 5
				
			 => 3 7
				
				5 8
				2 5
				5 10
			*/
			// for every D[i] -> find max V[i]
			
			HashMap<Integer, Integer> hash = new HashMap<>();  // HashMap to store Days and value
			for (int i = 0; i <N; i++) {
				String []st = bf.readLine().split(" ");
				D[i] = Integer.parseInt(st[0]); // storing day
				V[i] = Integer.parseInt(st[1]); // storing value
				// take this 
				if (hash.containsKey(D[i])) {
					int oldVal = hash.get(D[i]);
					if (oldVal < V[i]) {
						hash.put(D[i], V[i]);
					}
				}else {
					// we're encountering new D[i]
					hash.put(D[i], V[i]);
				}
			}
			// traverse the hashset and sum all the values
			int key[] = new int[hash.size()]; 
			int val[] = new int[hash.size()]; 
			int i = 0, max = Integer.MIN_VALUE;
			int maxIndex = -1; 
			int maxValues = 0;
			for (Map.Entry mapElement : hash.entrySet()) { 
    	        key[i] = (int)mapElement.getKey(); 
            	// Add some bonus marks 
            	// to all the students and print it 
            	val[i] = (int)mapElement.getValue();
            	if (max < val[i]) {
            		max = val[i];
            		maxIndex = i;
            	} 
          		i++;
          	}
          	// i will have the max value..
          	// max Index => the index where the max value is stored in val[i];
          	// Take this value
          	int first = key[maxIndex];
          	M = M - key[maxIndex];
          	maxValues += val[maxIndex];
          	val[maxIndex] = Integer.MIN_VALUE;
          	max = Integer.MIN_VALUE;
          	for (int j = 0; j < val.length; j++) {
          		if (val[j] > max && key[j] != first) {
          			max = val[j];
          			maxIndex = j;
          		}
          	}
          	// here we'll have the max values
          	maxValues += val[maxIndex];
          	System.out.println(maxValues);
		}
	}
}