package Algorithm.Km;

import java.util.ArrayList;
import java.util.List;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(factorial(16));
        System.out.println(pascal(8));
    }

    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static int fibonacci(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static List<Integer> pascal(int n) {
        List<Integer> row = new ArrayList<>();
        if (n == 1) {
            row.add(1);
            return row;
        } else {
            row.add(1);
            List<Integer> preRow = pascal(n - 1);
            for (int i = 0; i < preRow.size() - 1; i++) {
                row.add(preRow.get(i) + preRow.get(i + 1));
            }
            row.add(1);
        }
        return row;
    }
}
