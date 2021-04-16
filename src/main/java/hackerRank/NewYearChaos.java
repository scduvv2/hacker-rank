package hackerRank;
import java.util.Scanner;

public class NewYearChaos {

	private static int n = 5;
	private static String line = "2 5 1 3 4";

	// Complete the minimumBribes function below.
	static void minimumBribes(int[] q) {
		int bribe = 0;
		for (int i = q.length - 1; i >= 0; i--) {
			if (q[i] != i + 1) {

				if (i - 1 >= 0 && q[i - 1] == i + 1) {
					swap(q, i, i - 1);
					bribe++;
				} else if (i - 2 >= 0 && q[i - 2] == i + 1) {
					q[i-2]=q[i-1];
					q[i-1]=q[i];
					q[i] =q[i-2];
					bribe += 2;
				} else {
					System.out.println("Too chaotic");
					return;
				}
			}
		}
		System.out.println(bribe);

	}

	private static void swap(int[] q, int i, int j) {
		int temp = q[i];
		q[i] = q[j];
		q[j] = temp;
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
