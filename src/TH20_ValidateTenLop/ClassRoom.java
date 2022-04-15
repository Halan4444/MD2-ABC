package TH20_ValidateTenLop;

import TH20_VALIDATEACCOUNT.AccountExample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassRoom {
    private static final String CLASSROOM_REGEX = "^[CAP]\\d{4}[GHIKLM]$";
    public ClassRoom() {
    }
    public boolean validate (String regex) {
        Pattern pattern = Pattern.compile(CLASSROOM_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
