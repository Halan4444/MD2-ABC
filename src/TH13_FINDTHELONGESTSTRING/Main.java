package TH13_FINDTHELONGESTSTRING;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Insert a String: ");
        Scanner sc = new Scanner(System.in);

        String inputString = sc.nextLine();

        LinkedList<Character> maxlist = new LinkedList<>();
        for (int i =0; i < inputString.length();i++) {
            LinkedList <Character> tempList = new LinkedList<>();
            tempList.add(inputString.charAt(i));
            for (int j= i+1; j < inputString.length();j++) {
                if (inputString.charAt(j) > tempList.getLast()) {
                    tempList.add(inputString.charAt(j));
                }
            }
            if (tempList.size() > maxlist.size()) {
                maxlist.clear();
                maxlist.addAll(tempList);
            }
            tempList.clear();
        }
        for (Character ch : maxlist) {
            System.out.print(ch);
        }
    }

}
