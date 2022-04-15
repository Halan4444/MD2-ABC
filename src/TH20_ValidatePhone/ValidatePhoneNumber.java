package TH20_ValidatePhone;

import TH20_ValidateTenLop.ClassRoom;

public class ValidatePhoneNumber {
    private static Phone phone;
    public static final String[] validPhoneNumber = new String[] {"0915924251","0312524251","0912924251","0312924251" };
    public static final String[] invalidPhoneNumber = new String[] { ".@", "12345", "1234_", "abcde" };

    public static void main(String[] args) {
        phone = new Phone();
        for (String num : validPhoneNumber) {
            boolean isValid = phone.validate(num);
            System.out.println("Classroom is "+num+" is valid "+isValid);
        }

        for (String num : invalidPhoneNumber) {
            boolean isValid = phone.validate(num);
            System.out.println("Classroom is "+num+" is valid "+isValid);
        }
    }
}
