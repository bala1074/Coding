import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;


public class NumberOfUniquePaths {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		//NOfUniquePaths(2,3);
		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			//code
			NOfUniquePaths(Integer.parseInt(str[0].trim()),Integer.parseInt(str[1].trim()));
			//pw.println();
		}

		pw.flush();
		pw.close();
	}
	public static int NOfUniquePaths(int m,int n){
		//m=15;n=15;
		int dp[][]=new int[m+1][n+1];
		
		for(int i=0;i<=m;i++)
			dp[i][0]=1;
		for(int i=0;i<=n;i++)
			dp[0][i]=1;
		
		for(int i=1;i<=m;i++){
			for(int j=1;j<=n;j++){
					dp[i][j]=dp[i][j-1]+dp[i-1][j];
			}
		}
		System.out.println(dp[m-1][n-1]);
		return n;
		
	}
}