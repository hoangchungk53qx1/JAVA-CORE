
public class Solve_AvoidObstacles {
	
	static int avoidObstacles(int[] inputArray) {
		 for (int i = 1; ; i++) {
			            for (int j = 0; j < inputArray.length; j++) {
			                if (inputArray[j] % i == 0) {
			                    break;
			                }
			                if (j == inputArray.length - 1) {
			                    return i;
			                }
		             }
		 }
		}
	static int avoidObstacles1(int[] inputArray) {
		  int jump = 2;
		  int temp=jump;
		  boolean flag = false;
		  while (!flag) {
			  for(int i:inputArray) {
				  if(i%jump==0) {
					  jump++;
					  break;
				  }
				  flag = false;
			  }
			  
		  }
		  return jump;
		}
	static boolean evenDigitsOnly(int n) {
		boolean temp =true;
		    while(n>0&&temp){
		    if(n%2!=0){
		        return false;
		    }
		    n/=10;
		    }

		        return temp;
		}

	public static void main(String[] args) {
	//	int ;
		/*
		 * int[] inputArray= {5,3,6,7,9}; int x = avoidObstacles1(inputArray); for(int i
		 * =0;i<inputArray.length;i++) { }
		 * 
		 * System.out.println(x);
		 */
		boolean x =evenDigitsOnly(248622);
		System.out.println(x);
	}

}
