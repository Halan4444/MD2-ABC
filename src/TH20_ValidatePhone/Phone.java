package TH20_ValidatePhone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {
    private static final String PHONE_REGEX = "^[0]+[3|9]+[0-9]{8}$";
    public Phone() {
    }
    public boolean validate (String regex) {
        Pattern pattern = Pattern.compile(PHONE_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
