package Array;

import java.util.Scanner;

public class bai2 {
    public static boolean nt( int n ) {
        if ( n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if ( n % i == 0 ) {
                return false ;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        } int cnt = 0; int sum = 0;
        for (int i = 0; i < n; i++) {
            if ( nt(array[i])) {
                cnt++;
                sum += array[i];
            }
        } System.out.printf("%.3f",(double)sum/cnt);
    }
}
