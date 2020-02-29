import java.util.Scanner;

public class leastSignificantBit_solve {
	static public Scanner scn = new Scanner(System.in);
	static int leastSignificantBit(int n) {

		  int ans = 1;
		  while ((n & 1) == 0) {
		    n >>= 1;
		    ans <<= 1;
		  }

		  return ans;
		}
	static int factorialTrailingZeros(int n) {
		  int result = 0;
		  for (int i = 5; i <= n; i += 5) {
		    int number = i;
		    System.out.println(i);
		    while (number % 5 == 0) {
		      number /= 5;
		      System.out.println(number);
		      result++;
		      System.out.println(result);
		    }
		  }
		  return result;
		}
	static int factorialTrailingZeros1(int n) {
		int result=1;
		
		return result;
	}

	public static void main(String[] args) {
		int a = scn.nextInt();
		int x= factorialTrailingZeros(a);
		System.out.println("bit: " +" " + x);
	}

}
