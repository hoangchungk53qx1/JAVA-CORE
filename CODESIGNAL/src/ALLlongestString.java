import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ALLlongestString {
	public static Scanner scn = new Scanner(System.in);
	static String[] allLongestStrings1(String[] inputArray) {
		int max = 0, t = 0, rl = 0;
		       for(int i = 0; i < inputArray.length; i++) {
		           if(inputArray[i].length() > max) {
		               max = inputArray[i].length();
		           }
		       }
		       for(int i = 0; i < inputArray.length; i++) {
		           if(inputArray[i].length() == max) rl++;
		       }
		       String[] result = new String[rl];
		       for(int i = 0; i < inputArray.length; i++) {
		           if(inputArray[i].length() == max) {
		               result[t] = inputArray[i];
		               t++;
		               System.out.println(result);
		           }
		       }
		       return result;
		    
		}
	static int[] sortByHeight(int[] a) {
	    ArrayList<Integer> list = new ArrayList<>();

	    for (int i : a) {
	        if (i != -1) {
	            list.add(i);
	        }
	    }

	    Collections.sort(list);

	    int index = 0;
	    for (int i = 0; i < a.length; i++) {
	        if (a[i] != -1) {
	            a[i] = list.get(index++);
	        }
	    }

	    return a;
	}
	//"aba", "aa", "ad", "vcd", "aba"
		 public static void main(String[] args) {
//			 int n = 10;
//				String s[] = new String[n];
//			
//			 for (String sx : s) {
//				 sx = scn.nextLine();
//			}
//			 String[] x = allLongestStrings1(s);
//				System.out.println(x);
		 String [] names = {"aba", "aa", "ad", "vcd", "aba"};
		
				 System.out.println(allLongestStrings1(names)[3]);
			// String[] x = allLongestStrings1(new String[]{"aba", "aa", "ad", "vcd", "aba"});
		//	 for (String string : x) {
		//		 System.out.println(string+ " ");
				
			}
		//		System.out.println(x);
			// System.out.println(allLongestStrings1(new String[]{"aba", "aa", "ad", "vcd", "aba"})[0]);
		}
	
	//}
