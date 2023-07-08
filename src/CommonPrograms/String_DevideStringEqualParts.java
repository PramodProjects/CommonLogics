package CommonPrograms;

import java.util.Arrays;

public class String_DevideStringEqualParts {

	public static void main(String[] args) {
		String str = "aaaaabbbbbccccc";
		int n = 3;
		int len = str.length();
		int incrmt = len / n;
		String[] parts = new String[n];
		int counter = 0;

		if (len % n != 0) {
			System.out.println("Sorry this string cannot be divided into " + n + " equal parts.");
		} else {
			for (int i = 0; i < str.length(); i = i + incrmt) {
				parts[counter] = str.substring(i, i + incrmt);
				counter++;
			}
			System.out.println(Arrays.toString(parts));
		}

	}

}
