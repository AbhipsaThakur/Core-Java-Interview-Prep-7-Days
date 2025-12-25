public class LeapYear {
    public static void main(String[] args) {
        int y = 2024;
        String s = ((y % 100 != 0) && (y % 4 == 0) || (y%400 == 0))? "Leap Year" : "Not a leap year";
        System.out.println(s);
    }
}
