package TH20_ValidateTenLop;

public class ClassRoomValidate {
    private static ClassRoom classRoom;
    public static final String[] validClass = new String[] {"C0318G", "P0318H","A0218I","P0118K","P0218M"};
    public static final String[] invalidClass = new String[] { ".@", "12345", "1234_", "abcde" };

    public static void main(String[] args) {
        classRoom = new ClassRoom();
        for (String classroom : validClass) {
            boolean isValid = classRoom.validate(classroom);
            System.out.println("Classroom is "+classroom+" is valid "+isValid);
        }

        for (String classroom : invalidClass) {
            boolean isValid = classRoom.validate(classroom);
            System.out.println("Classroom is "+classroom+" is valid "+isValid);
        }
    }


}
