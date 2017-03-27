import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;

public class KingsWar {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			// code
			int n = Integer.parseInt(str[0].trim());
			str = br.readLine().trim().split(" ");
			int arr[]=new int[n];
			int i=0;
			for(String st:str)
				arr[i++]=Integer.parseInt(st);
			Arrays.sort(arr);
			int f=0,l=0;
			for(i=0;i<n;i++){
				if(i+1<n && arr[i]!=arr[i+1]){
					f=i;
					break;
				}
			}
			for(i=n-1;i>=0;i--){
				if(i-1>=0 && arr[i]!=arr[i-1]){
					l=i;
					break;
				}
			}
			/*System.out.println(n-(f+1)-(n-l));
			System.out.println(f+" "+l);*/
			int vl=n-(f+1)-(n-l);
			if(vl<=0)
				pw.println(0);
			else
				pw.println(vl);
		}
		

		pw.flush();
		pw.close();
	}
}