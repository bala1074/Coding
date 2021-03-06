import java.io.*;
import java.util.*;

public class MathRect {
	public static void main(String[] args) throws Exception {
		// boolean rect[][]=new boolean[400][600];
		int R = 400, C = 600;
		boolean rect[][] = new boolean[R][C];
		int inp[][] = new int[][] { { 48, 192, 351, 207 }, { 48, 392, 351, 407 }, { 120, 52, 135, 547 },
				{ 260, 52, 275, 547 } };
		// int inp[][]=new int[][]{{0,292,399,307}};
		// int inp[][]=new int[][]{{0,0,1,1}};
		// System.out.println(Arrays.deepToString(inp));
		for (int i = 0; i < inp.length; i++) {
			for (int a = inp[i][0]; a <= inp[i][2]; a++) {
				for (int b = inp[i][1]; b <= inp[i][3]; b++) {
					rect[a][b] = true;
					// System.out.println(a+" "+b);
				}
			}
		}
		// System.out.println(Arrays.deepToString(rect));
		boolean visit[][] = new boolean[R][C];
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		for (int i = 0; i < 400; i++) {
			for (int j = 0; j < 600; j++) {
				if (!visit[i][j] && !rect[i][j]) {
					// BFS
					Stack<Node> bfs = new Stack();
					bfs.add(new Node(i, j));
					visit[i][j] = true;
					int count = 0;
					// check all directions
					while (bfs.size() > 0) {
						Node node = bfs.pop();

						int x = node.i, y = node.j;
						if (y - 1 >= 0)// left
							if (!visit[x][y - 1]) {
								visit[x][y - 1] = true;
								if (!rect[x][y - 1])
									bfs.add(new Node(x, y - 1));
							}
						if (y + 1 < 600)// right
							if (!visit[x][y + 1]) {
								visit[x][y + 1] = true;
								if (!rect[x][y + 1])
									bfs.add(new Node(x, y + 1));
							}
						if (x - 1 >= 0)// up
							if (!visit[x - 1][y]) {
								visit[x - 1][y] = true;
								if (!rect[x - 1][y])
									bfs.add(new Node(x - 1, y));
							}
						if (x + 1 < 400)// down
							if (!visit[x + 1][y]) {
								visit[x + 1][y] = true;
								if (!rect[x + 1][y])
									bfs.add(new Node(x + 1, y));
							}

						count++;
					}
					// System.out.println(count+" "+min+" "+max);
					if (max < count)
						max = count;

					if (min > count)
						min = count;

				}
			}
		}
		System.out.println(min + " " + max);
	}
}

class Node {
	int i, j;

	public Node(int i, int j) {
		this.i = i;
		this.j = j;
	}
}
