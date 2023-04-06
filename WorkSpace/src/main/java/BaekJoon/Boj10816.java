package BaekJoon;

import java.util.Arrays;
import java.util.Scanner;

public class Boj10816 {
    static int value[];
    static int key[][];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        value = new int[N];
        for (int i = 0; i < N; i++) {
            value[i] = sc.nextInt();
        }

        int M = sc.nextInt();
        key = new int[M][2];
        for(int i = 0; i < M; i++) {
            key[i][0] = sc.nextInt();
        }
        Arrays.sort(value);

        for(int i = 0; i < M; i++) {
            BinarySearch(N, i);
        }

        for(int i = 0; i < M; i++) {
            System.out.print(key[i][1] + " ");
        }

    }

    public static void BinarySearch(int limit, int keyIndex) {

        int i = 0;

        while (i < limit) {
            if(value[i] == key[keyIndex][0]) {
                key[keyIndex][1]++;
            }
            i++;
        }
    }

}
