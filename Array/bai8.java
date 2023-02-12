package Array;

import java.util.Scanner;

public class bai8 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[] array = new int[n];
    for (int i = 0; i < array.length; i++) {
      array[i] = scanner.nextInt();
    }
    for (int i = 0; i < array.length; i++) {
      boolean flag = true;
      for (int j = 0; j < i; j++) {
        if (array[i] == array[j]) {
          flag = false;
          break;
        }
      }
      if (flag) {
        System.out.print(array[i] + " ");
      }
    }
  }
}
