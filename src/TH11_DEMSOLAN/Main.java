package TH11_DEMSOLAN;

import java.util.Locale;

;

public class Main {

    public static void main(String[] args) {
        CountChar count = new CountChar();
        String stringInput = count.inputString().toUpperCase();
        char char_at = count.inputChar();
        System.out.println("Số lần xuất hiện: " + count.checkCharacter(stringInput,char_at));

    }
}
