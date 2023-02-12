package Array;

import java.util.Scanner;

public class bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array= new int[n];
        boolean chiChan= false;
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        } for (int i = 0; i < array.length; i++) {
            if ( i % 2 == 0 && array[i] % 2 == 0) {
                System.out.printf(array[i] + " ");
                chiChan= true;
            }
        } if (!chiChan) {
            System.out.println("NONE");
        }
    }
    
}
