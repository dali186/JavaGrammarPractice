package Algorithm.KNOU;

public class BinarySearchTest {
    //이진탐색 함수 구현
    public static void main(String[] args) {
        int ary[] = {10, 30, 25, 15, 40, 50, 45, 35};
        int left = 1;
        int right = ary.length-1;

        int result = BinarySearch(ary,left,right,45);
        System.out.println(result);
        System.out.println(ary[result]);
    }

    public static int BinarySearch(int[] ary, int left, int right, int x) {
        if(left > right) return -1; //탐색 실패
        int mid = (left + right) / 2;

        if(x==ary[mid]) return mid;
        else if(x < mid) BinarySearch(ary, left, mid-1, x);
        else BinarySearch(ary, mid+1, right, x);
        return left;
    }
}
