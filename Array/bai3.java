package Array;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int [n];
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        } int cnt = 0; int min = (int) 1e9;
        for (int i = 0; i < array.length; i++) {
            if ( min > array[i]) {
                min = array[i];
            }
        } for (int i = 0; i < array.length; i++) {
            if ( array[i] == min) {
                cnt++;
            }
        } System.out.println(cnt);
    }
    
}
