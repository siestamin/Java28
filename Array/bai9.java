package Array;

import java.util.Scanner;

public class bai9 {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int [n];
        boolean flag = true;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        for (int i = 0; i < n; i++) {
            flag = true;
            for (int j = 0; j < i; j++) {
                if ( array[i] == array[j]) {
                    flag = false;
                    break;
                }
            }
            if ( flag ) {
                int cnt = 1;
                for (int j = i + 1; j < array.length; j++) {
                    if ( array[i] == array[j]) {
                        cnt++;
                    }
                }
                System.out.println( array[i] + " " + cnt );
            }
        }
    }
}
