package StringStudy;

import java.util.Scanner;

public class Practice02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        for(int i = 0; i < T; i++) {
            int r = sc.nextInt();
            String s = sc.nextLine();
            String answer = "";
            for(int j = 0; j < s.length(); j++) {
                for(int k = 0; k < r; k++) {
                    answer += s.charAt(j);
                }
            }
            System.out.println(answer);
        }
    }
}
