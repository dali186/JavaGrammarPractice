package Algorithm.BaekJoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Boj1655 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> min = new PriorityQueue<>();
        PriorityQueue<Integer> max = new PriorityQueue<>(Comparator.reverseOrder());

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int x = Integer.parseInt(br.readLine());

            if (max.size() == min.size()) {
                max.offer(x);
            } else {
                min.offer(x);
            }

            if (!min.isEmpty() && max.peek() > min.peek()) {
                min.offer(max.poll());
                max.offer(min.poll());
            }

            result.append(max.peek() + " \n");
        }
        System.out.println(result.toString());
    }
}
