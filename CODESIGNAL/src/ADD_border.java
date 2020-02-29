import java.util.Arrays;
import java.util.Scanner;

public class ADD_border {
	static Scanner scn = new Scanner(System.in);
	static String[] addBorder(String[] picture) {
		
	    String[] matrix = new String[picture.length+2];
	    for (int i = 0; i < picture.length+2; i++) {
	        matrix[i] = "";
	    }
	    for (int i = 0; i < picture.length+2; i++) {
	        if (i == 0 | i == matrix.length-1)
	            for (int j = 0; j < picture[0].length()+2; j++) {
	                matrix[i] += "*";
	            }
	        else
	            matrix[i] = "*" + picture[i-1] + "*";  
	    }
	    return matrix;
	}
	static String[] addBorder1(String[] picture) {

	    String[] withBorder = new String[picture.length + 2];
	    
	    char[] topAndBottom = new char[picture[0].length() + 2];
	    
	    Arrays.fill(topAndBottom, '*');
	    
	    withBorder[0] = new String(topAndBottom);
	    withBorder[picture.length + 1] = new String(topAndBottom);
	    
	    for(int i = 0; i < picture.length; i++)
	    {
	        withBorder[i+1] = "*" + picture[i] + "*";
	    }
	    
	    return withBorder;
	}
	static String[] addBorder2(String[] picture) {    
	    int width = picture[0].length();
	    int height = picture.length;

	    String[] res = new String[height + 2];
	    String astRow;
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < width + 2; i++) {
	        sb.append("*");
	    }
	    res[height + 2 -1] = res[0] = sb.toString();
	    
	    for (int i = 0; i < picture.length; i++) {
	        StringBuilder sb2 = new StringBuilder();
	        sb2.append("*");
	        sb2.append(picture[i]);
	        sb2.append("*");
	        res[i + 1] = sb2.toString();
	    }    
	    return res;
	}


	public static void main(String[] args) {
		String [] inputArray= {"a*"};
		String[] x =addBorder2(inputArray);
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]);

}
	}
}
