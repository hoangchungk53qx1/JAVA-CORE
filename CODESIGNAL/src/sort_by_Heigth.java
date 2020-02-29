import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class sort_by_Heigth {
	public static Scanner scn = new Scanner(System.in);
	static int[] sortByHeight(int[] a) {
	    ArrayList<Integer> list = new ArrayList<>();

	    for (int i = 0; i<a.length;i++) {
	        if (a[i] != -1) {
	            list.add(a[i]);
	        }
	    }

	    Collections.sort(list);

	    int index = 0;
	    for (int i = 0; i < a.length; i++) {
	        if (a[i] != -1) {
	            a[i] = list.get(index);
	            index++;
	        }
	    }

	    return a;
	}


	public static void main(String[] args) {
		int[] inputArray= {-1, 150, 190, 170,-1,-1,160,180};
		int[] x = sortByHeight(inputArray);
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);
		}
		
	}
	

}
