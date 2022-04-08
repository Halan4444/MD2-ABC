package TH15_INSERTATIONALGORITHMSETUP;

public class Main {

    static int[] list = {2, 3, 2, 5, 6, 1, -2, 3, 14, 12};


public static void insertionSort(int[]list) {
    int pos;
    int currentElement;

    for (int i = 1; i<list.length;i++) {
        currentElement = list[i];
        pos = i;
        while (pos>0 && currentElement < list[i-1]) {
            list[pos] = list[i-1];
            pos--;
        }
        list[pos] = currentElement;
    }

}
}
