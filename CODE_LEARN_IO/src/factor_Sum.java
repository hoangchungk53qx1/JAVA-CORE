
public class factor_Sum {
	private static int factorSum(int n) {

        int prevValue = 0,
                currentValue = 0,
                nextValue = n;

        do {
            int divisor = 2;
            currentValue = nextValue;
            prevValue = nextValue;
            nextValue = 0;
            while (divisor * divisor <= currentValue) {
                if (currentValue % divisor == 0) {
                    currentValue = currentValue/divisor;
                    nextValue += divisor;
                    System.out.println("nextvalue"  + " "+nextValue + " ");
                } else {
                    divisor++;
                    System.out.println("lan" + " " +divisor);
                }
            }
            nextValue += currentValue;
            System.out.println("nextvalue"  + " "+nextValue + " ");
        }
        while (nextValue != prevValue);
        System.out.println("prevValue" + prevValue);

        return nextValue;
    }
	 static boolean isLucky(int n) {
		  int tong1=0;
		  int tong2=0;
		     String s =Integer.toString(n);
		  char[] s1 = s.toCharArray();
		  for(int i=0;i<s1.length/2;i++){
		   tong1+=s1[i];
		   
		  }
		  for(int j = (s1.length/2);j<s1.length;j++){
		   tong2+=s1[j];
		  }
		  if(tong1==tong2)
		   return true;
		  else
		   return false;
		  
		}
	public static void main(String[] args) {
		System.out.println(isLucky(1230));

	}

}
