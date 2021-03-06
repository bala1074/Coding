import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class MultipleInTableTennis {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str[] = br.readLine().trim().split(" ");
			int k = Integer.parseInt(str[0].trim());
			str = br.readLine().trim().split(" ");
			int ram = Integer.parseInt(str[0].trim());
			int rohan = Integer.parseInt(str[1].trim());
			int sgt[] = new int[k], i = 0;
			str = br.readLine().trim().split(" ");
			int ramC = 0, rohanC = 0;
			for (String st : str) {
				sgt[i] = Integer.parseInt(st.trim());
				if (sgt[i] % ram == 0)
					ramC++;
				if (sgt[i] % rohan == 0)
					rohanC++;
				i++;
			}
			// System.out.println(ramC+" "+rohanC);
			if (ramC > rohanC) {
				pw.print("Ram");
			} else if (ramC < rohanC) {
				pw.print("Rohan");
			} else
				pw.print("Both");
			// code

			pw.println();
		}

		pw.flush();
		pw.close();
	}
}
