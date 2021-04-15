import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RotateArray {

    private static String ndStr = "5 4";
	private static String arrayString = "1 2 3 4 5";
	

	// Complete the rotLeft function below.
    static int[] rotLeft(int[] a, int d) {

    	int[] rotatedArray =new  int[a.length];
    	
    	for(int i=d,j=0;i<a.length ;i++,j++) {
    		rotatedArray[j]=a[i];
    	}
    	for (int i=0,j=a.length-d;i<d;i++,j++) {
    		rotatedArray[j]=a[i];
    	}
    	

		return rotatedArray;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        String[] nd = ndStr.split( " ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = arrayString.split(" ");
        

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] result = rotLeft(a, d);
        for(int i=0;i<result.length;i++) {
    		System.out.println(result[i]);
    	}

    }
}
