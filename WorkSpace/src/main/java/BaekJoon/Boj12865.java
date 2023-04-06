package BaekJoon;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Boj12865 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bag = 0;
        int bagWeight = 0;
        int N = sc.nextInt();
        int W = sc.nextInt();
        int items[][] = new int[N][2];
        for(int i = 0; i < N; i++) {
            items[i][0] = sc.nextInt();
            items[i][1] = sc.nextInt();
        }
        for(int i = 0; i < N; i++) {
            items[i][1] /= items[i][0];
        }
        for(int i = N-1; i >= 0; i--) {
            for(int j = 1; j <= items[i][0]; j++) {
                bag++;
                bagWeight += items[i][1];
                if(W == bag) {
                    break;
                }
            }
            if(W == bag) {
                break;
            }
        }
        System.out.println(bagWeight);
    }
}
