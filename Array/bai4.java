package Array;
import java.util.Scanner;
public class bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        } int x= scanner.nextInt();
         int lon = 0; int nho = 0;
        for (int i = 0; i < array.length; i++) {
            if ( array[i] > x) {
                lon++;
            } else if ( array[i] < x ) {
                nho++;
            }
        }
      System.out.println(nho);
      System.out.println(lon);
    }
}
