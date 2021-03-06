import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class SquaresInMatrix {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			//code
			long n=Long.parseLong(str[0].trim());
			long m=Long.parseLong(str[1].trim());
			
			long count=0;
			while(n>0&&m>0){
				count+=(n*m);
				n--;m--;
			}
			pw.println(count);
		}

		pw.flush();
		pw.close();
	}
}
