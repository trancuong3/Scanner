import java.util.Scanner;

public class CheckInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter some input: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            System.out.println("You entered an integer: " + number);
        } else {
            System.out.println("Not an integer.");
        }
    }
}
