package TH13_SORTEDASCENDING;

import java.util.LinkedList;
import java.util.Scanner;

public class Ascending {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a string: ");
            String inputString = scanner.nextLine();

            LinkedList<Character> maxChars =  findMaxContiniousAscendingChar(inputString);

            System.out.println("Maximum ascending character:");
            for (Character element: maxChars) {
                System.out.print(element);
            }
        }

        public static LinkedList<Character> findMaxContiniousAscendingChar(String string){

            LinkedList<Character> maxChars = new LinkedList<>();
            LinkedList<Character> tempChars = new LinkedList<>();
            char currentChar;
            char nextChar;

            for (int i = 0; i < string.length();i++) {
                currentChar = string.charAt(i);
                tempChars.add(currentChar);
                for (int j = i+1; j <string.length() ; j++) {
                    nextChar = string.charAt(j);
                    if (nextChar > tempChars.getLast()){
                        tempChars.add(nextChar);

                    }
                }

                if (tempChars.size()>maxChars.size()){
                    maxChars.clear();
                    maxChars.addAll(tempChars);
                }
                tempChars.clear();
            }
            return maxChars;
        }
    }

