package hackerRank;
import java.io.IOException;

public class ValleyCount {
	private static int steps = 8;
	private static String path = "UDDDUDUU";

	public static void main(String[] args) throws IOException {

		int result = countingValleys(steps, path);
		System.out.println(result);

	}

	public static int countingValleys(int steps, String path) {

		int downHill = 0;
		int upHill = 0;
		int vallies = 0;
		int altitude = 0;
		boolean inValley=false;
		if (path.charAt(0) == 'D') {
			downHill++;
			altitude--;
			inValley = true;
		}
		if (path.charAt(0) == 'U') {
			altitude++;
			upHill++;
		}

		for (int i = 1; i < steps; i++) {
			char previousStep = path.charAt(i - 1);
			char currentStep = path.charAt(i);

			if (path.charAt(i) == 'D') {
				downHill++;
				altitude--;
			}
			if (path.charAt(i) == 'U') {
				altitude++;
				upHill++;

			}
			if (altitude < 0) {
				inValley = true;
			}
			if (altitude == 0 && inValley) {
				vallies++;
				upHill = 0;
				downHill = 0;
				inValley=false;
			}

		}

		return vallies;
	}
}
