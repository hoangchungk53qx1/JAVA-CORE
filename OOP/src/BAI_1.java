import java.util.Scanner;

public class BAI_1 {
	static Scanner scn  =new Scanner(System.in);
	static int sumOfMultiples(int n, int k) {
		int temp = 0;
		    while(temp<n){
		        for(int i =1 ;i <= n; i++ ){
		            if(i%k==0){
		                temp = temp + i;
		        }
		    }
		    }
		    return temp;
		}
	 private static String[] splitAddress(String address) {
	        String protocol = "",
	                domain = "",
	                context = "";
	        String[] result = address.split("://");

	        protocol = result[0];
	        result = result[1].split("\\.com");
	        domain = result[0];
	        if (result.length > 1) {
	            context = result[1].substring(1);
	            return new String[]{protocol, domain, context};
	        }
	        return new String[]{protocol, domain};
	    }

	public static void main(String[] args) {
		String x = scn.nextLine();
		
		splitAddress(x);
		for(int i =0;i<x.length();i++) {
			splitAddress(x);
		}

	}

}
