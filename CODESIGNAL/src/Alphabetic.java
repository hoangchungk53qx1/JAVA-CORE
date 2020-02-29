
public class Alphabetic {
	static String alphabeticShift(String inputString) {
	    int ascii = 0 ;
	    char []A = new char [inputString.length()] ;
	for ( int i = 0; i < inputString.length() ; i ++){

	    ascii = (int) inputString.charAt(i) ;
	    if ( ascii == 122) {
	        A[i] = (char) 97 ;
	    }else{
	     A[i]  =  (char) (ascii+1) ;   
	    }
	    System.out.print(A[i]) ;
	}
	    
	return new String(A);
	}


	public static void main(String[] args) {
		alphabeticShift("crazy");
	}

}
