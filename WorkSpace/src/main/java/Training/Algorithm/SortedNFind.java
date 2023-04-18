package Training.Algorithm;

public class SortedNFind {

    public static void main(String[] args) {
        int array[] = {12, 25, 31, 48, 54, 66, 70, 83, 95, 108};
        //정렬되어 있으니
        System.out.println(binarySearch(array,88,0,array.length));
    }

    public static int binarySearch(int[] array, int value, int left, int right) {
        if(left > right) {
            System.out.println("Not Found");
            return 0;
        }

        int pivot = (left+right)/2;

        if (array[pivot] == value) {
            return pivot;
        }
        else if (array[pivot] < value) {
            return binarySearch(array, value, pivot+1, right);
        } else {
            return binarySearch(array, value, left, pivot-1);
        }

    }
}
