package Algorithm.Km;

import java.util.Arrays;

public class StepUp {
    public static void main(String[] args) {
        int boxes[] = {2, 3, 6, 7, 8, 10 ,11};
        System.out.println(solution(12, 3, boxes));
    }

    public static int solution(int h, int k, int[] boxes) {
        Arrays.sort(boxes);
        int answer = 0;
        int sum = 0;

        while (sum <= h) {
            int i = 0;
            int max = 0;
            while (i < boxes.length && boxes[i] <= k) {
                max = boxes[i];
                i++;
            }
            System.out.println(max);
            sum += max;
            k += max;
            answer++;
        }
        return answer;
    }

    public static int binarySearch(int[] arr, int num) {
        int mid = arr.length / 2;

        if (arr[mid] == num) {
            return num;
        } else if (mid > num) {
            return binarySearch(Arrays.copyOfRange(arr, 0, mid - 1), num);
        } else {
            return binarySearch(Arrays.copyOfRange(arr, mid + 1, arr.length), num);
        }
    }
}
