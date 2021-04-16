package hackerRank;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {

	// Complete the twoStrings function below.
	static String twoStrings(String s1, String s2) {
		String bigString = "";
		String smallString = "";
		if (s1.length() > s2.length()) {
			bigString = s1;
			smallString = s2;
		} else {
			bigString = s2;
			smallString = s1;
		}
		List<String> bigStringIndex = new ArrayList<>();
		for (int i = 0; i < bigString.length() - 1; i++) {

		}

		String decision = "NO";

		if (bigString.indexOf(smallString) != -1) {
			return "YES";
		}

		return decision;
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int q = scanner.nextInt();
		scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

		for (int qItr = 0; qItr < q; qItr++) {
			String s1 = scanner.nextLine();

			String s2 = scanner.nextLine();

			String result = twoStrings(s1, s2);

			bufferedWriter.write(result);
			bufferedWriter.newLine();
		}

		bufferedWriter.close();

		scanner.close();
	}
}
