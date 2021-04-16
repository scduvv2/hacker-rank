package hackerRank;
import java.util.HashMap;
import java.util.Map;

public class RansomNote {

	private static String mnString = "6 5";
	private static String magString = "two times three is not four";

	private static String noteString = "two times two is four";

	// Complete the checkMagazine function below.
	static void checkMagazine(String[] magazine, String[] note) {

		Map<String, Integer> magMap = new HashMap<>();
        for(String magString : magazine){
            if(magMap.get(magString)==null){
                magMap.put(magString,Integer.valueOf(0));
            }
			Integer increasedValue = magMap.get(magString) + 1;
			magMap.put(magString,increasedValue);
        }

            for(int j=0;j<note.length;j++){
				if (magMap.get(note[j]) == null || magMap.get(note[j]) == 0) {
                     System.out.println("No");
                    return;
               }
				magMap.put(note[j], magMap.get(note[j]) - 1);
            }
           
            System.out.println("Yes");
	}

	public static void main(String[] args) {

		

		String[] mn = mnString.split(" ");
		
		int m = Integer.parseInt(mn[0]);

		int n = Integer.parseInt(mn[1]);

		String[] magazine = new String[m];

		String[] magazineItems = magString.split(" ");

		for (int i = 0; i < m; i++) {
			String magazineItem = magazineItems[i];
			magazine[i] = magazineItem;
		}

		String[] note = new String[n];

		String[] noteItems = noteString.split(" ");

		for (int i = 0; i < n; i++) {
			String noteItem = noteItems[i];
			note[i] = noteItem;
		}

		checkMagazine(magazine, note);

	}
}
