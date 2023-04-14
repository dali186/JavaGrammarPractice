package Training.ArrayPractice;

import java.util.Arrays;

public class Practice02 {

    static int compare(int[] arr1, int[] arr2) {
        int index = arr1.length < arr2.length ? arr1.length : arr2.length;
        for(int i = 0; i < index; i++) {
            if(arr1[i] < arr2[i]) return -1;
            else if(arr1[i] > arr2[i]) return 1;
        }
        if(arr1.length != arr2.length) {
            int value = arr1.length < arr2.length ? arr2.length - arr1.length : arr1.length - arr2.length;
            return value;
        }
        return 0;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6};
        int b[] = {1,2,3,4,5,6};
        int c[] = {1,2,3,4,5,6,7};
        int d[] = {4,2,3,4,5,6};

        System.out.println(compare(a,b)); //0
        System.out.println(compare(a,c)); //1
        System.out.println(compare(a,d)); //-1
        System.out.println(compare(d,b)); // 1

        System.out.println();

        System.out.println(b.equals(a));
        System.out.println(Arrays.equals(a,b));
    }

}
