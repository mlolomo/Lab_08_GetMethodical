import java.util.Scanner;

public class DevTest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Part A: Test getNonZeroLenString
        String name = SafeInput.getNonZeroLenString(in, "Enter your name");
        System.out.println("You entered: " + name);

        // Part B: Test getInt
        int number = SafeInput.getInt(in, "Enter your favorite integer");
        System.out.println("You entered: " + number);

        // Part C: Test getDouble
        double favDouble = SafeInput.getDouble(in, "Enter a decimal number");
        System.out.println("You entered: " + favDouble);

        // Part D: Test getRangeInt
        int age = SafeInput.getRangedInt(in, "Enter an integer", 18, 35);
        System.out.println("You entered: " + age);


        // Part E: Test getRangeDouble
        double score = SafeInput.getRangedDouble(in, "Enter a score", 0.0, 100.0);
        System.out.println("You entered: " + score);

        //Part F: getYNConfirm
        boolean confirm = SafeInput.getYNConfirm(in, "Do you want to continue");
        System.out.println("You selected: " + (confirm ? "Yes" : "No"));

        //Part G: getRegExString
        String mNum = SafeInput.getRegExString(in, "Enter UC M number (M#####)", "^(M|m)\\d{5}$");
        System.out.println("M Number entered is: " + mNum);
    }
}
