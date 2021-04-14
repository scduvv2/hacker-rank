import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SalesByMatch {
	
	public static void main(String[] args) {
		int n=7;
		int[] ar= {10, 20, 20, 10, 10, 30, 50, 10, 20 };
		int countofpairs = sortSocks(ar,n);
		System.out.println(countofpairs);
	}

	private static int sortSocks(int[] ar, int n) {
		
		
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
		int socksPairs = 0;
		for (int i=0 ; i<ar.length-1 ; i++) {
			if(ar[i]==ar[i+1]) {
				socksPairs++;
				i++;
			}
			
		}
		
		return socksPairs;
	}

}
