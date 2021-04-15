import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CloudMigration {

	private static int n = 7;
	private static String line = "0 0 1 0 0 1 0";

	// Complete the jumpingOnClouds function below.
	static int jumpingOnClouds(int[] c) {

		int jumps = 0;
		for (int i = 0; i < c.length-1; i++) {
			jumps++;
			if (i+2<c.length &&c[i + 2] == 0) {
				// increase the index by 1 and the loop will increase one more;
				i++;
			}
			
		}
		System.out.print(jumps);
		return jumps;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		int[] c = new int[n];

		String[] cItems = line.split(" ");

		for (int i = 0; i < n; i++) {
			int cItem = Integer.parseInt(cItems[i]);
			c[i] = cItem;
		}

		int result = jumpingOnClouds(c);

	}
}
