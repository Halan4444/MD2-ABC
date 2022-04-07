package TH13_OPTIONALALGORITHMCOMPLEXITY;

import java.util.Scanner;

public class AlgorithmComplexityTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        int[] frequentChar = new int [255];
        for (int i=0; i<inputString.length();i++) {
            int ascii = (int) inputString.charAt(i);
            frequentChar [ascii] += 1;

        }
        String str = inputString;

        int max = 0;
        char character = (char) 255;
        for (int j=0; j<255; j++) {
            if (frequentChar[j]>max) {
                max = frequentChar[j];
                character = (char) j;
            }
        }
        if (max == 1) {
            System.out.println("The most appearing letter is "+ str +" with a frequency of "+1+" times");
        } else {
            System.out.println("The most appearing letter is "+ character +" with a frequency of "+max+" times");
        }
//        System.out.println("The most appearing letter is "+ character +" with a frequency of "+max+" times");
//

    }

}
