package Trie;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

public class TrieInsertSearch {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));

		int t = Integer.parseInt(br.readLine().trim());
		while (t-- > 0) {
			String str = br.readLine().trim();
			//String sArr[]=br.readLine().trim().split(" ");
			int val = Integer.parseInt(str);
			//code it

			pw.println();
		}
		pw.flush();
		pw.close();
	}
}

class Trie{
	class TrieNode{
		boolean  isLeaf;
		TrieNode node[];
	}
	TrieNode root;
	public Trie() {

	}
	
	void  insert(String insert){
		// step1 create new trie node
		
		// step2 traverse and assign in right position
		
	}
	
	void search(String search){
		
	}
}