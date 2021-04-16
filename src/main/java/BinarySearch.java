
public class BinarySearch {

	public static void main(String[] args) {

		int[] list = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println(findIndex(4, list));

	}

	private static int findIndex(int target, int[] list) {

		int left = 0;

		int right = list.length - 1;
		while (left <= right) {
			int middle = (right + left) / 2;

			if (target < list[middle]) {
				right = middle-1;
			} else if (target > list[middle]) {
				left = middle+1;
			} else {
				return middle;
			}
		}
		return -1;
	}
}
