import java.util.Scanner;

public class Even_odd_program {
    public static void main (String[] arg) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int a = scanner.nextInt();
        if (a % 2 == 0) {
            System.out.println("Your number is Even");
        } else {
            System.out.println("Your number is odd");
        }

    }
}
