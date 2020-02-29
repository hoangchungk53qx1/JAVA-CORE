import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class thua_so_nguyen_to {
	private static Scanner scanner = new Scanner(System.in);
    
    /**
     * main
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.print("Nhập số nguyên dương n = ");
        int n = scanner.nextInt();
        // phân tích số nguyên dương n
        List<Integer> listNumbers = phanTichSoNguyen(n);
        // in kết quả ra màn hình
        System.out.printf("Kết quả: %d = ", n);
        int size = listNumbers.size();
        for (int i = 0; i < size - 1; i++) {
            System.out.print(listNumbers.get(i) + " x ");
        }
        System.out.print(listNumbers.get(size - 1));
    }
     
    /**
     * Phân tích số nguyên thành tích các thừa số nguyên tố 
     * 
     * @param positiveInt
     * @return
     */
    public static List<Integer> phanTichSoNguyen(int n) {
        int i = 2;
        List<Integer> listNumbers = new ArrayList<Integer>();
        // phân tích
        while (n > 1) {
            if (n % i == 0) {
                n = n / i;
                listNumbers.add(i);
            } else {
                i++;
            }
        }
        // nếu listNumbers trống thì add n vào listNumbers
        if (listNumbers.isEmpty()) {
            listNumbers.add(n);
        }
        return listNumbers;
    }
}

