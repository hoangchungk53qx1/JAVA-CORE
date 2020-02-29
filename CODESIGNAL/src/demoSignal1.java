
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class demoSignal1 {

	public static void main(String[] args) {
		String s1 = "aabcc", s2 = "adcaa";

		System.out.println(sloveSort(s1, s2));
		System.out.println(sloveArray(s1, s2));
		System.out.println(sloveCollections(s1, s2));
	}

	public static String sortString(String text) {
		
		char[] tmp = text.toCharArray();
		Arrays.sort(tmp);
		return new String(tmp);
	}

	private static int sloveSort(String s1, String s2) {
		s1 = sortString(s1);
		s2 = sortString(s2);

		int i = 0, j = 0;
		int res = 0;
		while (i < s1.length() && j < s2.length()) {
			if (s1.charAt(i) == s2.charAt(j)) {
				res++;
				i++;
				j++;
			} else if (s1.charAt(i) > s2.charAt(j)) {
				j++;
			} else
				i++;
		}

		return res;
	}
	public static int[] convertStringToArrayInt(String text) {
		int[] res = new int[26];

		for (int i = 0; i < text.length(); i++) {
			res[text.charAt(i) - 'a']++;
		}
		return res;
	}
	private static int sloveArray(String s1, String s2) {
		int res = 0;

		int[] x = convertStringToArrayInt(s1);
		int[] y = convertStringToArrayInt(s2);

		for (int i = 0; i < 26; i++) {
			res += Math.min(x[i], y[i]);
		}

		return res;
	}

	

	private static int sloveCollections(String s1, String s2) {
		int res = 0;

		Map<Character, Integer> m1, m2;
		m1 = convertStringToMap(s1);
		m2 = convertStringToMap(s2);

		for (char i = 'a'; i <= 'z'; i++) {
			if (m1.containsKey(i) && m2.containsKey(i))
				res += Math.min(m1.get(i), m2.get(i));
		}

		return res;
	}

	public static Map<Character, Integer> convertStringToMap(String text) {
		Map<Character, Integer> m = new HashMap<>();

		for (int i = 0; i < text.length(); i++) {
			if (m.containsKey(text.charAt(i)) == false) {
				m.put(text.charAt(i), 1);
			} else {
				int num = m.get(text.charAt(i));
				m.put(text.charAt(i), num + 1);
			}
		}
		return m;
	}
}

