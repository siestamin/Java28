package Array;
/* Cho mảng số nguyên A[] gồm N phần tử, nhiệm vụ của bạn là đếm xem trong mảng có bao nhiêu số chẵn, bao nhiêu số lẻ, tổng các phần tử là số chẵn, tổng các phần tử là số lẻ. */
import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int [] n = new int[a];
        for (int i = 0; i < n.length; i++) {
            n[i] = scanner.nextInt();
        } int le = 0 ; int chan = 0; int tongLe = 0; int tongChan= 0; 
        for (int i = 0; i < n.length; i++) {
            if ( n[i] % 2 == 0 ) {
                chan++;
                tongChan+=n[i];
            } else {
                le++;
                tongLe += n[i];
            }
            
        }
        System.out.println(chan);
        System.out.println(le);
        System.out.println(tongChan);
        System.out.println(tongLe);
    }
    
}
