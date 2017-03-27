import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class PatternCount101 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			String string=str[0].trim();
			boolean one=false,onezeros=false;
			int count101=0;
			for(int i=0;i<string.length();i++){
				//System.out.println(onezeros+" "+string.charAt(i));
				if(!onezeros&&string.charAt(i)=='1'){
					one=true;
				}
				else if(one&&string.charAt(i)=='0'){
					onezeros=true;
					one=false;
				}
				else if(onezeros&&string.charAt(i)=='0'){
					onezeros=true;
					one=false;
				}
				else if(onezeros&&string.charAt(i)=='1'){
					//System.out.println("jj");
					onezeros=false;
					one=true;
					count101++;
				}
				else
				{
					one=false;onezeros=false;
				}
				//System.out.println(onezeros);
			}
			//code

			pw.println(count101);
		}

		pw.flush();
		pw.close();
	}
}
