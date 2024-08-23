import java.util.Scanner;

public class CheckString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some input: ");
        if (scanner.hasNext()) {
            String input = scanner.next();
            System.out.println("You entered a string: " + input);
        } else {
            System.out.println("Not a valid string.");
        }
    }
}
