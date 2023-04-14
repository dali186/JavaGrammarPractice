package Training.ArrayPractice;

public class Practice03 {

    static int[] copy(int[] source) {
        int[] copied = new int[source.length];
        for(int i = 0; i < source.length; i++) {
            copied[i] = source[i];
        }
        return copied;
    }

    static int[][] copy(int [][] source) {
        int[][] copied = new int[source.length][source[0].length];
        for(int i = 0; i < source.length; i++) {
            for(int j = 0; j < source[0].length; j++) {
                copied[i][j] = source[i][j];
            }
        }
        return copied;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9,10,11,12};
        int copiedArr[] = copy(arr);
        for(int i = 0; i < copiedArr.length; i++) {
            System.out.print(copiedArr[i] + " ");
        }

        int arrs[][] = {{1,2,3}, {1,2,3,4}, {1,2}};

    }

}
