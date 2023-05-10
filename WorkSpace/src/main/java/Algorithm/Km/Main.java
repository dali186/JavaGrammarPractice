package Algorithm.Km;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array1 = {2, 1, 4, 2, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {5, 2, 3, 4, 1};

        //sort() : 배열을 정렬
        Arrays.sort(array1);
        System.out.println("sort() : " + Arrays.toString(array1));

        //binarySearch() : 배열에서 원소를 이진 검색 (배열, 값)
        int searchIndex = Arrays.binarySearch(array2, 3);
        System.out.println("binarySearch() : " + searchIndex);

        //equals() : 두 배열이 같은지 비교
        boolean isEqual = Arrays.equals(array1, array2);
        System.out.println("equals() : " + isEqual);

        //fill() : 배열의 모든 원소를 특정 값으로 채움
        Arrays.fill(array3, 0);
        System.out.println("fill() : " + Arrays.toString(array3));

        //copyOf() : 배열을 복사 (배열, 배열의 길이)
        int[] copyOfArray1 = Arrays.copyOf(array1, array1.length);
        System.out.println("copyOf() : " + Arrays.toString(copyOfArray1));

        //stream() : 배열을 스트림 형식으로 변환
        Arrays.stream(array1).forEach(System.out::println);

        //asList() : 배열을 리스트 형식으로 변환
        System.out.println("asList() : " + Arrays.asList(array1));

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Cherry");
        arrayList.add("Date");

        arrayList.ensureCapacity(20);
        arrayList.trimToSize();
        arrayList.set(2, "Blueberry");
        arrayList.removeIf(string -> string.contains("B"));
        //List<String> list = arrayList.subList(1,3);
        //list.remove("Apple");
        arrayList.stream().forEach(System.out::println);

    }
}
