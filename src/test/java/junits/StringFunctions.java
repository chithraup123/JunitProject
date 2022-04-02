package junits;

public class StringFunctions {

	public static boolean isPalindrome(String str) {

		boolean ispalndrm = true;

		int start = 0;
		int end = str.length()-1;

		while (start < end) {

			if (str.charAt(start) != str.charAt(end)) {
				ispalndrm = false;
			}

			start++;
			end--;
		}

		return ispalndrm;
	}
}
