import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.List;

public class CamelCaese {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine().trim());
			String str[] = br.readLine().trim().split(" ");
			String pattren=br.readLine().trim();
			
			pw.println();
		}
		pw.flush();
		pw.close();
	}
}
class Trie{
	List<Trie> Nodes;
	
}
