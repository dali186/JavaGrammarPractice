package Training.ArrayPractice;

public class Practice01 {

    public static void main(String[] args) {

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {1, 2, 3, 4, 5};
        int arr3[] = {1, 2, 3, 4, 5, 6};
        int arr4[][] = {{1,2},{3,4}, {5,6}};
        int arr5[][] = {{1,2},{3,4}, {5,6}};
        int arr6[][] = {{1,2},{3,4}, {5,6,7}};

        System.out.println(equals(arr4, arr5));
    }

    static boolean equals(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    static boolean equals(int[][] arr1, int[][] arr2) {
        if(arr1.length != arr2.length) return false;
        for(int i = 0; i < arr1.length; i++) {
            if(arr1[i].length != arr2[i].length) return false;
            for(int j = 0; j < arr1[i].length; j++) {
                if(arr1[i][j] != arr2[i][j]) return false;
            }
        }
        return true;
    }
}
