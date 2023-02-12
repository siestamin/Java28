package Array;

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int [n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        } int k = scanner.nextInt();
        int cnt = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ( arr[i] + arr[j] == k) {
                      cnt++;
                }
                
            }
        }
        System.out.println(cnt);
    }
}
