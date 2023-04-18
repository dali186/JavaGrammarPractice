package Training.Algorithm;

public class MinNMax {

    public static void main(String[] args) {

        int array[] = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};

//        int max = Integer.MIN_VALUE;
//        int min = Integer.MAX_VALUE;
        int max = array[0];
        int min = array[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i + 1;
            }
            if (array[i] > max) {
                max = array[i];
                maxIndex = i + 1;
            }
        }
        System.out.println("max = " + max + ", Index is " + maxIndex);
        System.out.println("min = " + min + ", Index is " + minIndex);
    }
}
