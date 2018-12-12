
public class LeapYear {
    public static boolean isLeapYear(final int input) {
        return  (input % 400 == 0 || (input % 4 == 0 && input % 100 != 0));
    }
}
