import java.util.Scanner;

public class Solution {

	private static int n = 8;
	private static String line = "1 2 3 5 4 6 7 8";

	// Complete the minimumBribes function below.
	static void minimumBribes(int[] q) {
		int bribe = 0;
		for (int i = 0; i < q.length; i++) {
			if (q[i] > i + 1) {
				bribe = bribe + (q[i] - i + 1);
			}
		}

	}

	

	public static void main(String[] args) {

		int[] q = new int[n];

		String[] qItems = line.split(" ");
		for (int i = 0; i < n; i++) {
			int qItem = Integer.parseInt(qItems[i]);
			q[i] = qItem;
		}

		minimumBribes(q);

	}
}
