package Training.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NextIntException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print(">> input number : ");
                int number = scanner.nextInt();
                System.out.println("number = " + number);
                break;
            } catch (InputMismatchException e) {
                String typeError = scanner.next();
                System.out.printf("you type '%s', but it is not a number\n", typeError);
            } finally {

            }
        }

        scanner.close();
    }
}
