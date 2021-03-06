import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class SPECIES {
	static boolean visited[][];
	static int countQ=0;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			// code
			int n = Integer.parseInt(str[0].trim());

			char arr[][] = new char[n][n];
			String ar[]=new String[n];
			for (int i = 0; i < n; i++) {
				ar[i]=br.readLine().trim();
				arr[i] = ar[i].toCharArray();
			}
			//visited = new boolean[n][n];
			//findCount(arr, n);
			countBGP(ar,n);
			
			pw.println();
		}

		pw.flush();
		pw.close();
	}

	private static void countBGP(String arr[], int n) {
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				if(arr[j].contains("?B")||arr[j].contains("?P")||arr[j].contains("B?")||arr[j].contains("P?")){
					
				}
			}
		}
		
	}

	private static void findCount(char[][] arr, int n) {

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (arr[i][j] == '?') {
					countQ=0;
					dfs(arr, i, j, n);
				}
			}
		}

	}

	private static int dfs(char[][] arr, int i, int j, int n) {
		visited[i][j] = true;
		if (arr[i][j] == '?') {
			countQ++;
			if (j - 1 >= 0 && !visited[i][j - 1]) {
				// visited[i][j - 1]=true;
				dfs(arr, i, j, n);

			}
			if (i - 1 >= 0 && !visited[i - 1][j]) {
				// visited[i-1][j]=true;

			}
			if (j + 1 < n && !visited[i][j + 1]) {
				// visited[i][j+1]=true;
			}
			if (i + 1 < n && !visited[i + 1][j]) {
				// visited[i + 1][j]=true;
			}
		}
		else if(arr[i][j]=='.'){
			
		}
		else{
			return 1;
		}
		return 0;

	}
}
