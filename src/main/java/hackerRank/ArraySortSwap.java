package hackerRank;
import java.io.IOException;

public class ArraySortSwap {

	private static String array = "4 3 1 2";
	private static int n = 4;
	private static boolean[] visited = new boolean[n];

	// Complete the minimumSwaps function below.
	static int minimumSwaps(int[] arr) {

		int swaps = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			visited[i] = true;
			if (i+1 == arr[i]) {
				continue;
			}
			while (arr[i]!=i+1) {
				if (!visited[arr[i]-1]) {
					swap(arr,i,arr[i]);
					swaps++;
				}
				print(arr);
				
			}
		}
		return swaps;
	}

	private static void print(int[] arr) {
		for (int j : arr) {
			System.out.print(j + " ");
		}
		System.out.println("\n");

	}

	private static void swap(int[] arr, int i, int index) {

		int tmp = arr[index - 1];
		arr[index - 1] = index;
		arr[i] = tmp;

	}

	public static void main(String[] args) throws IOException {

		String arrString[] = array.split(" ");
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			int val = Integer.parseInt(arrString[i]);
			arr[i] = val;
		}

		int res = minimumSwaps(arr);
		System.out.println(res);
	}
}
