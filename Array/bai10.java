package Array;

import java.util.Scanner;

public class bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        } for (int i = 0; i < array.length; i++) {
            int left = 0; int right = 0;
            for (int j = 0; j < i; j++) {
                left += array[j];
                } 
                for (int j = i + 1; j < array.length; j++) {
                    right += array[j];
            } if ( primeNumber(left) && primeNumber(right)) {
                System.out.println(i);
            }
        } 
    }
    static boolean primeNumber( int n) {
        for (int i = 2; i < n; i++) {
            if ( n % i == 0) {
                return false;
            }
        } 
        return true;
    }
    
}
