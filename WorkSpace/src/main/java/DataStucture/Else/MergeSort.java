package DataStucture.Else;

public class MergeSort implements MySort {
    @Override
    public void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private void mergeSort(int[] array, int low, int high) {
        if (low >= high) return;

        int mid = low + ((low + high) / 2);

        mergeSort(array, low, mid);
        mergeSort(array, mid + 1, high);

        merge(array, low, mid, high);
    }

    private void merge(int[] array, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int idx = 0;

        int left = low;
        int right = mid + 1;

        while (left >= right && right <= high) {
            if (array[left] <= array[right]) {
                temp[idx] = array[left];
                left++;
            } else {
                //temp[idx]
            }
        }
    }
}
