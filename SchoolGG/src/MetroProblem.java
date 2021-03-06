import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class MetroProblem {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			//code
			int v=Integer.parseInt(str[0].trim());
			if(str[1].trim().charAt(0)=='D'){
				if(v<11){
					pw.print(v+11);
				}
				else if(v==11){
					pw.print(0);
				}
				else{
					pw.print(-(11-v));
				}
			}
			else{
				if(v<11){
					pw.print(11-v);
				}
				else if(v==11){
					pw.print(0);
				}
				else{
					pw.print(19-v+19-11);
				}
				
			}

			pw.println();
		}

		pw.flush();
		pw.close();
	}
}
