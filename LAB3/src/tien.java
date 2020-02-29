import java.util.Scanner;

public class tien {

	public static void main(String[] args) {
		 int i = 100 ;
		    int j = 30 ;
		    String s = (i%j==0) ? "a chia het cho b" : "a khong chia het cho b \n";
		    System.out.print(s);
		    Scanner scaner = new Scanner(System.in);
		        System.out.println("Nhap so: ");
		       int number;
		       boolean flag = true;
		       String s1 = "00";
		        while(flag) {
		   
		             number =scaner.nextInt();      
		            switch (number) {
		                case 1:
		                    System.out.println("H?c nhi?u ngu nhi?u \n");
		                    break;
		                case 2:
		                    System.out.println("H?c ít ngu ít \n");
		                    break;
		                case 3:
		                    System.out.println("Không h?c không ngu \n");
		                    break;
		                case 00:
		                	System.out.println(" thoat cmnl \n");
		                flag=false;
		                	 break;
		                default: 
		                System.out.println("Nh?p cung ngu \n ");
		               
		            }
		        }        
	}

}
