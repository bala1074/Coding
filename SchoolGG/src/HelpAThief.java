import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;


public class HelpAThief {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			int nt=Integer.parseInt(str[0].trim());
			str = br.readLine().trim().split(" ");
			int n=Integer.parseInt(str[0].trim());
			str= br.readLine().trim().split(" ");
			int ai[]=new int[n],aj[]=new int[101],opt[]=new int[n];
			for(int i=0,ind=0;i<str.length;i+=2){
				ai[ind]=Integer.parseInt(str[i].trim());
				aj[Integer.parseInt(str[i+1].trim())]+=ai[ind];
				ind++;
			}
			//System.out.println(Arrays.toString(aj));
			int out=0;
			for(int i=100;i>=0;i--){
				if(aj[i]!=0){
					if(aj[i]<=n){
						out+=i*aj[i];
						n=n-aj[i];
					}
					else{
						out+=i*n;
						break;
					}
				}
			}


			pw.println(out);
		}

		pw.flush();
		pw.close();
	}
}
