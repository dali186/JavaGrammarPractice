package Algorithm.BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Boj9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            int index = 0;
            String command = br.readLine();
            for(int j = 0; j < command.length(); j++) {
                if(command.charAt(j) == '(') {
                    index++;
                } else {
                    index--;
                    if(index < 0) {
                        index = 50;
                    }
                }
            }
            if(index == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
