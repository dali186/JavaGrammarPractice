package Algorithm.BaekJoon;

import java.util.Scanner;

public class Boj2220 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] array = new int[n+1];


        for (int i=1; i<n; i++) {
            for (int j=i; j>1; j/=2) {
                array[j] = array[j/2];
            }

            array[1] = i+1;
        }

        array[n] = 1;
        for (int i=1; i<=n; i++) {
            System.out.print(array[i] + " ");
        }

    }
}