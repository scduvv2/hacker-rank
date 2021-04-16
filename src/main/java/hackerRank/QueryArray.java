package hackerRank;
import java.io.IOException;

public class QueryArray {

	private static String nmString = "5 3";
	private static String[] queryString = {
			"1 2 100", "2 5 100", "3 4 100"
	};

	// Complete the arrayManipulation function below.
	static long arrayManipulation(int n, int[][] queries) {

		long array[] = new long[n + 2];
		for (int[] query : queries) {
			int startIndex = query[0];
			int endIndex = query[1];
			int additiveValue = query[2];
			array[startIndex] = array[startIndex] + additiveValue;
			array[endIndex + 1] = array[endIndex + 1] - additiveValue;

		}
		for (int i = 1; i < array.length; i++) {

			array[i] = array[i - 1] + array[i];
		}
		long biggestValue = 0;
		for (long value : array) {
			if (value > biggestValue) {
				biggestValue = value;
			}
		}
		System.out.println(biggestValue);
		return biggestValue;
	}

	public static void main(String[] args) throws IOException {

		String[] nm = nmString.split(" ");

		int n = Integer.parseInt(nm[0]);

		int m = Integer.parseInt(nm[1]);

		int[][] queries = new int[m][3];

		for (int i = 0; i < m; i++) {
			String[] queriesRowItems = queryString[i].split(" ");

			for (int j = 0; j < 3; j++) {
				int queriesItem = Integer.parseInt(queriesRowItems[j]);
				queries[i][j] = queriesItem;
			}
		}

		long result = arrayManipulation(n, queries);

	}
}
