package TH11_DAONGUOCCHUOI;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stackInteger = new Stack();
        stackInteger.push(5);
        stackInteger.push(4);
        stackInteger.push(3);
        stackInteger.push(2);
        stackInteger.push(1);

        System.out.println();

        System.out.println(" Array: ");
        for (Integer i: stackInteger) {
            System.out.print(i + " ");
        }
        System.out.println("\n Array after ");

        while (!stackInteger.isEmpty()) {
            System.out.print(stackInteger.pop()+ " ");
        }
        String fist = "CODEGYM VO DICH";
        String [] array = fist.split(" ");
        Stack <String>  stackString = new Stack();
        System.out.println();
        System.out.println("\n Array First: "+fist);
        for (int i=0; i<array.length;i++) {
            stackString.push(array[i]);
        }
        System.out.print("\n Array last: ");
        while(!stackString.isEmpty()) {
            System.out.print(stackString.pop()+"  ");
        }
    }


}
