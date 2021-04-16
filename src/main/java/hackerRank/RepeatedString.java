package hackerRank;
import java.io.IOException;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RepeatedString {

	private static String s = "ababa";
	private static long n = 3;

	// Complete the repeatedString function below.
	static long repeatedString(String s, long n) {

		if (s.length() > n) {

			return findCount(s.substring(0, (int) n));
		}

		long repetationCount = n / s.length();
		long remainder =  n % s.length();
		int repeation = findCount(s);

		long count = repeation * repetationCount + findCount(s.substring(0, (int)remainder));
		return count;

	}

	private static int findCount(String s) {

		return s.chars().mapToObj(c -> (char) c).filter(a -> a == 'a').collect(Collectors.toList()).size();
	}

	private static final Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) throws IOException {

		long result = repeatedString(s, n);

		System.out.println(result);
	}
}
