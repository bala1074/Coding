import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.Arrays;

class CHEFCODE {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
	static PrintWriter outputFile;
	static StringBuilder output = new StringBuilder("");

	// 0-D
	private static int readInt() throws NumberFormatException, IOException {
		return Integer.parseInt(br.readLine().trim());
	}

	private static long readLong() throws NumberFormatException, IOException {
		return Long.parseLong(br.readLine().trim());
	}

	private static String readStr() throws NumberFormatException, IOException {
		return br.readLine().trim();
	}

	private static float readFloat() throws NumberFormatException, IOException {
		return Float.parseFloat(br.readLine().trim());
	}

	private static double readDouble() throws NumberFormatException, IOException {
		return Double.parseDouble(br.readLine().trim());
	}

	private static char readChar() throws NumberFormatException, IOException {
		return br.readLine().trim().charAt(0);
	}

	// 1-D
	private static String[] readStrArr() throws NumberFormatException, IOException {
		return br.readLine().trim().split(" ");
	}

	private static int[] readIntArr() throws NumberFormatException, IOException {
		String[] sarr = readStrArr();
		int arr[] = new int[sarr.length];
		int i = 0;
		for (String str : sarr)
			arr[i++] = Integer.parseInt(str.trim());
		return arr;
	}

	private static BigInteger[] readLongArr() throws NumberFormatException, IOException {
		String[] sarr = readStrArr();
		BigInteger arr[] = new BigInteger[sarr.length];
		int i = 0;
		for (String str : sarr)
			arr[i++] = new BigInteger(str.trim());
		return arr;
	}

	private static float[] readFloatArr() throws NumberFormatException, IOException {
		String[] sarr = readStrArr();
		float arr[] = new float[sarr.length];
		int i = 0;
		for (String str : sarr)
			arr[i++] = Float.parseFloat(str.trim());
		return arr;
	}

	private static double[] readDoubleArr() throws NumberFormatException, IOException {
		String[] sarr = readStrArr();
		double arr[] = new double[sarr.length];
		int i = 0;
		for (String str : sarr)
			arr[i++] = Double.parseDouble(str.trim());
		return arr;
	}

	// 2-D
	private static String[][] readStrMatrix(int n, int m) throws NumberFormatException, IOException {
		String str[][] = new String[n][m];
		int _n = n, i = 0;
		while (_n-- > 0) {
			str[i++] = br.readLine().trim().split(" ");
		}
		return str;
	}

	private static int[][] readIntMatrix(int n, int m) throws NumberFormatException, IOException {
		int arr[][] = new int[n][m];
		for (int i = 0; i < n; i++) {
			arr[i] = readIntArr();
		}
		return arr;
	}

	private static float[][] readFloatMatrix(int n, int m) throws NumberFormatException, IOException {
		float arr[][] = new float[n][m];
		for (int i = 0; i < n; i++) {
			arr[i] = readFloatArr();
		}
		return arr;
	}

	private static double[][] readDoubleMatrix(int n, int m) throws NumberFormatException, IOException {
		double arr[][] = new double[n][m];
		for (int i = 0; i < n; i++) {
			arr[i] = readDoubleArr();
		}
		return arr;
	}

	// OUTPUT
	// save output in a file
	public static void outputFile() throws FileNotFoundException {
		// path of output file /home/binjarapu/Desktop/CodeOutputs
		outputFile = new PrintWriter(new FileOutputStream(new File("/home/binjarapu/Desktop/CodeOutputs/output.txt")));
		outputFile.println(output);
		outputFile.flush();
		outputFile.close();
	}

	// show console output
	public static void outputConsole() throws FileNotFoundException {
		pw.print(output);
		pw.flush();
		pw.close();
	}

	public static void main(String[] args) throws Exception {
		solve();
	}

	// CodeJam format pw.println("Case #" + test + ":");
	// append output with output globale variable
	static BigInteger k, arr[];
	static int n;

	/* static long dp[][]; */
	private static void solve() throws Exception {
		BigInteger tarr[] = readLongArr();
		n = tarr[0].intValue();
		k = tarr[1];
		arr = readLongArr();
		Arrays.sort(arr);

		long count = 0;
		for (int i = n - 1; i >= 0; i--) {
			BigInteger vm = BigInteger.valueOf(1);
			boolean yes = true;
			long pow = (long) Math.pow(2, i + 1)-1;
			for (int j = i; j >= 0; j--) {
				vm = vm.multiply(arr[j]);
				if (vm.compareTo(k) > 0 && j == i) {
					long pnow = (long) (Math.pow(2, j));
					pow = pow - pnow;
					yes = false;
					if (pow < 0)
						break;
					else
						count += pnow;
					break;
				} else if (vm.compareTo(k) > 0) {
					// System.out.println(j);
					long pnow = (long) (Math.pow(2, j));
					pow = pow - pnow;
					yes = false;
					if (pow < 0)
						break;
					else
						count += pnow;
					vm = vm.divide(arr[j]);
					// break;
				}
System.out.println(count+" "+pow+" "+i);
			}
			if (yes)
				break;
		}
		// System.out.println(count);
		System.out.println((long) Math.pow(2, n) - count - 1);

		/*
		 * dp=new long[n+1][n+1]; for(int i=1;i<=n;i++){ for(int j=1;j<=n;j++){
		 * if(i==j){ dp[i][j]=arr[j-1]; } else{ dp[i][j]=dp[i][j-1]*arr[j-1]; }
		 * } }
		 */
		// System.out.println(Arrays.deepToString(dp));

		/*
		 * count=0; rec(0,-1); pw.print(count); pw.flush();
		 */
		// outputFile();
	}

}