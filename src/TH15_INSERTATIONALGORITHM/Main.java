package TH15_INSERTATIONALGORITHM;

import com.sun.scenario.effect.impl.sw.java.JSWBlend_SRC_OUTPeer;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        System.out.println("Enter list size: ");
        size = sc.nextInt();
        int[] list = new int[size];
        System.out.println("Enter values ~ ");
        for (int i =0; i<list.length;i++) {
            System.out.println("Enter the values: "+(i+1));
            list[i] = sc.nextInt();
        }
        System.out.println("Your input list "+ Arrays.toString(list));
        System.out.println("\nBegin sort processing...");
        System.out.println();
        insertionSortStepByStep(list);
    }

    public static void insertionSortStepByStep(int[] list) {
        int currentElement;
        int pos;

        for (int i=1; i<list.length; i++) {
            currentElement = list[i];
            pos = i;
            while(pos>0 && currentElement < list[pos-1]) {
                System.out.println("Move "+list[pos-1]+" to backward");
                list[pos] = list[pos-1];
                pos--;
            }
            System.out.println("Replace "+currentElement+" to backward "+list[pos]);
            list[pos] = currentElement;
            System.out.println("List after the "+i+" sort "+Arrays.toString(list));
        }
    }

}
