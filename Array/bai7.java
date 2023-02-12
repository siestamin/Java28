package Array;

import java.util.Scanner;

public class bai7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }  
        int min = (int) 1e9;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (Math.abs(array[i] - array[j]) < min ) {
                  min = Math.abs(array[i]- array[j]);

                } 
            }
            
        } System.out.println(min);
    }
    
}
