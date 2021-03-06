import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;


public class EncryptTheString {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str = br.readLine().trim()+"&";
			StringBuffer sb=new StringBuffer("");
			int preCount=0;
			char preChar = 0;
			for(int i=0;i<str.length();i++){
				if(preChar!=str.charAt(i)){
					if(i!=0)
					sb.append(preChar+""+preCount);
					preChar=str.charAt(i);
					preCount=1;
				}
				else{
					preCount++;
				}
			}
			//code

			pw.println(sb.reverse());
		}

		pw.flush();
		pw.close();
	}
}
