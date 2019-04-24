import java.util.*;
class CodeChef3 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		int T = kb.nextInt();
		while (T-- > 0) {
			int a = kb.nextInt();
			int b = kb.nextInt();
			// array -> Matrix of axb
			char [][]matrix = new char[a][b]; 
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++)
					matrix[i][j] = '.';
			}
			int k = kb.nextInt();
			while (k-- > 0) {
				// first and sec
				int a1 = kb.nextInt();
				int a2 = kb.nextInt();
				matrix[a1-1][a2-1] = 'X';
			}
			int count = 0;
			for (int i = 0; i < a; i++) {
				for (int j = 0; j < b; j++) {
					if (matrix[i][j] == 'X') {
						// check for corner cases first
						if (i == 0 && j == 0) {
							// check for right down only
							count += 2; // for top and left side boundary
							if (matrix[i+1][j] != 'X') {
								count++;
							}
							if (matrix[i][j+1] != 'X')
								count++;
						}else if (i == 0 && j == b-1) {
							// check for down only
							count += 2;
							if (matrix[i+1][j] != 'X') {
								count++;
							}
							if (matrix[i][j-1] != 'X') {
								count++;
							}
						}else if (j == 0 && i == a-1) {
							// check for right only
							count += 2;
							if (matrix[i][j+1] != 'X')
								count++;
						}else if (i == a-1 && j == b-1) {
							// check for notinh
							count += 2;
						}else if (i != 0 && j == 0) {
							// for extreme left
							count++;
							if (matrix[i-1][j] != 'X') {
								count++;
							}
							if (matrix[i][j+1] != 'X')
								count++;
							if (matrix[i+1][j] != 'X')
								count++; 
						}else if (i != 0 && j == b-1) {
							count++;
							if (matrix[i-1][j] != 'X') {
								count++;
							}
							if (matrix[i][j-1] != 'X')
								count++;
							if (matrix[i+1][j] != 'X')
								count++;
						}else if (i == a-1 && j != 0) {
							count++;
							if (matrix[i][j-1] != 'X')
								count++;
							if (matrix[i-1][j] != 'X')
								count++;
							if (matrix[i][j+1] != 'X')
								count++;

						}
						else {
							// check for left right top bottom
							if (matrix[i][j-1] != 'X')
								count++;
							if (matrix[i-1][j] != 'X')
								count++;
							if (matrix[i][j+1] != 'X')
								count++;
							if (matrix[i+1][j] != 'X')
								count++;
						}

					}else {
						continue;
					}
				}
				
			}
			System.out.println(count);
		}
	}
}