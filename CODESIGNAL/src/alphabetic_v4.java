
public class alphabetic_v4 {
	static String alphabetic(String inputString) {
		char[] arr = inputString.toCharArray();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == 'z') {
				arr[i] = 'a';
			} else {
				arr[i] = (char) (arr[i] + 1);
			}
		}

		return new String(arr);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		alphabetic("crazy");

	}

}
