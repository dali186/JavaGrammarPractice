package Algorithm.BaekJoon;

import java.util.Scanner;

public class Boj10773 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int nums[] = new int[N];
        int index = 0;

        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();

            if(num == 0) {
                nums[index-1] = 0;
                index--;
            } else {
                nums[index] = num;
                index++;
            }

        }
        int sum = 0;
        for(int i = 0; i < N; i++) {
            sum += nums[i];
        }
        System.out.println(sum);
    }
}
