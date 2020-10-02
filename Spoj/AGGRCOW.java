import java.util.*;
import java.lang.*;
import java.lang.ProcessBuilder.Redirect;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Scanner s = new Scanner(System.in);
		int  numbercases = Integer.parseInt(reader.readLine());
		while(numbercases>=1)
		{
			String[] numcowsystalls = (reader.readLine()).split(" ");
			int N = Integer.parseInt(numcowsystalls[0]);
			int C =Integer.parseInt(numcowsystalls[1]);
			long[] xi= new long[N];
			for (int i = 0; i < N; i++) {
 
				xi[i]=Long.parseLong(reader.readLine());
			}
			Arrays.sort(xi); 
			int res = -2; 
			long left = xi[0], right = xi[N-1]; 
			while (left < right) 
			{ 
				long mid = (left + right)/2; 
				boolean puedo = false;
				long pos = xi[0]; 
				int elements = 1; 
 
				for (int i=1; i<N; i++) 
				{ 
					if (xi[i] - pos >= mid) 
					{ 
						pos = xi[i]; 
						elements++; 
						if (elements == C) 
						{
							puedo= true; 
						}
					} 
				} 
				if (puedo) 
				{ 
					res = (int) Math.max(res, mid); 
					left = mid + 1; 
				} 
				else {
					right = mid; 
				}
			} 
 
			System.out.println((int)res) ; 
			numbercases--;
 
		} 
		reader.close();
	}
}  