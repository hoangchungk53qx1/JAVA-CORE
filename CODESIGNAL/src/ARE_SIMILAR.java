import java.util.HashSet;
import java.util.Scanner;


public class ARE_SIMILAR {
	public static Scanner scn = new Scanner(System.in);
	static boolean areSimilar(int[] a,int[] b) {
	    int c = 0;
	    HashSet<Integer> s1 = new HashSet<Integer>();
	    HashSet<Integer> s2 = new HashSet<Integer>();
	    for(int i = 0;i < a.length;i++){
	        if(a[i] != b[i]){
	            c++;
	            s1.add(a[i]);
	            s2.add(b[i]);
	        }
	    }
	    if(c == 0) return true;
	    else if(c == 2 && s1.equals(s2)) return true;
	    else return false;
	}
	
	public static void main(String[] args) {
		int[] a= {-1, 150, 190};
		int [] b = {-1,150,170};
			areSimilar(a,b);	
			
}
}
		

