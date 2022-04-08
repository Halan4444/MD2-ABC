package TH15_INSERTATIONALGORITHMSETUP;


import java.util.Arrays;

public class Test {
    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};

    public static void main(String[] args) {
        System.out.println("Array before sort: "+Arrays.toString(list));
        insertionSort(list);
        System.out.println("Array after sort: "+Arrays.toString(list));
    }

    public static void insertionSort(int[] list) {
        int pos;
        int currentElement;
        for (int i = 1; i < list.length ; i++) {
            currentElement = list[i];
            System.out.println("Check1===== "+currentElement);
            pos = i;

            while (pos > 0 && currentElement < list[pos -1]){
                list[pos] = list[pos -1];
                pos--;
            }
            System.out.println("Check1===== "+list[pos]);
            System.out.println("Check2=========== "+currentElement);
            list[pos] = currentElement;
        }
    }
}
