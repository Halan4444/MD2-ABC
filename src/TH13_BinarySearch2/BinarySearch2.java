package TH13_BinarySearch2;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        int [] intArray;
        int findingValue;
        System.out.println("Enter a size: ");
        size = scanner.nextInt();
        intArray = intArray(size);
        System.out.println("Input Array: ");
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);

        System.out.println("Array sorted: ");
        System.out.println(Arrays.toString(intArray));
        System.out.println("finding value: ");
        findingValue = scanner.nextInt();
        System.out.println("Index of value in Array");
        System.out.println(binarySearch(intArray,0,size-1,findingValue));

    }

    public static int binarySearch(int[]array, int left, int right, int value) {
        while (left <= right) {
            int middle = (left + right)/2;
            if (array[middle] == value) {
                return middle;
            }
            if (value > array[middle]) {
               left = middle+1;
            }
            if (value < array[middle]) {
                right = middle - 1;
            }
            binarySearch(array,left,right,value);
        }
        return -1;
    }

    public static int [] intArray(int size) {
        int[] array = new int[size];
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        while (i < array.length) {
            System.out.println("Enter element "+(i+1)+": ");
            array[i] = scanner.nextInt();
            i++;
        }
        return array;
    }
}
