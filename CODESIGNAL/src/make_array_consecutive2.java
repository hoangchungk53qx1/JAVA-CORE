import java.util.Arrays;
import java.util.Scanner;

public class make_array_consecutive2 {
	public static Scanner scn = new Scanner(System.in);
 
	static int makeArrayConsecutive2(int[] statues1) {
		Arrays.sort(statues1);
		int numOfNeededStatues = 0;
		for (int i = 0; i < statues1.length - 1; i++) {
			numOfNeededStatues += statues1[i + 1] - statues1[i] - 1;
		}
		return numOfNeededStatues;
	}

	public static void main(String[] args) {
		int n = scn.nextInt();
		int satues1[] = new int[n];
		for (int i = 0; i < satues1.length; i++) {
			satues1[i] = scn.nextInt();
		}
		int  x = makeArrayConsecutive2(satues1);
			System.out.println(x);
	}
}
